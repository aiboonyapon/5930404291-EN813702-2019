fun main(){
    whatShouldDoToday(mood = "happy")
}
fun whatShouldDoToday(mood: String, weather: String = "rainy", temparature:Int = 24) {
    when {
        mood == "happy" && weather == "sunny" -> print("go for a walk").toString()
        mood == "sad" && weather == "rainy" -> print("Stay home and read").toString()
        mood == "happy" && weather == "rainy" -> print("do homework").toString()
        mood == "sad" && temparature == 15 -> print("wear a clothes").toString()
        else -> print("do nothing").toString()
    }
}