package c07sec03 {
  package people {
    class Person(val name: String) {
      val friends = new collection.mutable.ArrayBuffer[Person]
      // Doesn't pick up collection from com.horstmann.collection
      def description = name + " with friends " + 
        friends.map(_.name).mkString(", ")
    }
  }
}


// Run as scala com.horstmann.collection.Main

package com.horstmann.collection {
  object Main12 extends App {
    val fred = new    c07sec03.people.Person("Fred")
    val wilma = new c07sec03.people.Person("Wilma")
    val barney = new c07sec03.people.Person("Barney")
    fred.friends += wilma
    fred.friends += barney
    println(fred.description)
  }  
}
