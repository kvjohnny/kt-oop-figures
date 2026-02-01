package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val DIVISOR = 2
const val SIZE_ARRAY_OF_FIGURES = 6
fun main() {
    val figureSupplier = FigureSupplier()
    val arrayOfFigures: Array<Figure> = Array(SIZE_ARRAY_OF_FIGURES) { i ->
        if (i < SIZE_ARRAY_OF_FIGURES.div(DIVISOR)) figureSupplier.getRandomFigure()
        else figureSupplier.getDefaultFigure()
    }
    for (figure in arrayOfFigures) {
        figure.draw()
    }
}
