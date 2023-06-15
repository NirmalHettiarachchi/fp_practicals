object Temperature {
  def main(args: Array[String]) = {
    val temperatureInCelsius = 35.0
    println("The temperature is " + celsiusToFahrenheit(temperatureInCelsius))
  }

  def celsiusToFahrenheit(celsius: Double): Double = {
    celsius * 1.8 + 32.0
  }
}
