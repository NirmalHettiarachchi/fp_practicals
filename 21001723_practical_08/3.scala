object Main{
    def toUpper(str: String): String = {
        str.toUpperCase()
    }

    def toLower(str: String): String = {
        str.toLowerCase()
    }

    def formatNames(name: String, formatType: String): String = {
        val formattedName: String = formatType match {
            case "toUpper" => toUpper(name)
            case "toLower" => toLower(name)
            case _ => "Invalid format type!"
        }
        formattedName
    }

    def main(args: Array[String]) = {
        println(formatNames("Benny", "toUpper"))
        println(formatNames("Niroshan", "toLower"))
        println(formatNames("Saman", "toLower"))
        println(formatNames("Kumara", "toLower"))
    }
}