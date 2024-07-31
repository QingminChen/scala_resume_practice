package main.scala.com.qingmin.ch02

object Identifier03 {//class name, object name, attribute name, method name, parameter name
  /* Identifier:
  * 1. numberic, alphabet, underscore, dollar symbol
  * 2. number cannot be leading word
  * 3. no restraint on length
  * 4. can not be keywords or reserved word/ if you insist on using keyword, you can use backtick
  * 5. up-lower case are sensitive
  * 6. Chinese/Japanese are okay
  * 7. Special symbols is okay, dollar is not recommended
  * */
  def main(arg: Array[String]): Unit = {
    var 楽しい = "happy"
    println(楽しい)
    var `var` = "Qingmin"
    println(`var`)
    var * = "Qingmin2"
    println(*)
  }

}
