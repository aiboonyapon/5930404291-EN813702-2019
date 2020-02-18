import java.lang.System.exit
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

fun main(args: Array<String>){
    var fortune = getFortuneCookie()
    println("Your fortune is: $fortune")
}

fun getFortuneCookie() : String {
    var fortuneList = listOf("Wish you are happy today :D", "You will have a great day!", "Things well go well for you today.", "Today is a good day of exercising restraint",
        "Enjoy a wonderful day of success.", "Be humble and all will turn out well.", "Take it easy and enjoy life!", "Treasure your friends because they are your greatest fortune.")
    print("Enter your birthday: ")
    var birthday : Int = readLine()!!.toIntOrNull()?: 1
    /*when(birthday) {
        null -> {
            print("Please enter your birthday")
            break
        }
        else -> {
        var fortuneNumber : Int = fortuneList.size
        var remainder : Int = birthday % fortuneNumber
            return fortuneList[remainder]
        }
    }*/
    if(birthday == 1){
        print("Please enter your birthday")
        exit(0)
    }
    var fortuneNumber : Int = fortuneList.size
    var remainder : Int = birthday % fortuneNumber
    return fortuneList[remainder]
}