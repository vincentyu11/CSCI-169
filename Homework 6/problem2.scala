object problem2 {
 def main(args: Array[String]) {
    println(apply_combine(square,4,add))
    println(apply_combine((x)=>x,4,mult))
 }
 def add(x:Int, y:Int) :Int = x+y
 def square(x:Int):Int = x*x
 def mult(x:Int, y:Int) :Int = x*y
 def apply_combine(f:(Int)=>Int, x:Int, g:(Int, Int)=>Int):Int = 
   if (x==1) f(1)
   else 
     g(f(x),apply_combine(f,x-1,g))
}
