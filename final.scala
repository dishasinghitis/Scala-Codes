//Final keyword in scala programming
//prevent a class from inheritance
//we cannot override the method or variable from a final class
final class Abc 
{
    def m1()
    {
        print("hii")
    }
}
class Xyz extends Abc 
{
    def m2()
    {
        print("hello")
    }
}
object HelloWorld
{
    def main(args:Array[String]):Unit=
    {
        var o=new Xyz()
        o.m2()
        o.m1()
    }
}
//gives out errors: for the implementation of final
