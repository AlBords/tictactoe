package org.d12k.tictactoe.lib

import org.scalatest._
import funsuite._
import org.d12k.tictactoe.lib.{aTest}

class EngineTest extends AnyFunSuite {
  test("Test the test") {
    assert("test".equals(aTest()))
  }
}