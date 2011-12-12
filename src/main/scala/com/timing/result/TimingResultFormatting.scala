package com.timing.result

import com.timing.TimingSupport

/**
 * @author chris_carrier
 * @version 12/9/11
 */


trait TimingResultFormatting { self: TimingSupport =>
  
  def formatStats: String

}