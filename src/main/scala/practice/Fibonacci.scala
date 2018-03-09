package practice

import scala.annotation.tailrec

object Fibonacci {

  def main(args: Array[String]): Unit = {
    require(solve(0) == 0)
    require(solve(7) == 13)
  }

  @tailrec def solve(count: Int, value: Int = 1, acc: Int = 0): Int =
    count match {
      case 0 => acc
      case _ => solve(count - 1, acc, acc + value)
    }
}
