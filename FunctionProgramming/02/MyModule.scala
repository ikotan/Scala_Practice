object MyModule {
  def abs(n: Int) =
    if( n < 0 ) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def fuctorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if( n <= 0 ) acc
      else go(n-1, n*acc)

    go(n, 1)
  }

  def main(args: Array[String]): Unit =
    println(formatAbs(-42));
}

// MyModule.main(Array());

// vim: set ts=4 sw=4 et:
