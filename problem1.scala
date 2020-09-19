object problem1 {
  def main(args:Array[String]){
    val t1 = Leaf
    val t2 = t1 insert 5 insert 4
    val t3 = Leaf
    val t4 = t3 insert 5 insert 4 insert 10 insert 29
    val t5 = t3 insert 5 insert 20
    println(t2)
    t2.printy(0)
    print(t2.depth)
    print("\n")
    print(t2 exactsubtree t4)
    print("\n")
    print(t2 exactsubtree t5)
  }
  abstract class BSTree{
    def member(x: Int): Boolean
    def insert(x: Int): BSTree
    def printy(level:Int):Unit
    def depth:Int
    def exactsubtree(that:BSTree):Boolean
  }
  
  case object Leaf extends BSTree{
    def member(x:Int):Boolean = false
    def insert(x:Int):BSTree = new Node(x, Leaf, Leaf)
    def printy(level:Int):Unit = {
      def loop(x:Int):Unit = if(x==0) print("  ") else {print("  "); loop(x-1)}
      loop(level)
      println("Leaf")
    }
    def depth:Int = {
      return 0
    }
    def exactsubtree(that:BSTree):Boolean = {
      that match {
        case Leaf => true
        case Node(_,_,_) => false
      }
    }
  }
  
  case class Node(value:Int, left:BSTree, right:BSTree) extends BSTree{
    def member(x: Int): Boolean =
      if(x>value) right.member(x)
      else if(x<value) left member x
      else true
    def insert(x: Int): BSTree =
      if(x<value)  new Node(value, left insert x, right)
      else if(x>value) new Node(value, left, right insert x)
      else new Node(value, left, right)
    def printy(level:Int):Unit = {
      right.printy(level+1);
      def loop(x:Int):Unit = if(x==0) print("  ") else {print("  "); loop(x-1)}
      loop(level)
      println(value); left.printy(level+1)}
    def depth:Int = {
      return 1 + List(left.depth, right.depth).max
    }
    def exactsubtree(that:BSTree):Boolean = {
      that match {
        case Leaf => false
        case Node(v,l,r) => 
          if (v!=value) false
          else (left exactsubtree l) || (right exactsubtree r)
      }
    }
  }
}