object Question3{
    def main(args: Array[String]) = {
        val avg = getAvg(2,9)
        println(f"$avg%.2f")
    }

    def getAvg(num1: Int, num2: Int): Double = {
        BigDecimal((num1+num2).toDouble/2).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    }
}