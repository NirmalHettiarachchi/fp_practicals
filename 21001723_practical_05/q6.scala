object Main {
  def main(args: Array[String]): Unit = {
    printFibonacci(10) 
  }

  def printFibonacci(n: Int): Unit = {
    for (i <- 0 until n) {
      print(fibonacci(i) + " ")
    }
  }

  def fibonacci(n: Int): Int = {
    if (n <= 1) {
      n  
    } else {
      fibonacci(n - 1) + fibonacci(n - 2) 
    }
  }
}