// 再代入不可能な変数宣言

val a: Int = 1
println(a)

a = 8 // errorになる
println(a)

// 再代入可能な変数宣言

var b: Int = 1
println(b)

b = 8 // errorにならない
println(b)

// 型推論の宣言

val c = 1 // 型を指定しなくてよい
println(c)

// デフォルト値が入る場合

var d: Int = _
println(d)

// 型のデフォルト値

// Int デフォルト値: 0
// Long デフォルト値: 0
// Double デフォルト値: 0.0
// Float デフォルト値: 0.0
// Short デフォルト値: 0
// Byte デフォルト値: 0
// Char デフォルト値: '\0'
// Boolean デフォルト値: false
// 参照型　デフォルト値: null

