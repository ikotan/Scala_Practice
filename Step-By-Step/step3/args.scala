def printArgs(args: Array[String]): Unit = {
  for (arg <- args)
    println(arg)
}
printArgs(Array("hoge", "fuga", "bar"))

def printArgs2(args: Array[String]): Unit = {
  args.foreach(println)
}

printArgs2(Array("hoge", "fuga", "bar"))

def formatArgs(args: Array[String]) = args.mkString("\n")
println( formatArgs(Array("hoge", "fuga", "bar")) )

val res = formatArgs(Array("hoge", "fuga", "bar"))
println( assert( res == "hoge\nfuga\nbar") )
