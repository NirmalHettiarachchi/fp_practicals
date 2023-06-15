object Disk {
  def main(args: Array[String]) = {
    val radius = 5
    println(calculateArea(radius))
  }

  def calculateArea(radius: Double): Double = {
    math.Pi * radius * radius
  }
}
