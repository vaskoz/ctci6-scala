package com.vaskoz.ctci6.ch1

object Three {
  def urlify(url: String): String = url.trim.replaceAll(" ", "%20")
}
