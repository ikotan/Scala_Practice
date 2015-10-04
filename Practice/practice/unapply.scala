trait Person {
  val name: String
  val age: Int
  val country: String
  val email: String
}

case class Male (
  name: String,
  age: Int,
  country: String,
  email: String
) extends Person

case class Female (
  name: String,
  age: Int,
  country: String,
  email: String
) extends Person

val p = Male("Taro", 30, "Japan", "taro@example.jp")
println(p)

// p match {
  // case p: Male =>
  // case p: Female =>
// }

p match {
  case Male("Taro", 30, country, email) => println("Male1")
  case Male("Jiro", age, "America", email) =>
  case Male(name, 20, "China", email) =>
  case Male("Jane", age, "America", email) =>
}


// vim: set ts=4 sw=4 et:
