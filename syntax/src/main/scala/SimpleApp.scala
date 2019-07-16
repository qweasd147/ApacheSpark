import org.apache.spark.sql.SparkSession

object SimpleApp {
  def main(args: Array[String]): Unit = {


    val spark = SparkSession.builder()
      .appName("SampleApp")
      .master("local[*]")
      .getOrCreate()

    val sc = spark.sparkContext
    val filePath = "file pull path"
    val inputRDD = sc.textFile(filePath)
    val matchTerm = "spark"
    val numMatches = inputRDD.filter(_.contains(matchTerm)).count()
    println("%s lines in %s contains %s".format(numMatches, filePath, matchTerm))
    System.exit(0)
  }
}
