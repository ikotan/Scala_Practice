// デフォルトの引数
def greet(name: String = "John Doe") = println("Hello, " + name)

greet()
greet("Taro")


def minus(a: Int, b: Int) = a - b

// 名前付き引数
println( minus(b = 50, a = 100) )

// 複数のパラメータリスト
// コンパイル時にパラメータリストは1つにまとめられる
def plus(a: Int)(b: Int) = a + b
println( plus(1)(5) )

println( plus(1) {
  val a = 1 + 2
  val b = a * 3
  val c = b - 4
  c / 5
} )

// 可変長引数
def func(a: Int*) = {
  var i = 0
  val length = a.length
  while ( i < length ) {
    println( a(i) * 2 )
    i += 1
  }
}

println( "---------" )
func( 5, 4, 3, 2, 1 )
println( "---------" )
