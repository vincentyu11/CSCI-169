object problem1 {
 def main(args: Array[String]) {
    println(gcd(9,12))
 }
 def gcd(a:Int, b:Int):Int = 
   if (a==b) a
   else if (a>b) gcd(a-b,b)
   else gcd(a,b-a)
}
