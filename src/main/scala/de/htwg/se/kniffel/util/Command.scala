package de.htwg.se.kniffel.util

trait Command:
  def undoStep(): Unit
  def redoStep(): Unit
  def doStep(): Unit

class UndoManager {
   var undoStack: List[Command]= Nil
   var redoStack: List[Command]= Nil

  def doStep(command: Command) = {
    undoStack = command::undoStack
    redoStack = Nil
    command.doStep()
  }
  def undoStep  = {
    undoStack match {
      case  Nil =>
      case head::stack =>
        head.undoStep()
        undoStack=stack
        redoStack= head::redoStack

    }
  }
  def redoStep = {
    redoStack match {
      case Nil =>
      case head::stack =>
        head.redoStep()
        redoStack=stack
        undoStack=head::undoStack

    }
  }
}