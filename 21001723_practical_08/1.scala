object Main {
  def calculateInterest(depositAmount: Double): Double = {
    val interestRate: Double = depositAmount match {
      case amount if amount <= 20000 => 0.02
      case amount if amount <= 200000 => 0.04
      case amount if amount <= 2000000 => 0.035
      case _ => 0.065
    }
    depositAmount * interestRate
  }

  def main(args: Array[String]) = {
    val depositAmount: Double = 50000
    println(calculateInterest(depositAmount))
  }
}
