object Question3{
    def main(args: Array[String]) = {
        println(formatNames("Benny", "toUpper"))
        println(formatNames("Niroshan", "toLower"))
        println(formatNames("Saman", "toLower"))
        println(formatNames("Kumara", "toUpper"))
    }

    def toUpper(str: String): String = {
        str.toUpperCase()
    }

    def toLower(str: String): String = {
        str.toLowerCase()
    }

    def formatNames(name: String, formatType: String): String = {
        if(formatType == "toUpper") {
            toUpper(name)
        } else if(formatType == "toLower") {
            toLower(name)
        } else {
            "Invalid input!"
        }
    }
}