package lt.arnas.seventhtask

import java.math.BigDecimal
import java.math.RoundingMode

class Circle(var radius: Int): Shape(radius,
                                     radius) {

    var pi = 3.14F
    var rounded = BigDecimal(0)
    var circleArea: Float = 0F

    override fun calculateArea() {
        circleArea = (radius * radius) * pi

        val decimal = BigDecimal("$circleArea")
        rounded = decimal.setScale(0, RoundingMode.UP)
    }

    override fun toString(): String {
        this.calculateArea()
        return "Jusu apskritimo plotas $rounded kv. cm"
    }

}