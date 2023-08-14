object Question03 extends App{
  def toUpper(str: String): String = {
    str.toUpperCase()
  }

  def toLower(str: String): String = {
    str.toLowerCase()
  }

  def formatNames(name: String, formatFunc: String => String, index:Int): String = {
    var word = ""
    word += name.substring(0, index)
    word += formatFunc(name).charAt(index)
    word += name.substring(index+1)
    word
  }
  println(toUpper("Benny"))
  println(formatNames("Niroshan", toUpper, 1))
  println(toLower("Saman"))
  println(formatNames("Kumara", toUpper, 5))
}

