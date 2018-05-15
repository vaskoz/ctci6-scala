package com.vaskoz.ctci6.ch1

import org.scalatest.FunSuite
import org.scalatest.prop.TableDrivenPropertyChecks._

class FourTest extends FunSuite {
  test("Four.couldBePalindrome") {
    val testdata =
      Table(
        ("given", "expected"), // First tuple defines column names
        ("Tact coa", true), // Subsequent tuples define the data
        ("a a", true),
        ("abbb", false)
      )
    forAll(testdata) { (given: String, expected: Boolean) =>
      assert(Four.couldBePalindrome(given) === expected)
    }
  }
}
