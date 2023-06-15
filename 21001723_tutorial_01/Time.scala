object Time {
  def main(args: Array[String]) = {
    val easyPace = 8.0
    val tempoPace = 7.0

    println("The total running time is: " + calculateRunningTime(easyPace, tempoPace))
  }

  def calculateRunningTime(easyPace: Double, tempoPace: Double): Double = {
    val easyDistance1 = 2.0
    val tempoDistance = 3.0
    val easyDistance2 = 2.0

    (easyPace * easyDistance1) + (tempoPace * tempoDistance) + (easyPace * easyDistance2)
  }
}
