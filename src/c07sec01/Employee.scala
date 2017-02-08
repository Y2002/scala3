package com {
  package horstmann {
    package impatient {
      class Employee(id: Int) {
        def description = "An employee with id " + id
      }      
    }
  }
}

package org {
  package bigjava {
    class Counter {
      private var value = 0 
      def increment() { value += 1 } 
      def description = "A counter with value " + value
    }
  }
}

object Main11 extends App {
  val fred = new com.horstmann.impatient.Employee(1729)
  val wilma = new c07sec01.Manager("Wilma")
  val myCounter = new org.bigjava.Counter
  println(fred + ": " + fred.description)
  println(wilma + ": " + wilma.description)
  println(myCounter + ": " + myCounter.description)
}
