object Main {

  def cipher(str: String, functionName: String=>String): String = {
    functionName(str)
  }

  def encrypt(str: String): String = {
    var enStr = ""
    for (char <- str) {
      val newChar = if (char == 'Z') 'A' else (char.toInt + 1).toChar
      enStr += newChar
    }
    enStr
  }

  def decrypt(str: String): String = {
    var deStr = ""
    for (char <- str) {
      val newChar = if (char == 'A') 'Z' else (char.toInt - 1).toChar
      deStr += newChar
    }
    deStr
  }

  def main(args: Array[String]) = {
    print(cipher("ABC", encrypt))
  }
}