object ImplicitParameters {

  def main(args: Array[String]) {
    val message = "Hello "
    implicit val name = "world"
    def display(implicit str : String) = message + str

    // Implicit parameter will be passed here
    val result = display

    // Implicit parameters will not be passed
    val result2 = display("developer")
    println("With Implicit parameters:")
    println(result)
    println("Without Implicit parameters:")
    println(result2)
  }
}
