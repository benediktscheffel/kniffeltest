package de.htwg.se.kniffel.model

import de.htwg.se.kniffel.model.dicecup.DiceCup

class ModelFacade{
  val diceCup = new DiceCup()
  

  def newThrow() = diceCup.newThrow()
  def getResult(index: Int) = diceCup.getResult(index)
  def nextRound() = diceCup.nextRound()
  def putDicesIn(sortIn: List[Int]) = diceCup.putDicesIn(sortIn)
  def putDicesOut(sortOut: List[Int]): DiceCup = diceCup.putDicesOut(sortOut)
}





