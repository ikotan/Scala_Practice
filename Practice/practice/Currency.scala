abstract class Currency {
  val amount: Long
  def designation: String
  override def toString = amount + " " + designation
  def + (that: Currency): Currency = ...
  def * (x: Double): Currency = ...
}

val c1 = new Currency {
  val amount = 79L
  def designation = "USD"
}
println( c1 )

abstract class Dollar extends Currency {
  def designation = "USD"
}

abstract class Euro extends Currency {
  def designation = "Euro"
}

