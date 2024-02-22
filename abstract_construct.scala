//Abstraction through constructor
abstract class A(x:Int)
{
    def m():Unit=
    {
        print("hello A")
    }
}
class B(x:Int) extends A(x)
{
    def m1():Unit=
    {
        print("a= "+x)
    }
}
object hw
{
    def main(args:Array[String]):Unit=
    {
        var obj1=new B(10)
        obj1.m1()
    }
}
