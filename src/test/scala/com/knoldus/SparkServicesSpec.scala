package com.knoldus

import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{ FlatSpec, Matchers }

class SparkServicesSpec extends FlatSpec with SparkServices with Matchers with ScalatestRouteTest {
  "Spark Services" should "be able to get spark version" in {
    Get(s"/version") ~> route ~> check {
      status shouldBe StatusCodes.OK
      responseAs[String] shouldBe "<h1>Spark version in this template is: 2.0.0-preview</h1>"
    }
  }
}
