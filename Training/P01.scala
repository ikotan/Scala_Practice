// forループ、whileループ、および再帰を使用して、リスト内の数字の合計を計算する3つの関数を記述せよ。

object P01 {
  // for
  def useFor(list: List[Int]): Int = {
    var sum: Int = 0
    for (i <- list) sum = sum + i
    sum
  }

  // while
  def useWhile(lists: List[Int]): Int = {
    var sum: Int = 0
    val ls = lists.toIterator
    while (ls.hasNext) sum = sum + ls.next
    sum
  }

  // ループ
  def useLoop(lists: List[Int]): Int = {
    def loop(ls: List[Int], num: Int): Int = {
      ls match {
        case Nil => num
        case head :: tail => loop(tail, num + head)
      }
    }
    loop(lists, 0)
  }

  // メイン
  def main(args: Array[String]): Unit = {
    val list: List[Int] = (1 to 5).toList
    println(useFor(list))
    println(useWhile(list))
    println(useLoop(list))
  }
}
P01.main(Array())

