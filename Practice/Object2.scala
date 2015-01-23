// 内部オブジェクト
object A {
  object B {
    val b = 10
  }
}

println( A.B.b )
println("----------------")

// 内部オブジェクトの実態が１つシングルトンなのは、そのクラス内だけ
class C {
  object D {
    var b = 10
  }
}

val c1 = new C
val c2 = new C
c1.D.b = 2
println( c2.D.b )

println("----------------")

// 同じソース内で、クラスと同じ名前で定義されたオブジェクト => コンパニオンオブジェクト
// オブジェクトとそのクラスは、お互いのプライベートなメンバにアクセスすることができる。
class D {
  def method(n: Int) = D.method(n)

  private val a = 10
}

object D {
  private def method(n: Int) = n * 2

  val i = {
    val a = new D
    a.a
  }
}

println(D.i)
println("----------------")

