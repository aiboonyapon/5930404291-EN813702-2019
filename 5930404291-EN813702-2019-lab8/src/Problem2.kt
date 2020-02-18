import java.lang.System.exit
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

fun main(args: Array<String>){
    var fortune: String
    for (i in 1..10){
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getFortune(birthday: Int) : String {
    //var fortuneNumber : Int = fortuneList.size
    //var remainder : Int = birthday % fortuneNumber
    //return fortuneList[remainder]

    var fortuneList = listOf("Wish you are happy today :D", "You will have a great day!", "Things well go well for you today.", "Today is a good day of exercising restraint",
        "Enjoy a wonderful day of success.", "Be humble and all will turn out well.", "Take it easy and enjoy life!", "Treasure your friends because they are your greatest fortune.")
    //print("Enter your birthday: ")
    var fortuneNumber : Int = fortuneList.size
    var remainder : Int = birthday % fortuneNumber
    return when(birthday){
        28, 31, 30 -> "Enjoy the last day of month \n"
        in 1..7 -> "Have a good start the first week of month \n"
        in 1..31 -> "${fortuneList[remainder]}\n"
        else -> "Please enter a valid birthday (1-31)"
    }

}
fun getBirthday(): Int {
    //println("Please enter a valid birthday (1-31)")
    print("Enter your birthday: ")
    var birthday : Int = readLine()!!.toIntOrNull()?: 35
    return birthday;
}