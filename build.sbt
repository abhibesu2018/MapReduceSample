name := "MapReduceSample"
  
version := "1.0"
  
scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.apache.hadoop" % "hadoop-hdfs" % "3.1.0",
  "org.apache.hadoop" % "hadoop-client" % "3.1.0"
)
