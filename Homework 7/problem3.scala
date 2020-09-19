object problem3 {
  def main(args: Array[String]) {
    println(listfunctrue(l1, (x:Int)=>x%2==0))
  }
  def l1 = List(1,2,3,4)
  def listfunctrue(xs:List[Int], f:(Int)=>Boolean):List[Int] = {
    if (!xs.isEmpty) {
      if (f(xs.head)) {
        return List(xs.head) ::: listfunctrue(xs.tail, f)
      }
      else
        return listfunctrue(xs.tail, f)
    }
    else
      return List()
  }
}
