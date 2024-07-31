package main.scala.com.qingmin.ch02

import java.io.{BufferedReader, InputStreamReader, OutputStream}
import java.net.{ServerSocket, Socket}

object NetworkClient06 {
  def main(arg : Array[String]) : Unit = {
    val server = new Socket("localhost",9999)

      val out: OutputStream = server.getOutputStream
      out.write(100)
      out.close()
      server.close()

  }

}
