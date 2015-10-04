// val var ゲッター・セッターで呼び出している

class A {
  val a = 1
  var b = 2
}

trait B {
  def a: Int
  def b: Int
}

case class D(a: Int, b: Int) extends B

class C {
  final val c = 1
  final val d = 2
  final val e = 3
}

val f = new C
println(f.c)
println(f.d)
println(f.e)
