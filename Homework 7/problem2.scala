object problem2 {
  def main(args: Array[String]) {
    println(listfunc(l1,l2,(x,y)=>x+y))
  }
  def l1 = List(3, 8, 1, 5)
  def l2 = List(12, 6, 23, 1)
  def listfunc(xs:List[Int], ys:List[Int], f:(Int,Int)=>Int):List[Int] = {
    if (!xs.isEmpty && !ys.isEmpty) {
      return List(f(xs.head, ys.head)) ::: listfunc(xs.tail, ys.tail, f)
    }
    else if (xs.isEmpty && !ys.isEmpty) {
      return List()
    }
    else if (!xs.isEmpty && ys.isEmpty) {
      return List()
    }
    else
      return List()
  }
}
