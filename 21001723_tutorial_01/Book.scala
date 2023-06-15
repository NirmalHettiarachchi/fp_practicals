object Book {
  def main(args: Array[String]) = {
    val numCopies = 60
    println("The total wholesale cost is Rs. " + calculateWholesaleCost(numCopies))
  }

  def calculateWholesaleCost(numCopies: Int): Double = {
    val coverPrice = 24.95
    val discountRate = 0.4
    val shippingCostFirst50 = 3.0
    val shippingCostAdditional = 0.75
    val discountedPrice = coverPrice * (1 - discountRate)

    val shippingCost = if (numCopies <= 50) {
      numCopies * shippingCostFirst50
    } else {
      (50 * shippingCostFirst50) + ((numCopies - 50) * shippingCostAdditional)
    }

    (discountedPrice * numCopies) + shippingCost
  }
}
