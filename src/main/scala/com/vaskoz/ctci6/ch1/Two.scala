package com.vaskoz.ctci6.ch1

object Two extends App {
  def isPermutation(s1: String, s2: String) : Boolean = s1.sorted == s2.sorted
}
