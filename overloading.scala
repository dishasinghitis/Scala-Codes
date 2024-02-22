//Method Overloading
class Abc
{
    def m1(a:Int,b:Int):Unit=
    {
        var c=a+b 
        println(c)
    }
}
class Xyz extends Abc
{
    def m1(a:Int,b:String):Unit= 
    {
        var d=a+b
        println(d)
    }
}
object HelloWorld
{
    def main(args:Array[String]):Unit=
    {
        var ob=new Xyz()
        ob.m1(10,20)
        ob.m1(20,"Disha")

    }
}