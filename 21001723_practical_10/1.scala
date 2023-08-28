object Main extends App {
    def calculateAverage(temps: List[Int]): Double = {
        val fahTemps = temps.map(celsius => (celsius * 9.0/5.0) + 32)
        val totalFah = fahTemps.reduce((a, b) => a + b)
        totalFah / fahTemps.length
    }

    val inputTemps = List(0, 10, 20, 30)
    println("Average Fahrenheit temperature: " + calculateAverage(inputTemps))
}