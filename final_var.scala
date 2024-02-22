//final variable
class Abc 
{
    final var x:Int= 20
}
class Xyz extends Abc 
{
    override var x:Int=100
    def m2():Unit=
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
        o.x
    }
}