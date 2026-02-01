package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val DIVISOR = 2
const val SIZE_ARRAY_OF_FIGURES = 6
fun main() {
    val figureSupplier = FigureSupplier()
    val arrayOfFigures: Array<Figure?> = arrayOfNulls(SIZE_ARRAY_OF_FIGURES)
    for (i in 0 until SIZE_ARRAY_OF_FIGURES) {
        if (i < SIZE_ARRAY_OF_FIGURES.div(DIVISOR)) arrayOfFigures[i] = figureSupplier.getRandomFigure()
        else arrayOfFigures[i] = figureSupplier.getDefaultFigure()
    }
    for (i in 0 until SIZE_ARRAY_OF_FIGURES) arrayOfFigures[i]?.draw()
}
