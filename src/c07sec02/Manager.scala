package c07sec02 {
  package horstmann {
    package impatient {
      class Manager {
        // The following doesn't work:
        // val subordinates = new collection.mutable.ArrayBuffer[Employee]
        val subordinates = new _root_.scala.collection.mutable.ArrayBuffer[Employee]
        def description = "A manager with " + subordinates.length + " subordinates"
      }
    }
  }
}

package c07sec02 {
  package horstmann {
    package collection {
      // ...
    }
  }
}
