fun main(){
    val person = Person("Derrick","Maila")

    person.nickName = "Shades"
    person.nickName = "NewNick"
    println(person.firstName)
    println(person.lastName)
    println(person.nickName)

    person.printlnInfo()
}