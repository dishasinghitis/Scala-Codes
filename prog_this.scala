class Student(id:Int)
{
    def this(id:Int, name:String)
    {
        this(id)
        println(id+" "+name)
    }
    println(id)
}
object obj
{
    def main(args:Array[String]):Unit=
    {
        new Student(101)
        new Student(1770,"bbgv")
    }
}