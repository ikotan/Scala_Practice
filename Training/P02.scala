// 交互に要素を取ることで、2つのリストを結合する関数を記述せよ。例えば [a, b, c]と[1, 2, 3]という2つのリストを与えると、関数は [a, 1, b, 2, c, 3]を返す。 

object P02 {

  def combiningList(a: List[Any], b: List[Any]): List[Any] = {
    a zip b flatMap { x => List(x._1, x._2) }
  }

  def main(args: Array[String]): Unit = {
    val list1 = List("a", "b", "c")
    val list2 = List(1,2,3)
    println(combiningList(list1, list2))
  }

}
P02.main(Array())

// vim: set ts=4 sw=4 et:
