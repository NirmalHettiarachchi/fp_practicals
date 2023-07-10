object Main {
  def main(args: Array[String]): Unit = {
    println(isEven(5))  
    println(isEven(6))  
  }

  def isEven(n: Int): Boolean = {
    if (n == 0) {
      true  
    } else if (n == 1) {
      false  
    } else {
      isEven(n - 2)  
    }
  }
}