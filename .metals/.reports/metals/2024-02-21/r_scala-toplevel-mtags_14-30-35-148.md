error id: file:///D:/Scala%20Files/traits_prog.scala:[71..76) in Input.VirtualFile("file:///D:/Scala%20Files/traits_prog.scala", "//Traits
//Abstraction
//used for data hiding -- for security
trait class A 
{
    def m():Unit//abstract methhod
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
")
file:///D:/Scala%20Files/traits_prog.scala
file:///D:/Scala%20Files/traits_prog.scala:4: error: expected identifier; obtained class
trait class A 
      ^
#### Short summary: 

expected identifier; obtained class