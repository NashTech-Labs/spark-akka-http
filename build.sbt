name := "spark-akka-http"

version := "1.0"

scalaVersion := "2.11.8"

organization := "com.knoldus"

libraryDependencies ++= Seq(
  "org.apache.spark"  %% "spark-core" % "2.0.0-preview",
  "com.typesafe.akka" %% "akka-actor" % "2.4.6",
  "com.typesafe.akka" %% "akka-stream" % "2.4.6",
  "com.typesafe.akka" %% "akka-http-experimental" % "2.4.6",
  "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.4.6",
  "com.typesafe.akka" %% "akka-http-testkit" % "2.4.6"
)
