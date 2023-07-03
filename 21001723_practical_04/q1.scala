object Question1 {
    def main(args: Array[String]) = {
        println(getTotalInterest(20000))
    }

    def getTotalInterest(depostiAmount: Int): Double = {
        depostiAmount * getInterestRate(depostiAmount)
    }

    def getInterestRate(depostiAmount: Int): Float = {
        if(depostiAmount <= 20000) {
            0.02
        } else if(depostiAmount <= 200000) {
            0.04
        } else if(depostiAmount <= 2000000) {
            0.035
        } else {
            0.065
        }
    }
}