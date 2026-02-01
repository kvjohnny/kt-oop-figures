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
const val FIRST_CASE = 1
const val SECOND_CASE = 2
const val THIRD_CASE = 3
const val FORTH_CASE = 4
const val FIRTH_CASE = 5

class FigureSupplier {
    fun getRandomFigure(): Figure? {
        val colorSupplier = ColorSupplier()
        val figure: Figure? = when (Random.nextInt(MIN_PARAM, QUANTITY_OF_NUMBERS)) {
            FIRST_CASE -> Circle(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_PARAM, RANGE)
            )

            SECOND_CASE -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_PARAM, RANGE),
                Random.nextInt(MIN_PARAM, RANGE),
                Random.nextInt(MIN_PARAM, RANGE)
            )

            THIRD_CASE -> Rectangle(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_PARAM, RANGE),
                Random.nextInt(MIN_PARAM, RANGE)
            )

            FORTH_CASE -> RightTriangle(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_PARAM, RANGE),
                Random.nextInt(MIN_PARAM, RANGE)
            )

            FIRTH_CASE -> Square(
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
