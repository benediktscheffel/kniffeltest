package de.htwg.se.kniffel.model

import de.htwg.se.kniffel.model.dicecup.DiceCup

case class Facade(diceCup: DiceCup, field: Field, game: Game):
  def newThrow() = diceCup.newThrow()
  def getResult(index: Int) = diceCup.getResult(index)
  def nextRound() = diceCup.nextRound()
  def putDicesIn(sortIn: List[Int]) = diceCup.putDicesIn(sortIn)
  def putDicesOut(sortOut: List[Int]): DiceCup = diceCup.putDicesOut(sortOut)
  def mesh() = field.mesh()
  def put(value:String, x:Int, y:Int) = field.put(value:String, x:Int, y:Int)
  
  

