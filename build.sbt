name := "Spark Skeleton"

organization := "Astraea"

version      := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "2.1.0",
  "org.apache.spark" %% "spark-mllib" % "2.1.0",
  "org.scalatest" %% "scalatest" % "3.0.1" % Test
)
