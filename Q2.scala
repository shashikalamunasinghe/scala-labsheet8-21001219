object Q2 {
  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine("Enter an integer: ").toInt

    val result = input match {
      case x if x <= 0 => "Negative/Zero is input"
      case x if x % 2 == 0 => "Even number is given"
      case x => "Odd number is given"
    }

    println(result)
  }
}
