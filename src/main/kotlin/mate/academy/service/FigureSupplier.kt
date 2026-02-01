package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.FigureType
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val RANGE = 10
const val MIN_PARAM = 1
const val DEFAULT_RADIUS = 10

class FigureSupplier {
    fun getRandomFigure(): Figure {
        val colorSupplier = ColorSupplier()
        return when (FigureType.values().random()) {
            FigureType.CIRCLE -> Circle(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_PARAM, RANGE)
            )

            FigureType.TRAPEZOID -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_PARAM, RANGE),
                Random.nextInt(MIN_PARAM, RANGE),
                Random.nextInt(MIN_PARAM, RANGE)
            )

            FigureType.RECTANGLE -> Rectangle(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_PARAM, RANGE),
                Random.nextInt(MIN_PARAM, RANGE)
            )

            FigureType.TRIANGLE -> RightTriangle(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_PARAM, RANGE),
                Random.nextInt(MIN_PARAM, RANGE)
            )

            FigureType.SQUARE -> Square(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_PARAM, RANGE)
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
