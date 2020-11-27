
//Val is not mutable
//Var is mutable
//Name cannot be
val nameStr: String = "Testing";
val name: String  = "Derrick"
val surname: String = "Maila"
var age:Int = 20
var greeting:String?  = "How are you?"
var test:String? = null

fun getGreetings():String{
    return "Hello kotlin function"
}

fun sayHello():Unit{
    println(getGreetings())
}

fun getName(firstName:String,lastName:String){
    var msg = "Hello, " + firstName + " String template  =  $firstName"
     msg+= lastName + " template lastName $lastName"
    println(msg)
}

fun main(){

    if(greeting != null){
        println(greeting)
    }else{
        greeting = ""
        println(greeting)
    }
    when(greeting){
        null -> println("Hi")
        else -> println(greeting)
    }
    println("Hello, " + name  + " " + surname + " " + "you are " + age + " years old"  )

    val greetToPrint = if(greeting != null) greeting else "Hi"
    val greetingWhen = when(greeting) {
        null -> "Hi"
        else -> greeting
    }
    println(getName("Derrick","Maila"))
    println(getName(" Maila","Maila"))
    println(greetToPrint)
    println(greetingWhen)
    println(getGreetings())



}



