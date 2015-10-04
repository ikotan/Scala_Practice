object Mutable {
  def main(args: Array[String]) {
    var mutable = "Mutable"
    printf("%s\n", mutable)

    mutable = "Change Mutable"
    printf("%s\n", mutable)
  }
}
Mutable.main(Array())
