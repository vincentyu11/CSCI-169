object problem1 {
  def main(args: Array[String]) {
    println(alternate(l1, l2))
  }
  def emptylist = List()
  def l1 = List(1, 2, 3, 4)
  def l2 = List(7, 8, 9, 10, 11, 12)
  def alternate(xs:List[Int], ys:List[Int]):List[Int] = {
    if (!xs.isEmpty && !ys.isEmpty) {
      return List(xs.head, ys.head) ::: alternate(xs.tail, ys.tail)
    }
    else if (xs.isEmpty && !ys.isEmpty) {
      return List(ys.head) ::: alternate(xs, ys.tail)
    }
    else if (!xs.isEmpty && ys.isEmpty) {
      return List(xs.head) ::: alternate(xs.tail, ys)
    }
    else
      return List()
  }
}
