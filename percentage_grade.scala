//Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:

//Percentage >= 90% : Grade A
//Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C
//Percentage >= 60% : Grade D
//Percentage >= 40% : Grade E
//Percentage < 40% : Grade F
import scala.io.StdIn as im 
class Abc 
{
    def computeSum():Unit=
    {
        print("Enter the marks in Physics: ")
        var phy=im.readInt()
        print("Enter the marks in Chemistry: ")
        var che=im.readInt()
        print("Enter the marks in Biology: ")
        var bio=im.readInt()
        print("Enter the marks in Mathematics: ")
        var maths=im.readInt()
        print("Enter the marks in Computer: ")
        var com=im.readInt()

        var sum=phy+che+bio+maths+com
        var per=sum/500
        var t=100
        var percentage=per*t

        if(percentage>=90)
        {
            print("Grade: A")
        }
        else if(percentage>=80)
        {
            print("Grade: B")
        }
        else if(percentage>=70)
        {
            print("Grade: C")
        }
        else if(percentage>=60)
        {
            print("Grade: D")
        }
        else if(percentage>=40)
        {
            print("Grade: E")
        }
        else
        {
            print("Grade: F")
        }
    }
}
object Hello
{
    def main(args:Array[String]):Unit= 
    {
        var obj=new Abc()
        obj.computeSum()
    }
}
