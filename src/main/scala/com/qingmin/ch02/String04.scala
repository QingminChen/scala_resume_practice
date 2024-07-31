package main.scala.com.qingmin.ch02

object String04 {
    def main(arg: Array[String]) : Unit = {
      val name = "Qingmin"
      val age = 40
      println("{ \"name\" : \"Qingmin\", \"age\" : 30 }") //Json in Scala
      //how to concate a string
      println("{ \"name\" : \"Qingmin\", \"age\" : 30 }") //Json in Scala

      //Placeholder in Scala, it can't be used for Json
      printf("name=%s\n", name)
      println(s"name=${name}")

      // multi-line string, used for sql and Json
      // here pipe is the Outdent 顶格
      println(
        """
          |hello
          |Qingmin
          |""".stripMargin)

      println(
        """
          hello
          |Qingmin
          |""".stripMargin)

      println(
        """
          #hello
          #Qingmin
          #""".stripMargin('#'))  //Here you need to use single quotation

      println(
        s"""
          | {"name":"${name}", "age":${age}}
          |""".stripMargin)

      println(
        """
           | select *
           | from user
           | where id=1
           |""".stripMargin)


    }
}
