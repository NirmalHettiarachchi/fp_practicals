object Theater {
  def main(args: Array[String]) = {
    val performanceCost = 500
    val attendeeCost = 3
    println(findBestTicketPrice(performanceCost, attendeeCost))
  }

  def findBestTicketPrice(performanceCost: Int, attendeeCost: Int): Int = {
    val ticketPrices = getTicketPrices()
    val numOfAttendances = getNumOfAttendances()
    val profits = getProfits(ticketPrices, numOfAttendances, performanceCost, attendeeCost)

    val bestTicketPrice = ticketPrices(profits.indexOf(profits.max))  //get the index of the max profit from the profits and use it to retrieve the corresponding ticket price
    bestTicketPrice    
  }

  def getTicketPrices(): Seq[Int] =  (-3 to 6).map(getTicketPrice)  //because the lowest ticket price is 0 (15 - 5*3) and the lowest number of attendaces is 0 (120 - 20*6)

  def getNumOfAttendances(): Seq[Int] = (-3 to 6).map(getNumOfAttendance) //because the lowest ticket price is 0 (15 - 5*3) and the lowest number of attendaces is 0 (120 - 20*6)

  def getProfits(ticketPrices: Seq[Int], numOfAttendances: Seq[Int], performanceCost: Int, attendeeCost: Int): Seq[Int] = ticketPrices.zip(numOfAttendances).map {
      case (ticketPrice, numOfAttendance) =>
        (ticketPrice * numOfAttendance) - performanceCost - (attendeeCost * numOfAttendance)
    }

  def getTicketPrice(numOfMultipliesBy5: Int): Int = 15 + (numOfMultipliesBy5 * 5)

  def getNumOfAttendance(numOfMultipliesBy5: Int): Int = 120 - (20 * numOfMultipliesBy5)
}

