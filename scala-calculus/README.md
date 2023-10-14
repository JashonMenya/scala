# Scala Testing Quickstart with AnyFunSuite

A quick guide to getting started with testing in Scala using `AnyFunSuite` from ScalaTest.

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)
- [Writing Tests](#writing-tests)
- [Running Tests](#running-tests)
- [Code Coverage with Scoverage](#code-coverage-with-scoverage)
  - [Installation](#scoverage-installation)

## Introduction

[`AnyFunSuite`](https://www.scalatest.org/scaladoc/3.2.9/org/scalatest/funsuite/AnyFunSuite.html) from ScalaTest provides a straightforward approach to write tests in a functional way, where test cases are essentially functions.

## Installation

Ensure you have the following dependencies in your `build.sbt`:

```scala
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test
```

Optionally, you can also include a testing framework for better integration with SBT, like ScalaTest's own:

```scala
testFrameworks += new TestFramework("org.scalatest.tools.Framework")
```

## Writing Tests

Using AnyFunSuite, tests can be written in a very straightforward manner:

```scala
import org.scalatest.funsuite.AnyFunSuite

class SampleTest extends AnyFunSuite {

  test("An example test") {
    assert(1 + 1 === 2)
  }

}
```

In the above example, we define a test named "An example test" and an assertion that 1 + 1 should equal 2.

## Running Tests

Using SBT
Run all tests in the project:

```scala
sbt test
```

Run a single test suite:

```
sbt "testOnly *SampleTest"
```

## Code Coverage with Scoverage

[Scoverage](https://github.com/scoverage/sbt-scoverage) is a popular tool for measuring the code coverage of your Scala tests. Here is how you can add and use Scoverage with your Scala SBT project.

### Scoverage Installation

Add the following Scoverage plugin to your `project/plugins.sbt` file:

```scala
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.9.2")
```
