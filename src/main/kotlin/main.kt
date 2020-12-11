import kotlin.math.sqrt

fun main() {
    add(2.0,5.0)
    add(1.0,2.0)

    val d = delta(1.0,2.0,5.0)
    println("delta wynosi: $d")
}

fun add(a: Double, b:Double){
    println("$a+$b = ${a+b}")
}

fun delta(a: Double, b: Double, c:Double):Double{
    return b*b-4*a*c
}

fun x1(a: Double, b: Double,delta: Double):Double{
    return (-b + sqrt(delta))/2/a
}

fun x2(a: Double, b: Double,delta: Double):Double{
    return (-b - sqrt(delta))/2/a
}
