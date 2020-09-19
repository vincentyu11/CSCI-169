object problem4 {
  def main(args: Array[String]) {
    println(listfunctrue((x:Int)=>x%2==0)(l1))
  }
  def l1 = List(1,2,3,4)
  def listfunctrue(f:(Int)=>Boolean):(List[Int])=>List[Int] = {
    (xs:List[Int])=>
      if (!xs.isEmpty) {
        if (f(xs.head)) List(xs.head) ::: listfunctrue(f)(xs.tail)
        else listfunctrue(f)(xs.tail)
      }
      else List()
  }
}
