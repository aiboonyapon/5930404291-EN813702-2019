import java.lang.System.exit
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import javax.swing.text.StyledEditorKit

fun main(args: Array<String>){
    fitMoreFish(10.0, listOf(3,3,3),2,true)
}

fun fitMoreFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true) : Boolean{
    var totalFish : Double = if(hasDecorations) {
        tankSize * 0.8
    } else {
        tankSize
    }
    for(i in currentFish) {
        totalFish -= i
    }
    totalFish -= fishSize
    var calculate: Boolean = totalFish >= 0
    var resultFish: String = if (fishSize == 2) {
        ", 2"
    } else {
        ""
    }
    var resultDecoration: String = if (!hasDecorations) {
        ", hasDecorations = false"
    } else {
        ""
    }
    print("The result of canAddFish(${tankSize}, listOf($currentFish$resultFish$resultDecoration) is $calculate")

    return true
}