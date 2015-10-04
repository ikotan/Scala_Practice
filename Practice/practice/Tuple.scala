object Tuple {
  def main(args: Array[String]) {
    val numbers = List(1, 2, 3, 4, 5, 10, 6)

    val maxValue = getMaxValue(numbers)
    // println(maxValue)
    printf("max=%s\n", maxValue._1)
    printf("index=%s\n", maxValue._2)
  }

  def getMaxValue(numbers: List[Int]) {
    val max = numbers.max
    println(max)
    val index = numbers.indexOf(max)
    println(index)
    (max, index)
  }
}
Tuple.main(Array())
