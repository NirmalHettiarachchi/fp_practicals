object Main {
  def isPrime(number: Int): Boolean = {
    if (number <= 1) {
      false
    } else if (number <= 3) {
      true
    } else if (number % 2 == 0 || number % 3 == 0) {
      false
    } else {
      var i = 5
      while (i * i <= number) {
        if (number % i == 0 || number % (i + 2) == 0) {
          return false
        }
        i += 6
      }
      true
    }
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(num => isPrime(num))
  } 

  def main(args: Array[String]) = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(filterPrime(inputList))
  }
}