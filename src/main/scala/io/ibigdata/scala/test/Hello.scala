package io.ibigdata.scala.test

class Hello {
  def sayHello(name:String): Unit = {
    println(name)
    println(f"Hello $name")

    var n = 5
    val x = {n -= 1}
    println(x)
  }
}
