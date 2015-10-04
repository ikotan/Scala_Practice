// 引数が評価される
def funcA(a: Any) {}
funcA(println("call printlnA"))

// 引数が評価されない
def funcB(a: => Any) {}
funcB(println("call printlnB"))

// 実際に引数を使うまで評価されない
def funcC(a: => Any) { a }
funcC(println("Call printlnC"))

println("---------")

def funcD(a: Any) {
  println("Call funcD")
  println(a)
}

funcD {
  println("start blockD")
  1
}

println("---------")

// ブロックを渡し場合も参照されまで評価されない
def funcE(a: => Any) {
  println("Call funcE")
  println(a)
}

funcE {
  println("start blockE")
  1
}

// vim: set ts=4 sw=4 et:
