object Literal {
  def main(args: Array[String]) {
    val dec = 24
    println("dec:" + dec)

    val hex = 0x24
    println("hex:" + hex)

    val prog = 35L
    println("prog:" + prog)

    val big = 1.2
    println("big:" + big)

    val bigger = 1.2e2
    println("bigger:" + bigger)

    val biggerStill = 1.2e45
    println("biggerStill:" + biggerStill)

    val little = 1.2f
    println("little:" + little)

    val a = "あ"
    println("a:" + a)

    val name = "桜木花道"
    println("name:" + name)

    val sentence = """|Test test
    |test "test" """.stripMargin
    println("sentence:" + sentence)

    val bool = true
    println("bool:" + bool)

    val s = 'synbolA
    println("s:" + s.name)
  }
}
Literal.main(Array())
