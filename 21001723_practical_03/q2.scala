object Question2{
    def main(args: Array[String]) = {
        val lst: List[String] = List.fill(5)(getInput())
        println(filterStr(lst))
    }

    def getInput(): String = {
        scala.io.StdIn.readLine()
    }

    def filterStr(lst: List[String]): List[String] = {
        lst.filter(_.length > 5)
    }
}