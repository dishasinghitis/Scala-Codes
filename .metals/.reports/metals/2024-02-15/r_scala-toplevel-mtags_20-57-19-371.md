error id: file:///D:/Scala%20Files/percentage_grade.scala:[1552..1552) in Input.VirtualFile("file:///D:/Scala%20Files/percentage_grade.scala", "//Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:

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
    }
    def cal():Unit= 
    {
        var sum=phy+che+bio+maths+com
        var percentage=(sum/500)*100
    }
    def compare():Unit= 
    {
        if(percentage>=90)
        {
            print("Grade: A")
        }
        else if(percentage>=80 && percentage<90)
        {
            print("Grade: B")
        }
        else if(percentage>=70 && percentage<80)
        {
            print("Grade: C")
        }
        else if(percentage>=60 && percentage<70)
        {
            print("Grade: D")
        }
        else if(percentage>=40 && percentage<60)
        {
            print("Grade: E")
        }
        else
        {
            print("Grade: F")
        }
    }
}
object ")
file:///D:/Scala%20Files/percentage_grade.scala
file:///D:/Scala%20Files/percentage_grade.scala:58: error: expected identifier; obtained eof
object 
       ^
#### Short summary: 

expected identifier; obtained eof