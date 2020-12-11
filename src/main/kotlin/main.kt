import kotlin.math.sqrt

fun main() {
    val a = 1.0
    val b = 5.0
    val c = 1.0

    val delta = deltaFun(a,b,c)

    println("delta wynosi: $delta")

    if(delta>0){
        println("x1 = ${x1(a,b,delta)}")
        println("x2 = ${x2(a,b,delta)}")
    }

    if(delta==0.0){
        //x = -b/2*a
    }

}

fun deltaFun(a: Double, b: Double, c:Double):Double{
    return b*b-4*a*c
}

fun x1(a: Double, b: Double, delta: Double):Double{
    return (-b + sqrt(delta))/2/a
}

fun x2(a: Double, b: Double, delta: Double):Double{
    return (-b - sqrt(delta))/2/a
}
