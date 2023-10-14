package com.jmenya

import BasicCalculator.Math


object MainApp {
  def main(args: Array[String]): Unit = {
    runner(println)
  }

   def runner(output: String => Unit): Unit = {
    val input1 = 3
    val input2 = 3
    val sum = Math.add(input1, input2)
    output(s"The sum of $input1 and $input2 is: $sum")
  }
}

