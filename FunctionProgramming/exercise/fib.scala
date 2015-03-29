object Fib {

  def fib(n: Int): Int = {
    def loop(n: Int, prev: Int, cur: Int): Int =
      if (n == 0) prev
      else loop(n - 1, cur, prev + cur)

    loop(n, 0, 1)
  }

  def main(args: Array[String]) {
    println(fib(5));
  }
}
Fib.main(Array())
// vim: set ts=4 sw=4 et:
