package com.vaskoz.ctci6.ch1

import org.scalatest.FunSuite

class OneTest extends FunSuite {
  test("One.isUnique") {
    assert(One.isUnique("abc"))
    assert(!One.isUnique("aabc"))
  }
}
