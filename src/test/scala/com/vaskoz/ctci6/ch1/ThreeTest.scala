package com.vaskoz.ctci6.ch1

import org.scalatest.FunSuite
import org.scalatest.prop.TableDrivenPropertyChecks._

class ThreeTest extends FunSuite {
  test("Three.urlify") {
    val testdata =
      Table(
        ("given", "expected"), // First tuple defines column names
        ("a", "a"), // Subsequent tuples define the data
        ("a a  ", "a%20a"),
        ("Mr John Smith    ", "Mr%20John%20Smith"),
      )
    forAll(testdata) { (given: String, expected: String) =>
      assert(Three.urlify(given) === expected)
    }
  }
}
