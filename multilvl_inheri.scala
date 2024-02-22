//Multilevel Inheritance
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
class C extends B
{
    def m3():Unit=
    {
        m1();
        m2();
    }
}
object Hello 
{
    def main(args: Array[String]):Unit=
    {
        var o=new C();
        o.m3();
        
    }
}