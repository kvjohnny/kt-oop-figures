package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val RANGE = 10
const val MIN_PARAM = 1
const val DEFAULT_RADIUS = 10
const val QUANTITY_OF_NUMBERS = 5

class FigureSupplier {
    fun getRandomFigure(): Figure? {
        val colorSupplier = ColorSupplier()
        val figure: Figure? = when (Random.nextInt(MIN_PARAM, QUANTITY_OF_NUMBERS)) {
            1 -> Circle(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_PARAM, RANGE)
            )

            2 -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_PARAM, RANGE),
                Random.nextInt(MIN_PARAM, RANGE),
                Random.nextInt(MIN_PARAM, RANGE)
            )

            3 -> Rectangle(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_PARAM, RANGE),
                Random.nextInt(MIN_PARAM, RANGE)
            )

            4 -> RightTriangle(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_PARAM, RANGE),
                Random.nextInt(MIN_PARAM, RANGE)
            )

            5 -> Square(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_PARAM, RANGE)
            )

            else -> (null)
        }
        return figure
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
