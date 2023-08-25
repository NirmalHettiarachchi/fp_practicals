class Rational(num: Double) {

    // Q1
    def neg: Rational = Rational(-num)

    // Q2
    def sub(other: Rational): Rational =
        new Rational(num - other.toDouble)
  
    def toDouble: Double = num
    override def toString: String = num.toString()
}

object Main extends App{
    //val x = new Rational(4)
    //println(x.neg)

    val x = new Rational(3.0/4.0)
    val y = new Rational(5.0/8.0)
    val z = new Rational(2.0/7.0)

    println(x.neg)
    val result = x.sub(y).sub(z)
    println(result)
}
