object NoneSideEffect {
  def main(args: Array[String]) {
    var add = (x: Int) => x + 5

    printf("total=%s\n", add(1))
    printf("total=%s\n", add(1))
    printf("total=%s\n", add(1))
  }
}
NoneSideEffect.main(Array())
