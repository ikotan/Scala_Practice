// オブジェクトは「object」キーワードで定期
// 中身がない場合は{}は省略OK

object A {
  def method(n: Int) = n + 1
  val a = 1
  var b = 2
}

println( A.method(1) )
println( A.a )
A.b = 4
println(A.method(2))
println("----------------")

// オブジェクトは値なので、変数に代入したり、関数に渡したり、返り値にすることができる

object B {
  def method = 1
}

// オブジェクトの型は「オブジェクト.type」
val b: B.type = B
println( b.method )
println("----------------")

// オブジェクトを引数に閉じ込める
def func1(b: B.type) = b.method
def func2 = B

println(func1(B))
println("----------------")


class C {
  val a = 10
}
object D extends C
println( D.a )

// vim: set ts=4 sw=4 et:
