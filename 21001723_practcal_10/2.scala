object Main extends App{
    def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(_.length) 
    wordLengths.reduce(_ + _) 
    }

    val input = List("apple", "banana", "cherry", "date")
    println("Total count of letter occurrences: " + countLetterOccurrences(input))
}