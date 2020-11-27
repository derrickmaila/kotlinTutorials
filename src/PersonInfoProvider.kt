interface PersonInfoProvider {
     val providerInfo: String

    fun printInfo(person: Person){
        println(providerInfo)
        person.printlnInfo()
    }
}

interface  SessionInfoProvider{
    fun getSessionId() : String
}

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{

   protected open val sessionIdPrefix = "Session"
    override val providerInfo: String
    get() = "BasicInfoProvider"

    override fun printInfo(person: Person){
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }

}

fun checkTypes(infoProvider: SessionInfoProvider){
    if(infoProvider !is SessionInfoProvider){
        println("not a session info provider")
    }else{
        println("is a session info provider")
        //(infoProvider as SessionInfoProvider).getSessionId()
        infoProvider.getSessionId()
    }
}


fun main(){
    //val provider = BasicInfoProvider()
    val provider = FancyInfoProvider()
    provider.printInfo(Person("Derrick","Maila"))
    provider.getSessionId()
    checkTypes(provider)


}






