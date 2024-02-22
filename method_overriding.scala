//Write a program to create a class called Vehicle with a method called driving(). Create a subclass called Car that overrides the driving() method to print "Car is beautiful"
class Car 
{
    def driving():Unit=
    {
        println("This is a Car")
    }
}
class Subcar extends Car 
{
    override def driving():Unit=
    {
        println("Car is beautiful")
    }
}
object Abc
{
    def main(args: Array[String]):Unit=
    {
        var ob=new Subcar()
        ob.driving()
    }
}