// 算術演算子
class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g
  def this(n: Int) = this(n, 1)

  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def * (that: Rational): Rational =
    new Rational(
      numer * that.numer,
      denom * that.denom
    )

  def lessThan(that: Rational) =
    numer * that.denom < that.numer * denom

  def max(that: Rational) =
    if (lessThan(that)) that else this

  override def toString = numer + "/" + denom
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

val x = new Rational(1, 2)
val y = new Rational(2, 3)

println(x + y)
println(x * y)
println(x + x * y)
println((x + x) * y)
println(x + (x * y))
