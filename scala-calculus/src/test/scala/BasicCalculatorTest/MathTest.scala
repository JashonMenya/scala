package com.jmenya
package BasicCalculatorTest

import BasicCalculator.Math

import org.scalatest.funsuite.AnyFunSuite

class MathTest extends AnyFunSuite:
  test("Math.add") {
    assert(Math.add(1,3) === 4)
  }

  test("Math.subtract") {
    assert(Math.subtract(4, 2) === 2)
  }

  test("Math.multiply") {
    assert(Math.multiply(5, 10) === 50)
  }


