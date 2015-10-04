object HelloWorld2 {
  def main(args: Array[String]) {
    if(args.size == 0) {
      val strs = Array("Hello", "World")
      output(strs)
    } else {
      printf("Invalid args.")
    }
  }

  // Unitは省略できる。Unitとは戻り値がない場合の宣言
  def output(strs: Array[String]): Unit = {
    strs.foreach(printf("%s ", _))
  }
}
HelloWorld2.main(Array())
