package mate.academy.model

import java.math.BigDecimal
import java.math.RoundingMode

class Circle(color: Color, private val radius: Int) : Figure(color) {
    override fun draw() {
        println(
            "Figure: ${Circle::class.simpleName?.lowercase()}, "
                    + "area: ${calculateArea()} sq. units, "
                    + "radius: $radius units, "
                    + "color: ${color.name.lowercase()}"
        )
    }

    override fun calculateArea(): BigDecimal {
        return BigDecimal.valueOf(Math.PI).times(BigDecimal(radius)).times(BigDecimal(radius))
            .setScale(1, RoundingMode.HALF_UP)
    }
}
