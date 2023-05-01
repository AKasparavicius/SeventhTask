package lt.arnas.seventhtask

class Triangle(sideOne: Int,
               sideTwo: Int): Shape(sideOne,
                                    sideTwo) {

    override fun calculateArea(){
        area = (sideOne * sideTwo) / 2
    }

}