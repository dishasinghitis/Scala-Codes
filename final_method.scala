//Final method 
class Abc 
{
    final def m1()
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
