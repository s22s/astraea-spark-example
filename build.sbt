name := "Spark Skeleton"

organization := "Astraea"

version      := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "2.1.0",
  "org.apache.spark" %% "spark-mllib" % "2.1.0",
  "org.scalatest" %% "scalatest" % "3.0.1" % Test
)

// This settings allows you to run `sbt console` and have a spark shell configured with
// the dependencies above included.
initialCommands in console := """
import org.apache.spark._
import org.apache.spark.sql._

val spark = SparkSession
  .builder()
  .appName(s"${sys.props.getOrElse("user.name", "Someone")}'s Shell")
  .master("local[*]")
  .getOrCreate()

import spark.implicits._
"""
