package lt.arnas.seventhtask

open class Shape(var sideOne: Int,
                 var sideTwo: Int) {

    var area: Int = 0

    fun calculateArea(){
        area = sideOne * sideTwo
    }

    override fun toString(): String {
        return "Jusu figuros plotas yra $area kv.cm"
    }
}