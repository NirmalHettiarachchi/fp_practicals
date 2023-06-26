object Question1{
    def main(args: Array[String]) = {
        val str = scala.io.StdIn.readLine()
        println(strReverse(str))
    }

    def strReverse(str: String): String = {
        if(str.length == 1) {
            str
        } else {
            strReverse(str.tail) + str.head
        }
    }
}