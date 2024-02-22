class Person
{
    def getFirstName():Unit=
    {
        println("Enter the first name: ")
        var first=scala.io.StdIn.readLine()
    }
    def getLastName():Unit=
    {
        println("Enter the last name: ")
        var last=scala.io.StdIn.readInt()
    }
}
class Employee extends Person 
{
    def getEmpId():Unit=
    {
        println("Enter the ID: ")
        var id=scala.io.StdIn.readInt()
    }
    override def getLastName(): Unit =
    {
        println("Enter the last name: ")
        var last=scala.io.StdIn.readLine()
        println("Enter the job title: ")
        var job=scala.io.StdIn.readLine()
    }
}
object Xyz
{
    def main(args:Array[String]):Unit=
    {
        var obj=new Employee()
        obj.getFirstName()
        obj.getLastName()
        obj.getEmpId()
    }
}