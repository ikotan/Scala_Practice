var filename = "default.txt"
if (!args.isEmpty) {
  filename = args(0)
}

// valで宣言
// ifは値を返せる
val filename2 =
  if (!args.isEmpty) args(0) else "default.txt"

println(filename2)

