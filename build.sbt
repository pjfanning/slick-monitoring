name := "slick-monitoring"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.2.3",
  "com.zaxxer" % "HikariCP" % "3.2.0",
  "com.h2database" % "h2" % "1.4.197",
  "com.github.gquintana.metrics" % "metrics-sql" % "3.2.1",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)