import scala.collection.mutable

def countWords(text: String) = {
  val counts = mutable.Map.empty[String, Int]
  for (rawWord <- text.split("[ !.,]+")) {
    val word = rawWord.toLowerCase
    val oldCount =
      if (counts.contains(word)) counts(word)
      else 0
    counts += (word -> (oldCount + 1))
    println( word )
    println( counts )
  }
  println( "------------------" )
  counts
}

println( countWords("See Spot run! Run Spot. Run!") )
