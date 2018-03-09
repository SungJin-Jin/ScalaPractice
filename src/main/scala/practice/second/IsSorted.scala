package practice.second

import scala.annotation.tailrec

object IsSorted {
  def main(args: Array[String]) {

    require(solve(Array(1, 2, 3, 4, 5), (a0: Int, a1: Int) => a0 <= a1))

  }

  @tailrec def solve[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    if (as.length <= 1) true
    else if (!ordered(as(0), as(1))) false
    else solve(as.drop(1), ordered)
  }
}
