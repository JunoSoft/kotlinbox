fun main() {
   val a = 4
   
   val result = factorial(a)
   println( result )
   
}
//recursive where it do claculate multiply first
fun factorial(a: Int, accum: Int = 1): Int {
    val result = a * accum
    return if (a <= 1) {
        result
    } else {
        factorial(a - 1, result)
    }
}