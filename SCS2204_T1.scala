object SCS2204_T1 {
  def main(args: Array[String]) = {
    println(calcArea(5))
    println(conv(35))
    println(calVolume(5))
    println(totalCost(60))
    println(totalTime(4, 3))
  }

  val pi = 3.14

  def calcArea(r : Int): Double = pi * r * r

  def conv(cel: Int): Double = cel * 1.8000 + 32.00

  def calVolume(r : Int): Double = 4.0/3.0 * pi * r * r * r

  def discount(copies: Double): Double = copies * 24.95 * 40/100

  def cost(copies : Double): Double = 24.95 * copies

  def shippingCost(copies: Int): Double = {
    if (copies > 50) {
      3.0 + (copies - 50) * 0.75
    }
    else {
      3.0
    }
  }

  def totalCost(copies: Int) : Double = cost(copies) - discount(copies) + shippingCost(copies)

  def easyPaceTime(distance: Int): Double = 8.0 * distance

  def tempoTime(distance: Int): Double = 7.0 * distance

  def totalTime(easyDistance: Int, tempoDistance: Int) : Double = easyPaceTime(easyDistance) + tempoTime(tempoDistance)


}
