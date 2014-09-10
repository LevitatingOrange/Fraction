/**
 * Created by lenni on 10.09.14.
 */
object Main {
  def main(args: Array[String]) {
    val a = new Fraction(1,2)
    val b = new Fraction(1,4)
    println("Fraction A: "+ a)
    println("Fraction B: "+ b)
    println("+: "+ (a + b).reduce)
    println("-: "+ (a - b).reduce)
    println("*: "+ (a * b).reduce)
    println("/: "+ (a / b).reduce)
    println("^2 von a: "+ (a ^ 2).reduce)
    println("^2 von b: "+ (b ^ 2).reduce)
    println("Kehrwert von A: "+ a.inverse)
    println("Kehrwert von B: "+ b.inverse)
  }
}
