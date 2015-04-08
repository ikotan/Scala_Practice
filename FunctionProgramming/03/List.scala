// package fpinscala.datastructures

sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def sum2(ns: List[Int]): Int = {
    foldRight(ns, 0)((x,y) => x + y)
  }

  def sum3(ns: List[Int]): Int = foldLeft(ns, 0)(_ + _)

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
  }
  def product2(ns: List[Double]): Double =
    foldRight(ns, 1.0)(_ * _)

  def product3(ns: List[Double]): Double = foldLeft(ns, 1.0)(_ * _)

  def append[A](a1: List[A], a2: List[A]): List[A] = a1 match {
    case Nil => a2
    case Cons(h, t) => Cons(h, append(t, a2))
  }

  def append2[A](l: List[A], r: List[A]): List[A] = foldRight(l, r)(Cons(_,_))

  def concat[A](l: List[List[A]]): List[A] = {
    foldRight(l, Nil:List[A])(append2)
  }

  def init[A](l: List[A]): List[A] = l match {
    // case Nil => sys.error("init of empty list")
    case Nil => l
    case Cons(_, Nil) => Nil
    case Cons(h, t) => Cons(h, init(t))
  }

  def tail[A](l: List[A]): List[A] = l match {
    // case Nil => sys.error("tail of empty list")
    case Nil => l
    case Cons(_, t) => t
  }

  def setHead[A](l: List[A], h: A): List[A] = l match {
    // case Nil => sys.error("tail of empty list")
    case Nil => l
    case Cons(_, t) => Cons(h, t)
  }

  def drop[A](l: List[A], n: Int): List[A] =
    if (n <= 0) l
    else l match {
      case Nil => Nil
      case Cons(_, t) => drop(t, n - 1)
    }

  // def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    // case Cons(h, t) if f(h) => dropWhile(t, f)
    // case _ => l
  // }
  def dropWhile[A](as: List[A])(f: A => Boolean): List[A] = as match {
    case Cons(h, t) if f(h) => dropWhile(t)(f)
    case _ => as
  }

  def foldRight[A,B](as: List[A], z: B)(f: (A, B) => B): B = as match {
    case Nil => z
    case Cons(x, xs) => f(x, foldRight(xs, z)(f))
  }

  def foldLeft[A,B](l: List[A], z: B)(f: (B, A) => B): B = l match {
    case Nil => z
    case Cons(h, t) => foldLeft(t, f(z, h))(f)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))

  def length[A](l: List[A]): Int = {
    foldRight(l, 0)((_, acc) => acc + 1)
  }

  def length2[A](l: List[A]): Int = foldLeft(l, 0)((acc, h) => acc + 1)

  def reverse[A](l: List[A]): List[A] = foldLeft(l, List[A]())((acc,h) => Cons(h, acc))

  def add1(l: List[Int]): List[Int] = foldRight(l, Nil:List[Int])((h, t) => Cons(h + 1, t))

  def doubleToString(l: List[Double]): List[String] = foldRight(l, Nil:List[String])((h,t) => Cons(h.toString,t))

  // val x = List(1,2,3,4,5) match {
    // case Cons(x, Cons(2, Cons(4, _))) => x
    // case Nil => 42
    // case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
    // case _ => 101
  // }

}

// println(List.sum(List(1,2,3,4)))
// println(List.product(List(1,2,3,4)))
// println(List.tail(List(1,2,3,4)))
// println(List.setHead(List(1,2,3,4), 5))
// println(List.drop(List(1,2,3,4,5), 3))
// println(List.sum2(List(1,2,3,4)))

val xs: List[Int] = List(1,2,3,4,5,6)
// println(List.dropWhile(xs, (x: Int) => x < 4))
// println(List.dropWhile(xs)(x => x < 4))

// println(List.sum2(List(1,2,3,4,5)))
// println(List.product2(List(1,2,3,4)))
// println(List.foldRight(List(1,2,3), Nil:List[Int])(Cons(_,_)))

// println(List.length(List(1,2,3,4,5)))
// println(List.append(List(1,2,3,4,5), List(6,7,8,9)))
// println(List.append2(List(1,2,3,4,5), List(6,7,8,9)))

// println(List.concat(List(List(1,2,3), List(4,5,6), List(7,8))))

// println(List.add1(List(1,2,3,4,5)))
println(List.doubleToString(List(1.1,2.2,3.3,4.4,5.5)))

// println(List.sum3(List(1,2,3,4,5)))
// println(List.product3(List(1,2,3,4,5)))
// println(List.length2(List(1,2,3,4,5)))


// println(List.x)
