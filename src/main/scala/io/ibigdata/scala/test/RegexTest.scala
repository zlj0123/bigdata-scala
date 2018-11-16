package io.ibigdata.scala.test

object RegexTest extends App{
  val wsnumwsPattern = """\s+[0-9]+\s+""".r

  for(matchString <- wsnumwsPattern.findAllIn(" 99 bottles, 98 bottles"))
    println(matchString)
}
