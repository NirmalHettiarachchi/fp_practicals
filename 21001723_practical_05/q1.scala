object Main {
  def main(args: Array[String]): Unit = {
    println(prime(10))
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