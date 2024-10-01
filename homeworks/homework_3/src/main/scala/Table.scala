import scala.collection.mutable.ArrayBuffer

class Table(width: Int, height: Int) {
    val w: Int = width
    val h: Int = height
    private val tableCells: ArrayBuffer[ArrayBuffer[Cell]] = ArrayBuffer.fill(h)(ArrayBuffer.fill(w)(new EmptyCell()))

    def getCell(ix: Int, iy: Int): Option[Cell] = {
        if (isInsideBorders(ix, iy)) Some(tableCells(iy)(ix)) else None
    }

    def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
        if (isInsideBorders(ix, iy)) tableCells(iy)(ix) = cell
    }

    def isInsideBorders(ix: Int, iy: Int): Boolean = {
        ix >= 0 && ix < w &&
          iy >= 0 && iy < h
    }
}