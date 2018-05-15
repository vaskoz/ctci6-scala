package com.vaskoz.ctci6.ch1

object Four {
  def couldBePalindrome(str: String): Boolean = oddOccurences(str).size <= 1

  def oddOccurences(str: String): List[(Char, Int)] = {
    val groupByLower = noSpaces(str).groupBy(char => char.toLower)
    val countOccurencesMap = groupByLower map { case (character, letters) => (character, letters.length) }
    val countOccurences = countOccurencesMap.toList
    val oddCountsOnly = countOccurences filter { case (character, occurences) => occurences % 2 != 0 }
    oddCountsOnly
  }

  def noSpaces(str: String): String = str.filterNot(x => x.isSpaceChar)
}
