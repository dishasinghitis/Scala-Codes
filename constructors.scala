//Create a Scala program to show the use of constructors
//Parameterized Constructors
class Abc(id: Int, name: String)
{
    def m1():Unit=
    {
        println(id + "  " + name)

    }
}
object Xyz
{
    def main(args: Array[String]):Unit= 
    {
        var i=new Abc(50,"disha")
        i.m1()
    }
}