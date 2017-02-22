package astraea.spark

import org.apache.spark.sql.SparkSession

object SparkExample extends App {
  val spark = SparkSession
    .builder()
    .appName("SparkExample")
    .master("local")
    .getOrCreate()

  val numbers = spark.sparkContext.makeRDD(Seq.fill(1000)(util.Random.nextGaussian()))
  val stats = numbers.stats()
  println(stats)
}
