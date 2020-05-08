package tryingpackages

open class Person constructor(){

    constructor(name : String, age : Int)

    var age: Int = 0
     get() {
         println("Customize default get")
         return field
     }
    set(value) {
        println("Customize default set")
        field = value
    }
}

// Inheritance example
class Human : Person() {

}
