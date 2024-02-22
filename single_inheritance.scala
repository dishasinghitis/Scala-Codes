//Single Inheritance
class A 
{
    def m1():Unit=
    {
        println("Hello!")
    }
}
class B extends A 
{
    def m2():Unit=
    {
        m1();
    }
}
object Hello 
{
    def main(args: Array[String]):Unit=
    {
        var o=new B();
        o.m2();
    }
}