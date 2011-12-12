package com.timing.result

import com.timing.event.TimingStatistics
import com.mongodb.casbah.MongoDB
import com.timing.TimingSupport
import com.novus.salat._
import com.novus.salat.global._

/**
 * @author chris_carrier
 * @version 12/9/11
 */


trait MongoResultHandling extends TimingResultHandling { self: TimingSupport =>

  def db: MongoDB
  def collectionName = "timingResults"

  def handleResults {
    val stats = getStats
    val dbo = grater[List[TimingStatistics]].asDBObject(stats)
    db(collectionName) += dbo
  }
}