package c07sec05.people

package object people {
  val defaultName = "John Q. Public"
}

object Main15 extends App {
  val john = new c07sec05.people.Person
  println(john.description)
}

// Run as scala com.horstmann.impatient.Main

class Person {
    var name = "9090" // A constant from the package
    def description = "A person with name " + name
  }
