object Main {
  def main(args: Array[String]): Unit = {
    println(sumEven(10))  
  }

  def sumEven(n: Int): Int = {
    if (n <= 0) {
      0  
    } else {
      val current = if (n % 2 == 0) n else n - 1
      current + sumEven(current - 2)
    }
  }
}