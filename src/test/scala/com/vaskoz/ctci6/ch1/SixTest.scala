package com.vaskoz.ctci6.ch1

import org.scalatest.FunSuite
import org.scalatest.prop.TableDrivenPropertyChecks._

class SixTest extends FunSuite {
  test("Six.compressed") {
    val testdata =
      Table(
        ("aaaaabbbbccccc", "a5b4c5"),
        ("abc", "a1b1c1"),
        ("aa", "a2"),
        ("aabbb", "a2b3")
      )
    forAll(testdata) { (given: String, expected: String) =>
      assert(Six.compressed(given.toList) === expected.toList)
    }
  }
}
