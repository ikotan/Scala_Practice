// classの定義
// class Rational(n: Int, d: Int) {
  // println("Created " + n + "/" + d)
  // override def toString = n + "/" + d
// }

// println( new Rational(1, 2) )

// println( new Rational(3, 7) )

// クラスパラメータのバリデート
// dは0を受け付けない
// class Rational(n: Int, d: Int) {
  // require(d != 0)
  // override def toString = n + "/" + d
// }

// println( new Rational(1, 2) )

// println( new Rational(5, 0) )

// フィールドを持たせる
// class Rational(n: Int, d: Int) {
  // require(d != 0)
  // val numer: Int = n
  // val denom: Int = d
  // override def toString = n + "/" + d
  // def add(that: Rational) =
    // new Rational(
      // numer * that.denom + that.numer * denom,
      // denom * that.denom
    // )
// }

// val oneHalf = new Rational(1, 2)
// val twoThirds = new Rational(2, 3)
// println( oneHalf add twoThirds )
// println( oneHalf.numer )
// println( twoThirds.denom )

// 自己参照
class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d
  override def toString = n + "/" + d
  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def lessThan(that:  Rational) =
    // thisは省略可能
    // this.numer * that.denom < that.numer * this.denom
    numer * that.denom < that.numer * denom

  def max(that: Rational) =
    // thisは省略可能
    // if (this.lessThan(that)) that else this
    if (lessThan(that)) that else this
}

val oneHalf = new Rational(1, 2)
val twoThirds = new Rational(2, 3)
println( oneHalf lessThan twoThirds )
println( oneHalf max twoThirds )
