//Hierarchial Inheritance
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
class C extends A
{
    def m3():Unit=
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
        var o1=new C();
        o1.m3();
    }
}