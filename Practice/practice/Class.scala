class User(val id: Long, val firstname: String, val lastname: String) {
  def getFullname() = this.firstname + " " + this.lastname
}

val user = new User(1, "hoge", "fuga")
println(user.getFullname)

// class User(private val id: Long, private val firstname: String, private val lastname: String) {
  // def getFullname() = this.firstname + " " + this.lastname
// }

// val user = new User(1, "hoge", "fuga")
// println(user.id) // error
