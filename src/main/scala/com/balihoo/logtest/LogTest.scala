package com.balihoo.logtest

import org.slf4s.Logging

class LogTest extends Logging {
  def doSomething = {
    val thingCount = 144
    log.warn(s"There are $thingCount things.")
    try {
      val cause = new NullPointerException("Can't touch this!")
      throw new IllegalStateException("It didn't work.", cause)
    } catch {
      case e: IllegalStateException => log.error("There was a problem.", e)
    }
    log.info("All done doing stuff.")
  }
}

object LogTest {
  def main(args: Array[String]) = {
    val test = new LogTest
    test.doSomething
  }
}
