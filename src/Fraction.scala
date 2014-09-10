/**
 * Created by lenni on 10.09.14.
 */
class Fraction(val a: Int,val b: Int) {
  assert(b != 0, "Division by Zero")
  def * (f: Fraction) = new Fraction(this.a * f.a , this.b * f.b)
  def inverse = new Fraction(this.b, this.a)
  def / (f: Fraction) = this * f.inverse
  def + (f: Fraction) = new Fraction(a * f.b + f.a * this.b, this.b * f.b)
  def - (f: Fraction) = new Fraction(a * f.b - f.a * this.b, this.b * f.b)
  def reduce = new Fraction(this.a / MathHelpers.gcd(this.a, this.b), this.b / MathHelpers.gcd(this.a, this.b))
  def expand(c: Int) = new Fraction(this.a * c, this.b * c)
  def copy = new Fraction(this.a, this.b)
  def ^(c: Int) = if (c == 0) new Fraction(1, 1) else new Fraction(math.pow(a,c).toInt, math.pow(b,c).toInt)
  override def toString = if (b == 1) s"$a" else s"$a / $b"
}
