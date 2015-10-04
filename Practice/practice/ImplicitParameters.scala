// 暗黙の引数として設定される
implicit val n = 2

def func(n: Int)(implicit n2: Int) = println(n + n2)
func(1)

// 普通に引数を定義してもよい
func(1)(5)

