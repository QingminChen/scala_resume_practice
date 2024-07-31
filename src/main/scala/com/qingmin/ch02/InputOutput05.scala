package main.scala.com.qingmin.ch02

import java.io.PrintWriter
import scala.io.Source

object InputOutput05 {
    def main(arg : Array[String]) : Unit = {
      //val age : Int  = scala.io.StdIn.readInt()
      //println(age)
      val source = Source.fromFile("/Users/chenqingmin/pod-exec1-log.txt")
      val iter : Iterator[String] = source.getLines()
      //while ( iter.hasNext ) {
      //  println(iter.next())
      //}
      source.close()

      //TODO scala has no output
      val out = new PrintWriter("/Users/chenqingmin/testScalaOutput")
      out.println("testScala1")
      out.println("testScala2")
      out.flush()
      out.close()
    }
}
