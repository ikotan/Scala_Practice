object Email {
  def apply(user: String, domain: String) = user + '@' + domain
  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2) Some(parts(0), parts(1))
    else None
  }
}

object Twice {
  def apply(s: String): String = s + s
  def unapply(s: String): Option[String] = {
    val length = s.length / 2
    val half = s.substring(0, length)
    if (half == s.substring(length)) Some(half) else None
  }
}

object UpperCase {
  def unapply(s: String): Boolean = s.toUpperCase == s
}

object Domain {
  def apply(parts: String*): String =
    parts.reverse.mkString(".")
  def unapplySeq(whole: String): Option[Seq[String]] =
    Some(whole.split("\\.").reverse)
}

object ExpandedEmail {
  def unapplySeq(email: String): Option[(String, Seq[String])] = {
    val parts = email split "@"
    if (parts.length == 2)
      Some(parts(0), parts(1).split("\\.").reverse)
    else
      None
  }
}

def userTwiceUpper(s: String) = s match {
  case Email(Twice(x @ UpperCase()), domain) =>
    "match: " + x + " in domain " + domain
  case _ => "no match"
}

def isTomInDotCom(s: String): Boolean = s match {
  case Email("tom", Domain("com", _*)) => true
  case _ => false
}

val s = "tom@support.epfl.ch"
val ExpandedEmail(name, topdom, subdomes @ _*) = s
println( ExpandedEmail )

// println( isTomInDotCom("tom@sum.com") )
// println( isTomInDotCom("peter@sum.com") )
// println( isTomInDotCom("tom@acm.org") )

// println( Email.unapply("John@epfl.ch") equals Some("John", "epfl.ch") )
// println( Email.unapply("John Doe") equals None )

// val email = "ikota@gmail.com"
// email match {
  // case Email(user, domain) => println(user + domain)
// }

// println( userTwiceUpper("DIDI@hotmail.com") )
// println( userTwiceUpper("DIDO@hotmail.com") )
// println( userTwiceUpper("didi@hotmail.com") )

