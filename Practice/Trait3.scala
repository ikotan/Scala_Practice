// トレイトのインスタンス生成

// トレイトはそのままnewを使ってインスタンスを生成 -> エラー
trait A {
  val a: Int
}

// new A  // エラー

trait B {
  val b: Int
}

val b = new B {
  val b = 10
}
println(b.b)

println("-------------------------------")

trait C {
  val c: Int
}

trait D {
  val d: Int
}

trait E {
  def method(n: Int): Int
}

val c = new C with D with E {
  val c = 1
  val d = 2
  def method(n: Int) = n * n
}

println(c.c)
println(c.d)
println(c.method(2))

