package sn.uadb.bigdata.ml

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

trait SparkSessionTrait {

  val sparkConf: SparkConf =
    new SparkConf()
  // TODO: Comment the following two lines before packaging.
      .setAppName("Predict San Francisko Airbnb Price")
      .setMaster("local[4]")

  lazy val spark: SparkSession = {
    SparkSession
      .builder()
      .config(sparkConf)
//      .enableHiveSupport()
      .getOrCreate()
  }
}
