class Person(_firstName: String, _lastName: String){
    val firstName: String = _firstName
    val lastName: String = _lastName

    var nickName: String? = null
    set(value) {
        field  = value
        println("the new nickname is $value")
    }

    get() {
        println("the returned value is $field")
        return  field
    }

  fun printlnInfo(){

      val nickNameToPRINT = if(nickName != null) nickName else "no nickname"
      println("$firstName ($nickNameToPRINT) $lastName")
  }






}
