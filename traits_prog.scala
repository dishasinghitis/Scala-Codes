//Traits
//Abstraction
//used for data hiding -- for security
trait A 
{
    def m():Unit//abstract methhod
    //to achieve 100% abstraction we use -- traits
    def m2():Unit=//non=abstract method
    {
        print("\nhiiii")
    }
}
trait C 
{
    def m3():Unit //abstract method
}
class B extends A with C
{
    def m():Unit=
    {
        print("hello")
    }
    def m3():Unit= 
    {
        print("\nhello there")
    }
}
object HelloWorld
{
    def main(args:Array[String]):Unit=
    {
        var o=new B()
        o.m()
        o.m2()
        o.m3()
    }
}
//cannot create the object of abstract class and trait 
//cannot create the object of A and C, can only access them through the implementation class B
