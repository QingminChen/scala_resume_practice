package main.scala.com.qingmin.ch02

import java.net.{ServerSocket, Socket}

object NetworkServer07 {
   def main(arg : Array[String]) : Unit = {
     val server = new ServerSocket(9999)
     val client :Socket = server.accept()

   }
}
