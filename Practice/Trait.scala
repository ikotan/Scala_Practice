// 多重継承問題を解決するもの

// 戻り値を省略した場合、Unit型になる
trait A {
  def method1(n: Int): Int

  def method2(n: Int)

  def method3(n: Int): Int = n + 1
}

// ミックスイン

// トレイトのメソッドを実装するには「with」キーワードでつなげる
// もしクラスを軽傷しない場合、extendsを使用

trait B {
  def methodB(n: Int): Int

  def myPrintln(n: Int)

  def plus(n: Int): Int = n + 10
}

trait C {
  def methodC(s: String): String
}

// 継承する
class D extends B with C {
  def methodB(n: Int) = n * 2

  def myPrintln(n: Int) { println(n) }

  def methodC(s: String) = s + "string"
}

val d = new D
println(d.methodB(1))
println(d.myPrintln(10))
println(d.plus(10))
println(d.methodC("string"))

// オーバーライド
trait H {
  def method(n: Int) = n + 5
}

class M extends H {
  override def method(n: Int) = n * 10
}

val m = new M
println( m.method(50) )
