package com.knoldus

import akka.actor._
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer

object SparkServer extends App with SparkServices {
  implicit val system = ActorSystem("spark-akka-http")
  implicit val materializer = ActorMaterializer()
  implicit val executionContext = system.dispatcher

  val bindingFuture = Http().bindAndHandle(route, "localhost", 8001)

  println(s"Server online at http://localhost:8001/")
}
