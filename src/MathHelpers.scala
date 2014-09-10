/**
 * Created by lenni on 10.09.14.
 */
object MathHelpers {
  def gcd(a:Int, b:Int): Int = if (b == 0) a else gcd(b, a % b)
  def lcm(a:Int, b:Int): Int = math.abs(a) / gcd(a, b) * math.abs(b)
}
