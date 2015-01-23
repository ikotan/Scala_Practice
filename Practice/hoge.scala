trait A {
  val a: Int
}
 
trait B {
  val b: Int
}
 
trait C {
  def method(n: Int): Int
}
 
// with トレイト with トレイト ...
val a = new A with B with C {
  val a = 1
  val b = 2
  def method(n: Int) = n * n
}
 
a.a
a.b
a.method(2)


// vim: set ts=4 sw=4 et:
