val a: Any = 1
println(a)

// 型チェック
println(a.isInstanceOf[String])
println(a.isInstanceOf[Int])
println(a.isInstanceOf[Boolean])

// 型のキャスト
println(a.asInstanceOf[Int])
