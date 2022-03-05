fun main( a:String, b:String, c:String) {

    println("Digit three values: ")

    val threevalues = readLine()!!.toFloat()


    if (a + b > c && b + c > a && a + c > b) {
        println("The three sides will make a triangle!" )
        if(a == b && a == c)
            println()
    }
    else
        println("The three sides don't make a triangle!")

}