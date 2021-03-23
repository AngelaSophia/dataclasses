fun main() {
    var sophia=Human("Grace",23,56)
    sophia.eat( 5)
    println(sophia.weight)
    sophia.speak("I love my country")
    sophia.birthday()
    var laura=User("Sophia","Ayugi","ayugisophiaangela@gmail.com","0758183543","20211995")
    println(laura.email)
    println(laura.firstName)
}




class Human(var name:String,var age:Int,var weight:Int ){
    fun eat (foodWeight:Int):Int {
   println("I am eating $foodWeight kgs of food")
        weight=weight+foodWeight
        return weight

        }
    fun speak(speech :String) {
        println("$speech")

    }
    fun birthday()  {
        age++
            println(age)
        }
    }

  data class User(var firstName:String,var lastName:String,var email:String,var phonNumber:String,var password:String)
