package com.timing.result

import com.timing.TimingSupport

/**
 * @author chris_carrier
 * @version 12/9/11
 */


trait SimpleResultFormatting extends TimingResultFormatting { self: TimingSupport =>

  def formatStats: String = {
    val stats = getStats
    val stringResult = stats.map(x => "%s | %dns | %dns" format(x.key, x.averageTime, x.totalTime))

    stringResult.foldLeft("Key | Average | Total")((a, b) => "\n%s\n%s" format (a, b))
  }
}