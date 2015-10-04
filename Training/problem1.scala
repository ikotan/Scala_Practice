// forループ、whileループ、および再帰を使用して、リスト内の数字の合計を計算する3つの関数を記述せよ。

// for
def useFor(lists: List[Int]): Int = {
  var sum = 0
  for (i <- lists) sum = sum + i
  sum
}
println( useFor(List(1,2,3,4,5)) )

// while
def useWhile(lists: List[Int]): Int = {
  var sum = 0
  val ls = lists.toIterator
  while (ls.hasNext) sum = sum + ls.next
  sum
}
println( useWhile(List(5,6,7,8,9,10)) )


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
println( useLoop(List(1,2,3,4,5)) )
