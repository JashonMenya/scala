ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.3"

lazy val root = (project in file("."))
  .settings(
    name := "sbt-example-project",
    idePackagePrefix := Some("com.jmenya")
  )

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1"