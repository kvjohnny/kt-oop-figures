package mate.academy.model

import java.math.BigDecimal
import java.math.RoundingMode

class Square(color: Color, private val side: Int) : Figure(color) {
    override fun draw() {
        println(
            "Figure: ${Square::class.simpleName?.lowercase()}, "
                    + "area: ${calculateArea()} sq. units, side: $side units, "
                    + "color: ${color.name.lowercase()}"
        )
    }

    override fun calculateArea(): BigDecimal {
        return BigDecimal(side).times(BigDecimal(side)).setScale(1, RoundingMode.HALF_UP)
    }
}
