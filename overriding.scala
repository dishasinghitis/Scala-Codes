class Abc 
{
    def m1():Unit= 
    {
        println("hii")
    }
}
class Xyz extends Abc 
{
    override def m1():Unit= 
    {
        println("hello")
    }
}
object HelloWorld
{
    def main(args: Array[String]):Unit=
    {
        var ob=new Xyz()
        ob.m1()
    }
}