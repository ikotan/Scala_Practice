
val fruit: List[String] = List("apples", "oranges", "pears")
val nums: List[Int] = List(1, 2, 3, 4)
val diag3: List[List[Int]] =
  List(
    List(1, 0, 0),
    List(0, 1, 0),
    List(0, 0, 1)
  )

val empty: List[Nothing] = List()

println( fruit )
println( nums )
println( diag3 )
println( empty )

println( "--------------" )

println( empty.isEmpty )
println( fruit.isEmpty )
println( fruit.head )
println( fruit.tail.head )
println( diag3.head )

// println( empty.head )
println( "--------------" )

def isort(xs: List[Int]): List[Int] =
  if (xs.isEmpty) Nil
  else insert(xs.head, isort(xs.tail))

def insert(x: Int, xs: List[Int]): List[Int] =
  if (xs.isEmpty || x <= xs.head) x :: xs
  else xs.head :: insert(x, xs.tail)

def isort2(xs: List[Int]): List[Int] = xs match {
  case List() => List()
  case x :: xs1 => insert2(x, isort2(xs1))
}

def insert2(x: Int, xs: List[Int]): List[Int] = xs match {
  case List() => List(x)
  case y :: ys => if (x <= y) x :: xs
                  else y :: insert2(x, ys)
}

println( isort( List(3, 1, 2, 5) ) )
println( isort2( List(3, 1, 2, 5, 4) ) )

println( "--------------" )

val List(a, b, c) = fruit
println(List(a, b, c))

def append[T](xs: List[T], ys: List[T]): List[T] = xs match {
  case List() => ys
  case x :: xs1 => x :: append(xs1, ys)
}

println( append(List(1,2,3), List(4,5,6)) )
println( "--------------" )

def rev[T](xs: List[T]): List[T] = xs match {
  case List() => xs
  case x :: xs1 => rev(xs1) ::: List(x)
}

println( rev(List(1,2,3,4,5)) )
println( "--------------" )


