package com.timing.result

import akka.event.slf4j.Logging
import com.timing.event.TimingStatistics
import com.timing.TimingSupport

/**
 * @author chris_carrier
 * @version 12/9/11
 */


trait Slf4jResultHandling extends TimingResultHandling { self: Logging with TimingResultFormatting with TimingSupport =>

  def handleResults {
    log.info(formatStats)
  }
}