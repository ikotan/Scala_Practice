object FirstClassFunction {
  def main(args: Array[String]) {
    val add = (x: Int) => {
      val _add = (y: Int) => y + 5
      _add(x)
    }
    printf("total=%s\n", add(1))
    printf("total=%s\n", add(2))
    printf("total=%s\n", add(1))
  }
}
FirstClassFunction.main(Array())
