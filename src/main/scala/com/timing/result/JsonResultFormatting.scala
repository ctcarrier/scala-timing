package com.timing.result

import net.liftweb.json.Serialization._
import com.timing.TimingSupport
import net.liftweb.json.DefaultFormats


/**
 * @author chris_carrier
 * @version 12/9/11
 */


trait JsonResultFormatting extends TimingResultFormatting { self: TimingSupport =>

  implicit def formats = DefaultFormats

  def formatStats: String = {
    val stats = getStats
    write(stats)
  }

}