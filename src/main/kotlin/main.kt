import kotlin.math.sqrt

fun main() {
    add(2.0,5.0)
    add(1.0,2.0)

    val a = 1.0
    val b = 5.0
    val c = 1.0

    val d = delta(a,b,c)

    println("delta wynosi: $d")

    if(d>0){
        println("x1 = ${x1(a,b,d)}")
        println("x2 = ${x2(a,b,d)}")
    }

    if(d==0.0){

    }

}

fun add(a: Double, b:Double):Double{
    return a+b
}

fun delta(a: Double, b: Double, c:Double):Double{
    return b*b-4*a*c
}

fun x1(a: Double, b: Double, delta: Double):Double{
    return (-b + sqrt(delta))/2/a
}

fun x2(a: Double, b: Double, delta: Double):Double{
    return (-b - sqrt(delta))/2/a
}
