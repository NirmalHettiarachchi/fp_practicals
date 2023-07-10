object Main {
  def main(args: Array[String]): Unit = {
    println(getSum(4))
  }

  def getSum(n: Int): Int = {
    if (n <= 0) {
      0
    } else {
      n + getSum(n - 1)
    }
  }
}