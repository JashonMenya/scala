package com.jmenya

import org.scalatest.funsuite.AnyFunSuite

class CubeCalculatorTest  extends AnyFunSuite:
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)

    assert(CubeCalculator.cube(3) == 0)
}
