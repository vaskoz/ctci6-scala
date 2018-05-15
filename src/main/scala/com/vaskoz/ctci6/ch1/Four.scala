package com.vaskoz.ctci6.ch1

object Four {
  def couldBePalindrome(str: String): Boolean = oddOccurences(str).size <= 1

  def oddOccurences(str: String): List[(Char, Int)] = {
    val groupByLower = noSpaces(str).groupBy(x => x.toLower)
    val countOccurences = groupByLower.map(x => (x._1, x._2.length)).toList
    countOccurences.filter(x => x._2 % 2 != 0)
  }
  
  def noSpaces(str: String): String = str.filterNot(x => x.isSpaceChar)
}
