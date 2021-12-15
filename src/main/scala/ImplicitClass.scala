object ImplicitClass {

  implicit class StringOps(str: String) {
    def yell = str.toUpperCase() + "!"
    def isQuestion = str.endsWith("?")
  }

  def main(args: Array[String]) {
    println("Hello world".yell)
    println("How are you?".isQuestion)
  }
}
