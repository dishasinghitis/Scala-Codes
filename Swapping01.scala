//Write a program to swap the value of two number using a third variable
import scala.io.StdIn as im
object Abc 
{
    def main(args:Array[String]):Unit=
    {
        print("Enter the first number: ")
        var x=im.readInt()
        print("Enter the second number: ")
        var y=im.readInt()
        var z=0
        z=x
        x=y
        y=z
        print("After Swapping: ")
        print("\nx: "+x)
        print("\ny: "+y)
    }
}