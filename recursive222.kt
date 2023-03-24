fun main() {
   val a = 4
   
   val result = factorial(a)
   println( result )
   
}

fun factorial(a:Int):Int{
   val result:Int
   
   if( a <= 1){
      result = a
   }else{
      result = a*factorial(a-1)
   }
   
   return result
}