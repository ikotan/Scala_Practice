object Composition {
  def compose[A,B,C](f: B => C, g: A => B): A => C =
    a => f(g(a))
}

// vim: set ts=4 sw=4 et:
