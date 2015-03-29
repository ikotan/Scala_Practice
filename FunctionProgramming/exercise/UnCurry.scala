object UnCurry {
  def Uncurry[A,B,C](f: A => B => C): (A, B) => C =
    (a,b) => f(a)(b)
}

// vim: set ts=4 sw=4 et:
