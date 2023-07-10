object Main {
  def main(args: Array[String]): Unit = {
    primeSeq(10)
  }

  def primeSeq(n: Int): Unit = {
    for (i <- 2 until n) {
      if (prime(i)) {
        println(i)
      }
    }
  }

  def prime(n: Int, i: Int = 2): Boolean = {
    if (n <= 1) {
      false
    } else if (i < n) {
      if (n % i == 0) {
        false
      } else {
        prime(n, i + 1)
      }
    } else {
      true
    }
  }
}