package com.vaskoz.ctci6.ch1

import org.scalatest.FunSuite

class TwoTest extends FunSuite {
  test("Two.isPermutation") {
    assert(Two.isPermutation("abc", "bca"))
    assert(Two.isPermutation("aabc", "abca"))
    assert(!Two.isPermutation("aabc", "abcd"))
  }
}
