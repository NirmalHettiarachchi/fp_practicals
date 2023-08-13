object Main {
  def main(args: Array[String]) = {
    if (args.length != 1) {
      println("Invalid input!")
    } else {
      val input: Int = args(0).toInt
      
      val message: String = input match {
        case n if n <= 0 => "Negative/Zero is input"
        case n if n % 2 == 0 => "Even number is given"
        case _ => "Odd number is given"
      }
      
      println(message)
    }
  }
}