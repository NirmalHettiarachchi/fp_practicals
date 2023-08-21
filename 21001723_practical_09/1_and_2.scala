class Rational(num: Int) {

    //Q1
    def neg: Rational = new Rational(-num)

    //Q2
    def sub(other: Rational): Rational =
        new Rational(num - other.toInt)
  
    def toInt: Int = num
    override def toString: String = s"$num"
}

object Main extends App{
    //val x = new Rational(4)
    //println(x)
    //println(x.neg)

    // val x = new Rational(3/4)
    // val y = new Rational(5/8)
    // val z = new Rational(2/7)

    val x = new Rational(3)
    val y = new Rational(5)
    val z = new Rational(2)

    val result = x.sub(y).sub(z)
    println(result)
}
