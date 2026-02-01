package mate.academy.model

import java.math.BigDecimal
import java.math.RoundingMode

class RightTriangle(
    color: Color,
    private val firstLeg: Int,
    private val secondLeg: Int
) : Figure(color) {
    override fun draw() {
        println(
            "Figure: ${RightTriangle::class.simpleName?.lowercase()}, "
                    + "area: ${calculateArea()} sq. units, firstLeg: $firstLeg units, "
                    + "secondLeg: $secondLeg units, "
                    + "color: ${color.name.lowercase()}"
        )
    }

    override fun calculateArea(): BigDecimal {
        return BigDecimal(firstLeg).times(BigDecimal(secondLeg))
            .divide(BigDecimal(2), 1, RoundingMode.HALF_UP)
    }
}
