//Create a Scala program to show the use of constructors
//Parameterized Constructors
class Abc()
{
    var id: Int=0;
    var code:Int=0;
    var name: String=null;
    def m1():Unit=
    {
        println(id + "  " + name +"  "+ code)
    }
}
object Xyz
{
    def main(args: Array[String]):Unit= 
    {
        var ob=new Abc()
        ob.m1()
    }
}