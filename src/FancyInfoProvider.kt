class FancyInfoProvider  : BasicInfoProvider(){

    override val sessionIdPrefix: String
        get() = "fancy session"

    override val providerInfo: String
        //get() = super.providerInfo
    get() = "fancy info provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("fancy info")
    }
}