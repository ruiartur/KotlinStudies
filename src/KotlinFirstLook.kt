import tryingpackages.Person

fun nullSafeStudy(){
    var myNullString: String? = null
    println(myNullString?.length)
    myNullString = "New String Name"
    println(myNullString.length)
}

fun stringConcatenationStudy (){
    var myInt = 0
    for (i in 1..10){
        println("print my numbers, current number is $i")
    }
}

fun tryNewSyntax() = println("this Kotlin new way of fuction rocks")

fun whenStudyCaseWithDefaultParameter(myFirstArgument: String, mySecondArgument: String = "This is a default value"){
   var myLocalString = myFirstArgument
    when(mySecondArgument){
        "This is a default value" ->{
            myLocalString = mySecondArgument
        }
    }
    println(myLocalString)
}

fun usingStep() {
    for(i in 0..20 step 2){
        println(" $i")
    }
}

fun <T> usingVararg (vararg  values : T) {
    for (value in values) {
        println(value)
    }
}

fun main(){
    nullSafeStudy()
    stringConcatenationStudy()
    tryNewSyntax()
    whenStudyCaseWithDefaultParameter("Hello World")
    whenStudyCaseWithDefaultParameter("Hello Kotlin World", "Hello World")
    usingStep()
    usingVararg("test", true, 100, 48f, null)

    println(Person.MyStaticExample)


    val person = Person()
    person.age = 21
    person.override(1);
}