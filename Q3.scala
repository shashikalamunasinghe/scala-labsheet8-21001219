object Q3 {
  def main(args: Array[String]): Unit = {

    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    val n1 = formatNames(names(0), toUpper)
    val n2 = formatNames(names(1).substring(0, 2), toUpper) + names(1).substring(2)
    val n3 = formatNames(names(2), toLower)
    val n4 = names(3).substring(0, 5) + formatNames(names(3).substring(5), toUpper)

    println(n1)
    println(n2)
    println(n3)
    println(n4)
  }

  val toUpper: String => String = str => str.toUpperCase

  val toLower: String => String = str => str.toLowerCase

  val formatNames: (String, String => String) => String = (name, myFunc) => myFunc(name)

}
