// オーバーライド
class A {
  def method(n: Int) = n + 1
}

class B extends A {
  override def method(n: Int) = n * n
}

val b = new B
println( b.method(3) )


class C {
  val c = 1
  val d = 2
}

class D(override val c: Int) extends C {
  override val d = 3
}

val e = new D(4)
println( e.c )
println( e.d )

