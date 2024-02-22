import scala.io.StdIn
class Abc(id:Int, name:String)
{
    var code: Int=0;
    
    def m1():Unit=
    {
        println(id + "  " + name +"  "+ code)
    }
    def this(id:Int, name:String, code:Int)
    {
        this(id,name)
        this.code=code;
    }
}
object Xyz
{
    def main(args: Array[String]):Unit= 
    {
        var ob=new Abc(20,"disha",12)
        ob.m1()
    }
}