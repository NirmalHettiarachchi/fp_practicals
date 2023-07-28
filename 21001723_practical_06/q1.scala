object Main {

  def cipher(str: String, functionName: (String, Integer)=>String, n: Integer): String = {
    functionName(str, n)
  }

  def encrypt(str: String, n: Integer): String = {
    str.map { char =>
      val temp = char.toInt + n
      val newChar = if (temp > 'Z'.toInt) (('A'.toInt - 1) + (temp - 'Z'.toInt)).toChar else temp.toChar
      newChar
    }
  }

  def decrypt(str: String, n: Integer): String = {
    str.map { char =>
      val temp = char.toInt - n
      val newChar = if (temp < 'A'.toInt) (('Z'.toInt + 1) - ('A'.toInt - temp)).toChar else temp.toChar
      newChar
    }
  }

  def main(args: Array[String]) = {
    println(cipher("XYZ", encrypt, 2))
    println(cipher("ZAB", decrypt, 2))
  }
}