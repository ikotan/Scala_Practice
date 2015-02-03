// 最大公約数を求める
def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y

  while (a !=0) {
    var temp = a
    a = b % a
    b = temp
  }
  b
}

println( gcdLoop(11, 121) )

// do-while
// var line = ""
// do {
  // line = readLine()
  // println("Read: " + line)
// } while (line != "")


// 関数型処理
def gcd(x: Long, y: Long): Long =
  if (y == 0) x else gcd(y, x % y)

println( gcd(63, 9) )
