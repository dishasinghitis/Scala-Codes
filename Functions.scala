object Ob1
{
  def main(args: Array[String]): Unit=
  {
    function(10,20)
    m1()
  }
  def function(a:Int,b:Int): Unit=
  {
    var c=a+b 
    println(c)
  }
  def m1(): Unit=
  {
    println("hello!")
  }
}