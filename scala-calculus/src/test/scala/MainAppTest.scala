package com.jmenya

import org.scalatest.funsuite.AnyFunSuite

class MainAppTest extends AnyFunSuite{
  test("MainApp.runner") {
    var capturedOutput: Option[String] = None

    def testOutput(s: String): Unit = {
      capturedOutput = Some(s)
    }

    MainApp.runner(testOutput)

    assert(capturedOutput.isDefined)
    assert(capturedOutput.get == "The sum of 3 and 3 is: 6")
  }
}
