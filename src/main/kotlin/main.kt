import kotlin.math.sqrt

fun main() {
    val a = 1.0
    val b = 5.0
    val c = 1.0

    equation(a,b,c)
    equation(1.0,5.0,8.0)
}

fun equation(a: Double, b: Double, c:Double){

    if(a!=0.0&&b!=0.0&&c!=0.0){
        //ax^2+bx+c = 0
        println("Obliczam rowziązania równania kwadratowego: ${a}x^2 + ${b}x + $c = 0")
    }

    if(a==0.0&&b!=0.0&&c!=0.0){
        //bx+c = 0
        println("Obliczam rowziązania równania liniowego: ${b}x + $c = 0")
    }

    val delta = deltaFun(a,b,c)

    println("delta wynosi: $delta")

    if(delta>0){
        println("Równanie posiada dwa rozwiązania: ")
        println("x1 = ${x1(a,b,delta)}")
        println("x2 = ${x2(a,b,delta)}")
    }

    if(delta==0.0){
        println("Równanie posiada jedno rozwiązanie: ")
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
