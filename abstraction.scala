//Abstraction
//used for data hiding -- for security
abstract class A 
{
    //can include abstract as well as non-abstract methods
    def m():Unit//abstract methhod
    //cannot achieve 100% abstraction through abstract class-- only 80%
    //to achieve 100% abstraction we use -- traits
    def m2():Unit=
    {
        print("\nhiiii")
    }
}
class B extends A 
{
    def m():Unit=
    {
        print("hello")
    }
}
object HelloWorld
{
    def main(args:Array[String]):Unit=
    {
        var o=new B()
        o.m()
        o.m2()
    }
}
//cannot make the object of abstract class A
//can only access it through class B