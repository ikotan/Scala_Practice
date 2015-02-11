def main(args: Array[String]): Unit = {
  val firstArg = if (!args.isEmpty) args(0) else ""
  val friend =
    firstArg match {
      case "salt"  => "pepper"
      case "chips" => "salsa"
      case "eggs"  => "bacon"
      case _ => "huh?"
    }
  println(friend)
}
main(Array("eggs"))
