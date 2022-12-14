package de.htwg.se.kniffel
package aview

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

import controller.Controller
import model.Field
import model.Move
import model.DiceCup

class TUISpec extends AnyWordSpec {
  "The TUI" should {
    val tui = TUI(Controller(new Field(4), new DiceCup(List(), List(1, 2, 3, 4, 5), 2)))
    "recognize the input wd 1 0 as an input to the field at the position (0,0)" in {
      tui.analyseInput("wd 1 0") should be(Some(Move("1", 0, 0)))
    }
    "recognize the input o00 as move of stone O to field (0,0)" in {
      tui.analyseInput("po 1 2 3 4 5") should be(None)
    }
    "dice the DiceCup when input is d" in {
      tui.analyseInput("wd käsekuchen") should be (None)
    }
    "quit" in {
      tui.analyseInput("q") should be (None)
    }
  }
}
