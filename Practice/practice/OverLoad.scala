// オーバーロード
class A {
  def method1(n: Int) = n * 2

  def method1(s: String) = s + "string"

  def method2(n: Int) = n + 1

  def method2(n: Int, n1: Int) = n + n1
}

val a = new A
println( a.method1(1) )
println( a.method1("string") )
println( a.method2(2) )
println( a.method2(2, 2) )
