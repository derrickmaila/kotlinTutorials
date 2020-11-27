fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[1])
    println(interestingThings.get(1))

    for (interestingThing in interestingThings) {
        println(interestingThing)

    }

    println("======================")
    interestingThings.forEach { interestingThing ->
        println(interestingThing)
        //println(it) // default element of lambda
    }

    println("======================")

    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }

    println("========LIST ==============")

    val interestingLists = listOf("test1", "test2", "test3")
    interestingLists.forEach { interestingList ->
        println(interestingList)

    }

    println("========Map ==============")
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { (key, value) ->
        println("$key -> $value")
        if (key == 1) println("$key == $value")
    }

    println("========Mutable List and Map ==============")

    val programLanguages = mutableListOf("kotlin", "Java", "Php")
    programLanguages.add("C#")
    programLanguages.add("Python")

    programLanguages.forEach { programLanguage -> println(programLanguage) }

    val typesofFood = mutableMapOf(1 to "bread", 2 to "beans", 3 to "butter")
    typesofFood.forEach { key, value -> println("$key <=> $value") }
    typesofFood.put(4, "beef")
    typesofFood.put(5, "sugar")
    println("========Mutable List and Map add and put==============")

    typesofFood.forEach { key, value -> println("$key <=> $value") }

    sayHello("Hi, you have registered for programming languages : ", programLanguages)
    sayHelloVarArg("Hi","kotlin", "Java", "Php") // vararg creates an array  of itemsToGreet

    val interestingProgramming = arrayOf("kotlin", "Java", "Php")
    sayHelloVarArg("Hi, ", *interestingProgramming)

    greetPerson("Hi, ", "Derrick")
    greetPerson(greeting="Hi",name="TestDerrick")
    greetPerson(name="TestDerrick",greeting="Hi")
    greetPerson()



}


fun reuseRename(){
    val interestingThingsnew = arrayOf("Kotlin", "Programming","Comic Books")
    sayHelloVarArg(greeting = "Hi",itemsToGreet = *interestingThingsnew)
}


fun sayHello(greeting:String, itemsToGreet:List<String>){
    itemsToGreet.forEach {itemsToGreet ->
        //println("Hi, you are registered for programming languages : ",progra)
        println("$greeting $itemsToGreet")
    }
}

fun sayHelloVarArg(greeting: String, vararg itemsToGreet: String){
    itemsToGreet.forEach {itemsToGreet ->
        //println("Hi, you are registered for programming languages : ",progra)
        println("$greeting $itemsToGreet")
    }
}

fun greetPerson(greeting: String = "Hello, ",name:String= "TestD1") = println("$greeting $name")



