
name := "$name;format="norm"$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala_version$"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "$scalatest_version$" % Test
)
