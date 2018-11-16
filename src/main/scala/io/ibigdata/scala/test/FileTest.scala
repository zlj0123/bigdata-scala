package io.ibigdata.scala.test

import scala.io.Source

class FileTest {
  def displayFileContextByLine (filePath :String): Unit = {
    val source = Source.fromFile(filePath,"UTF-8")
    val lineIterator = source.getLines();

    for (line <- lineIterator)
      println(line)

    source.close()
  }

  def displayFileContextByChar (filePath :String): Unit = {
    val source = Source.fromFile(filePath,"UTF-8")

    for (c <- source)
      println(c)

    source.close()
  }

  def readFileFormUrl(url:String): Unit = {
    val source = Source.fromURL(url,"UTF-8")
    val lineIterator = source.getLines();
    for (line <- lineIterator)
      println(line)

    source.close()
  }
}

object FileTest extends App {
  val fileTest = new FileTest
  fileTest.displayFileContextByLine("./src/main/scala/io/ibigdata/scala/test/FileTest.scala")
  //fileTest.displayFileContextByChar("./src/main/scala/io/ibigdata/scala/test/FileTest.scala")

  //fileTest.readFileFormUrl("https://www.elastic.co/guide/en/elasticsearch/reference/6.5/release-notes-6.5.0.html#release-notes-6.5.0")

  import scala.sys.process._

  println("pwd".!!)

}