object Sorted {
  def isSorted[A](as: Array[A], gt: (A,A) => Boolean): Boolean = {
    def go(n: Int): Boolean =
      if( n >= as.length-1 ) true
      else if( gt(as(A), as(A+1)) ) false
      else go(n + 1)
    go(0)
  }
}



// vim: set ts=4 sw=4 et:
