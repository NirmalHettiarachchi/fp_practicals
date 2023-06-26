object Question3{
    def main(args: Array[String]) = {
        println(getAvg(2, 1))
    }

    def getAvg(num1: Int, num2: Int): Double = {
        BigDecimal((num1+num2).toDouble/2).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    }
}