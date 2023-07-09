ThisBuild / scalaVersion := "3.2.1"
ThisBuild / organization := "org.d12k"
ThisBuild / version      := "0.0.0-SNAPSHOT"

lazy val root = (project in file("."))
  .aggregate(api, lib, cli)
  .settings(
    name := "tic-tac-toe-root"
  )

lazy val api = (project in file("api"))
  .settings(
    name := "tic-tac-toe-api"
  )

lazy val lib = (project in file("lib"))
  .dependsOn(api)
  .settings(
    name := "tic-tac-toe-lib",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.16",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.16" % "test"
  )

lazy val cli = (project in file("cli"))
  .dependsOn(api, lib)
  .settings(
    name := "tic-tac-toe-cli"
  )
