// 最初の100個のフィボナッチ数のリストを計算する関数を記述せよ。定義では、フィボナッチ数列の最初の2つの数字は0と1で、次の数は前の2つの合計となる。例えば最初の10個のフィボナッチ数列は、0, 1, 1, 2, 3, 5, 8, 13, 21, 34となる。

object P03 {

  def fib(n: Int): BigInt = {
    def loop(n: Int, prev: BigInt, cur: BigInt): BigInt = {
      if (n == 0) prev
      else loop(n - 1, cur, prev + cur)
    }
    loop(n, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    println(fib(100))
  }

}

P03.main(Array())
