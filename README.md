# MapReduceSample
#1
#2
#3
1. sbt package
2. hadoop fs -mkdir /user/abhi/wordcount/
3. hadoop fs -put mapreducesample_2.11-1.0.jar /user/abhi/wordcount/
4. hadoop fs -mkdir -p /user/abhi/wordcount/input/
5. hadoop fs -put yarn-site.xml /user/abhi/wordcount/input/
6. hadoop jar mapreducesample_2.11-1.0.jar /user/abhi/wordcount/input/yarn-site.xml /user/abhi/wordcount/output/
7. hadoop fs -cat /user/abhi/wordcount/output/part-r-00000
