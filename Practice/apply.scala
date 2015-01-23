class A(n: Int) {
  def apply(_n: Int) = n * _n
}

// applyは省略できる
val a = new A(3)
println( a(2) )

object B {
  def apply(n: Int) = n * n
}
println( B(2) )
println( "------------------" )

// メソッド呼び出し時にドットを省略できる -> 中置記法
class MyInt(_n: Int) {
  def plus(n: Int) = new MyInt(_n + n)

  override def toString = "MyInt(" + _n + ")"
}

val i = new MyInt(2)
println( i plus(5) )
// ドットを省略した場合、丸括弧も省略できる
println( i.plus(5) plus 3 )
println( "------------------" )

println( 123 toString )
