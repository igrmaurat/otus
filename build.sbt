name := "Spark_Crime_Boston"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "2.4.7" % Provided
 //"org.apache.spark"%%"spark-sql"%"2.4.7"
)