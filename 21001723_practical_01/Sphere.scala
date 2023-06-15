package Demo

object Sphere {
  def main(args: Array[String]) = {
    val radius = 5.0
    println("The volume of the sphere is: " + calculateSphereVolume(radius))
  }

  def calculateSphereVolume(radius: Double): Double = {
    (4.0/3.0) * math.Pi * math.pow(radius, 3)
  }
}
