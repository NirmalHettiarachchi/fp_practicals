object Main{
    def filterEvenNumbers(numbers: List[Int]): List[Int] = {
        numbers.filter(num => num % 2 == 0)
    }

    def main(args: Array[String]) = {
        val inputLst = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        println(filterEvenNumbers(inputLst))
    }
}