object problem2 {
  def main(args: Array[String]) {
    println(findlast(list1,1))
  }
  def list1 = List(1,2,2,4,1,6)
  def findlast(xs:List[Int], x:Int):Int = {
    if (xs.reverse.head == x) xs.length-1
    else if (xs.length == 0) -1
    else findlast(xs.reverse.tail.reverse, x)
  }
}
