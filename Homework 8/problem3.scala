object problem3 {
  def main(args: Array[String]) {
    println(and(1,2,(x:Int)=>x<3))
    println(or(4,2,(x:Int)=>x<3))
  }
  
  def and(x:Int, y:Int, cond:Int=>Boolean):Boolean = {
    if (cond(x)) 
      if (cond(y)) return true else return false
    else return false
  }
  
  def or(x:Int, y:Int, cond:Int=>Boolean):Boolean = {
    if (cond(x)) return true
    else 
      if (cond(y)) return true else return false
  }  
}
