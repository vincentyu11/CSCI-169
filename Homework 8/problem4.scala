object problem4 {
  def main(args: Array[String]) {
    val x = List[Int](1,2,3,4)
    var small = new Biguint(x)
    var big = new Biguint()
    val plusbig = big + small
  }
  
  class Biguint(x:List[Int]) {
    val list: List[Int] = x
    
    def this() = this(List[Int](0):::Nil)
    
    def this(s:String) = this( {  def convert(s:String):List[Int] =  if(s.isEmpty) Nil else convert(s.tail):::List((s.head-'0');   convert(s) } )
    
    def +(x:Biguint):Biguint = {
      def biglist(i:List[Int], j:List[Int]):List[Int] = {
        if (!i.isEmpty || !j.isEmpty) {
          return List[Int](i.head + j.head):::biglist(i.tail, j.tail)
        }
        else return List[Int]()
      }
      
      def carryover(k:List[Int]):List[Int] = {
        if (k.head > 10) {
          val templist = List[Int](k.tail.head+1):::k.tail.tail
          return List[Int](k.head-10):::carryover(templist)
        }
        else {
          return carryover(k.tail)
        }
      }
      val bigBiguint = biglist(x.list, this.list)
      val newBiguint = carryover(bigBiguint)
      return new Biguint(newBiguint)
    }
    
  }
}
