ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.1"

lazy val root = (project in file("."))
  .settings(
    name := "scala-calculus",
    idePackagePrefix := Some("com.jmenya")
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15"

coverageMinimumStmtTotal := 80
coverageFailOnMinimum := false
coverageHighlighting := true

