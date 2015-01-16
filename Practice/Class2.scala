class User(val id: Long, val firstname: String, val lastname: String, val fullname: Fullname = new Fullname) {
  def getFullname() = this.fullname.get(firstname, lastname)
}

class Fullname() {
  def get(firstname: String, lastname: String) = firstname + " " + lastname
}

class FullnameInJapan() extends Fullname {
  override def get(firstname: String, lastname: String) = lastname + " " + firstname
}

object SlumDunk {
  def main(args: Array[String]) {
    val user = new User(1, "桜木", "花道")
    println(user.getFullname)

    val user2 = new User(1, "流川", "楓", new FullnameInJapan)
    println(user2.getFullname)
  }
  // main(Array())
}
