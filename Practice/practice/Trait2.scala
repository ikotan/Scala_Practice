// トレイトないでメンバを呼び出すと、初期化されてないので、デフォルト値が返る

// Intのデフォルト値である0が表示される。
// 子クラスで実装する値を表示させるには、変数を事前に定義
trait A {
  val a: Int
  println(a)
}

class B extends A {
  val a = 1
}

val b = new B
println(b.a)
println("--------------------")

trait C {
  val c: Int
  println(c)
}

class D extends {
  val c = 100
} with C

val d = new D
println(d.c)

println("--------------------")




