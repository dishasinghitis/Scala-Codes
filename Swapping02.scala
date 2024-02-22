//Write a program to swap the value of two number without using a third variable
import scala.io.StdIn as im
object Abc 
{
    def main(args:Array[String]):Unit=
    {
        print("Enter the first number: ")
        var a=im.readInt()
        print("Enter the second number: ")
        var b=im.readInt()
        a+=b;
        b=a-b;
        a-=b;
        print("After Swapping: ")
        print("\nx: "+a)
        print("\ny: "+b)
    }
}