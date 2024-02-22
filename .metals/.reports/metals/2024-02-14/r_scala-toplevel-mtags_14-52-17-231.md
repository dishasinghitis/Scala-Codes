error id: file:///D:/Scala%20Files/method_overriding_02.scala:[666..666) in Input.VirtualFile("file:///D:/Scala%20Files/method_overriding_02.scala", "class Person
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
object ")
file:///D:/Scala%20Files/method_overriding_02.scala
file:///D:/Scala%20Files/method_overriding_02.scala:29: error: expected identifier; obtained eof
object 
       ^
#### Short summary: 

expected identifier; obtained eof