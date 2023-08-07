object Main {
    def calculateSquare(numbers: List[Int]): List[Int] = {
        numbers.map(int => int * int)
    } 

    def main(args: Array[String]) = {
        val input = List(1, 2, 3, 4, 5)
        println(calculateSquare(input))
    }   
}