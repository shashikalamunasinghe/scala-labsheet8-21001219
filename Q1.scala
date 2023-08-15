object Q1 {
  def calculateInterest: Double => Double = depositAmount => {
    if (depositAmount <= 20000) 0.02 * depositAmount
    else if (depositAmount <= 200000) 0.04 * depositAmount
    else if (depositAmount <= 2000000) 0.035 * depositAmount
    else 0.065 * depositAmount
  }

  def main(args: Array[String]): Unit = {
    val deposit = scala.io.StdIn.readLine("Enter the deposit amount: ").toDouble
    val interest = calculateInterest(deposit)
    println(f"The interest earned is Rs. $interest%.2f")
  }

}
