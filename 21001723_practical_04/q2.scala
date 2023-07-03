object Question2 {
    def main(args: Array[String]) = {
        print("Enter an integer: ")
        val usrInput = scala.io.StdIn.readInt()
        println(patternMatch(usrInput))
    }

    def patternMatch(number: Int): String = {
        if(number < 0) {
            "Negative"
        } else if(number == 0) {
            "Zero"
        } else if (number % 2 == 0) {
            "Even"
        } else {
            "Odd"
        }
    }
}