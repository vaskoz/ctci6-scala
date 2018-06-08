package com.vaskoz.ctci6.ch1

import scala.annotation.tailrec


object Six {
  @tailrec
  def compressed(input: List[Char], output: List[Char] = Nil): List[Char] = input match {
    case Nil => output
    case a :: t =>
      val (cnt, tail) = count(a, t, 1)
      compressed(tail, output ::: a :: cnt.toString.toList)
  }

  @tailrec
  def count(ch: Char, lst: List[Char], total: Int = 0): (Int, List[Char]) = lst match {
    case c :: tail if c == ch => count(c, tail, total + 1)
    case _ => total -> lst
  }
}
