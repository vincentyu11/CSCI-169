object problem2 {
  def main(args: Array[String]) {
    forLoop(0, (x:Int)=>x<10, x=>x+1)(println("Hello World"))
  }
  
  def forLoop(i: =>Int, cond:Int=>Boolean, f:(Int)=>Int)(default: =>Unit):Unit = {
    if (cond(i)) {
      default
      forLoop(f(i), cond, f)(default)
    }
  }
}

//The most important shortcoming is that the for loop can only do one action, default.
