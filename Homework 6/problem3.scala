object problem3 {
 type abc = (Int,Int)=>Int
 def main(args: Array[String]) {
    def apply_square = apply_combine2((x)=>x*x)
    def apply_square_5 = apply_square(5)
    println(apply_combine2((x)=>x*x)(5)((x, y)=>x*y))
 }
 def add(x:Int, y:Int) :Int = x+y
 def square(x:Int):Int = x*x
 def mult(x:Int, y:Int) :Int = x*y
 

 def apply_combine2(f:Int=>Int):Int=>(((Int,Int)=>Int)=>Int) = {
   def help(x:Int):((Int,Int)=>Int)=>Int = {
     def help2(g:(Int,Int)=>Int):Int = {
       if (x==1) f(1)
       else g(f(x),apply_combine2(f)(x-1)(g))
     }
     help2
   }
   help
 }
}
