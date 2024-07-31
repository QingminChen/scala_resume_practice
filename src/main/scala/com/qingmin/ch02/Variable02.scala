package main.scala.com.qingmin.ch02

object Variable02 {
    def main(arg: Array[String]): Unit = {
      var name : String  = "Qingmin" // mutable initialization is required
      print(name)
      val email : String = "cqm22222222@hotmail.com"//immutable
      name = "Qingmin2" //

      var city = "Shanghai"  // val is pretty much similar with final in Java
      // val used more frequently than var
      // java.lang.String immutable string in Java
      /*
      * String s = " a b "
      * s.trim()
      * System.out.println("!"+s+"!")
      * =============================
      * result:(! a b !)
      * */
      // when final describe a class, it means this class doesn't have sub-class
      // StringBuilder/StringBuffer mutable string in Java


    }
}
