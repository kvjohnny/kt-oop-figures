package mate.academy.model

import java.math.BigDecimal
import java.math.RoundingMode

class Rectangle(color: Color, private val length: Int, private val width: Int) : Figure(color) {
    override fun draw() {
        println(
            "Figure: ${Rectangle::class.simpleName?.lowercase()}, "
                    + "area: ${calculateArea()} sq. units, "
                    + "length: $length units, width: $width units, "
                    + "color: ${color.name.lowercase()}"
        )
    }

    override fun calculateArea(): BigDecimal {
        return BigDecimal(length).times(BigDecimal(width)).setScale(1, RoundingMode.HALF_UP)
    }
}
