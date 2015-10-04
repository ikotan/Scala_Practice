class Queue[+T](
  private val leading: List[T],
  private val trailing: List[T]
) {
  private def mirror =
    if (leading.isEmpty)
      new Queue(trailing.reverse, Nil)
    else
      this
  def head = mirror.leading.head
  def tail = {
    val q = mirror
    new Queue(q.leading.tail, q.trailing)
  }
  def enqueue(x: T) = new Queue(leading, x :: trailing)
}

val a = new Queue(List(1,2), List(3))
println( a.head )
println( a.tail.head )
println( a.enqueue(5).tail )

class SlowAppendQueue[T](elems: List[T]) {
  def head = elems.head
  def tail = new SlowAppendQueue(elems.tail)
  def enqueue(x: T) = new SlowAppendQueue(elems ::: List(x))
}

class StrangeIntQueue extends Queue[Int] {
  override def enqueue(x: Int) = {
    println(math.sqrt(x))
    super.enqueue(x)
  }
}

val x: Queue[Any] = new StrangeIntQueue
println( x.enqueue("abc") )

// val q = new SlowAppendQueue( List(1,2,3) )
// println(q)
// println(q.head)
// println(q.tail)
// val q1 = q.enqueue(5)
// println(q1.head)
// println(q1.tail)

// val list = List(1,2,3,4,5)
// println(list.reverse.init)

