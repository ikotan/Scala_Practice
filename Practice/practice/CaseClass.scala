// インスタンス生成においてnewを省略できる
// 基本コンストラクタ引数にすべて、valがついた状態になる
// パターンマッチに使える
// 便利なメソッドが生成される

case class CaseClass(a: Int)
val c = CaseClass(1)
println(c.a)

// case class Person(name: String, age: Int)
// val p = Person("Taro", 30)
// println(p.name)
// println(p.age)

// applyメソッドは呼び出すときに、名前を省略できます。実際にクラスとオブジェクトに定義して使ってみます。 
case class Person(name: String, age: Int)

val p1 = Person.apply("Taro", 30)
println(p1.name)
println(p1.age)

val p2 = Person("Taro", 30)
println(p1.name)
println(p1.age)

// copyメソッドはデフォルト引数や名前付き引数を使って、部分的に新しいインスタンスを作る
case class Person1(
  name: String,
  age: Int,
  country: String,
  email: String
)

println("---------------------------------------------")
val pp = Person1("Taro", 30, "Japan", "taro@example.jp")
println(pp)
println(pp.name)
val pp2 = pp.copy(age = 31)
println(pp2)
println(pp2.name)
println(pp2.age)
val pp3 = pp2.copy(country = "America", email = "taro@example.com")
println(pp3)
println(pp3.name)
println(pp3.age)
println(pp3.country)
println(pp3.email)
println("---------------------------------------------")

case class Man(name: String, age: Int)

val m1 = Man("Taro", 30)
val m2 = Man("Taro", 30)
val m3 = Man("Taro", 31)

println( m1 == m2 ) // name, age一緒
println( m2 == m3 ) // ageの値が異なる
println("---------------------------------------------")

case class CaseClassA()
case class CaseClassB()

val a = CaseClassA()
println( a.canEqual(CaseClassA()) )
println( a.canEqual(CaseClassB()) )
println("---------------------------------------------")

// カリー化
case class Woman(name: String, age: Int, email: String)

val curried = Woman.curried
val f = curried("Taro")(30)
f("taro@example.jp")
println(f)
println("---------------------------------------------")

case class Hoge(name: String, age: Int)

val h = Hoge.tupled
val tuple = ("Taro", 30)
h(tuple)
println(h)



