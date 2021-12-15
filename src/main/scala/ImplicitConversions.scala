import scala.language.implicitConversions

object ImplicitConversions {

  def main(args: Array[String]) {
    implicit def doubleToInt(double: Double): Int = double.toInt
    val number: Int = 4.5
    println(number)
  }
}
