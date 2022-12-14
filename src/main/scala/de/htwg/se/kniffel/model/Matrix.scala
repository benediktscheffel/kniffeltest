package de.htwg.se.kniffel.model

case class Matrix[T](rows: Vector[Vector[String]]):
  def this(cols: Int, row_s: Int = 19) = this(Vector.tabulate(row_s, cols) { (cols, row_s) => "" })

  def cell(col: Int, row: Int): String = rows(row)(col)

  def fill(col: Int, row: Int, value: String): Matrix[T] = copy(rows.updated(row, rows(row).updated(col, value)))