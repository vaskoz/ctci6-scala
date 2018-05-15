package com.vaskoz.ctci6.ch1

object Four {
  def couldBePalindrome(str: String): Boolean = oddOccurences(str).size <= 1

  def oddOccurences(str: String): List[(Char, Int)] = {
    val groupByLower = noSpaces(str).groupBy(char => char.toLower)
    val countOccurencesMap = groupByLower.map(countTuple => (countTuple._1, countTuple._2.length))
    val countOccurences = countOccurencesMap.toList
    val oddCountsOnly = countOccurences.filter(countTuple => countTuple._2 % 2 != 0)
    oddCountsOnly
  }

  def noSpaces(str: String): String = str.filterNot(x => x.isSpaceChar)
}
