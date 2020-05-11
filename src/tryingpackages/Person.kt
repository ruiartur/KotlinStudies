package tryingpackages

open class Person {

    lateinit var name: String
    var age: Int = 0
     get() {
         println("Customize default get")
         return field
     }
    set(value) {
        println("Customize default set")
        field = value
    }
    fun override(i: Int , s :String=  ""){
        println("print 1")
    }

    object MyStaticExample {
             val STATIC = "static"
    }

}

interface  SuperHuman {}

// Inheritance example
class Human : Person()  {}

// Implements example
class NormalHuman : SuperHuman{}

// Inheritance + Implements example
class OrdinaryHuman : Person(), SuperHuman {}