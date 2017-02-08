package object people {
  val defaultName = "John Q. Public"
}

object Main2 extends App {
  val john = new Person
  println(john.description)
}

// Run as scala com.horstmann.impatient.Main

class Person {
    var name = "hehe" // A constant from the package
    def description = "A person with name " + name
  }
