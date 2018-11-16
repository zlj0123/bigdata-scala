package io.ibigdata.scala.test

object ArrayTest extends App {
  println("Array Test")

  val arrs = Array("Hello", "world");
  arrayDisplay(arrs)

  arrs(0) = "change"
  arrayDisplay(arrs)

  val intArray = new Array[Int](10)
  arrayDisplay(intArray)

  val result = for (i <- intArray) yield i+1
  arrayDisplay(result)

  def arrayDisplay(arrList: Array[_]): Unit = {
    for (arr <- arrList)
      println(arr)
  }
}
