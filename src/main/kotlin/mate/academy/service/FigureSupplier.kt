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

class FigureSupplier {
    fun getRandomFigure(): Figure {
        val colorSupplier = ColorSupplier()
        val circle = Circle(
            colorSupplier.getRandomColor(),
            Random.nextInt(MIN_PARAM, RANGE)
        )
        val isoscelesTrapezoid = IsoscelesTrapezoid(
            colorSupplier.getRandomColor(),
            Random.nextInt(MIN_PARAM, RANGE),
            Random.nextInt(MIN_PARAM, RANGE),
            Random.nextInt(MIN_PARAM, RANGE)
        )
        val rectangle = Rectangle(
            colorSupplier.getRandomColor(),
            Random.nextInt(MIN_PARAM, RANGE),
            Random.nextInt(MIN_PARAM, RANGE)
        )
        val rightTriangle = RightTriangle(
            colorSupplier.getRandomColor(),
            Random.nextInt(MIN_PARAM, RANGE),
            Random.nextInt(MIN_PARAM, RANGE)
        )
        val square = Square(
            colorSupplier.getRandomColor(),
            Random.nextInt(MIN_PARAM, RANGE)
        )
        val listOfFigures = listOf(circle, isoscelesTrapezoid, rectangle, rightTriangle, square)
        return listOfFigures[Random.nextInt(listOfFigures.size)]
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
