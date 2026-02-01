package mate.academy.model

import java.math.BigDecimal
import java.math.RoundingMode

class IsoscelesTrapezoid(
    color: Color,
    private val firstParallel: Int,
    private val secondParallel: Int,
    private val height: Int
) : Figure(color) {
    override fun draw() {
        println(
            "Figure: ${IsoscelesTrapezoid::class.simpleName?.lowercase()}, "
                    + "area: ${calculateArea()} sq. units, firstParallel: $firstParallel units, "
                    + "secondParallel: $secondParallel units, height: $height units, "
                    + "color: ${color.name.lowercase()}"
        )
    }

    override fun calculateArea(): BigDecimal {
        return (BigDecimal(firstParallel).plus(BigDecimal(secondParallel))).times(BigDecimal(height))
            .divide(BigDecimal(2), 1, RoundingMode.HALF_UP)
    }
}
