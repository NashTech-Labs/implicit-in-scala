object TypeClass {

  trait CanTalk[A] {
    def talk(x: A): String
  }

  final case class Person(firstName: String, lastName: String)
  final case class Dog(name: String)

  implicit object PersonCanTalk extends CanTalk[Person] {
    def talk(x: Person) = s"Hi, I'm ${x.firstName}"
  }
  implicit object DogCanTalk extends CanTalk[Dog] {
    def talk(x: Dog) = s"Woof, my name is ${x.name}"
  }
  implicit class TalkUtil[A](x: A) {
    def talk(implicit makesTalk: CanTalk[A]) = {
      makesTalk.talk(x)
    }
  }

  def main(args: Array[String]) {
    println(Person("Jack", "Miller").talk)
    println(Dog("Romeo").talk)
  }

}
