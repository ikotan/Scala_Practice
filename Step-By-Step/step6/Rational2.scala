// 補助コンストラクター
// class Rational(n: Int, d: Int) {
  // require(d != 0)
  // val numer: Int = n
  // val denom: Int = d
  // 引数1つの場合
  // def this(n: Int) = this(n, 1)
  // override def toString = n + "/" + d
  // def add(that: Rational) =
    // new Rational(
      // numer * that.denom + that.numer * denom,
      // denom * that.denom
    // )

  // def lessThan(that:  Rational) =
    // numer * that.denom < that.numer * denom

  // def max(that: Rational) =
    // if (lessThan(that)) that else this
// }

// println( new Rational(1, 2) )
// println( new Rational(2, 3) )
// println( new Rational(5) )

// 非公開フィールドとメソッド

class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g
  def this(n: Int) = this(n, 1)

  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
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

println( new Rational(66, 42) )
println( new Rational(12, 8) )
