//Write a program to input basic salary of an employee and calculate its Gross salary according to following:

//Basic Salary <= 10000 : HRA = 20%, DA = 80%
//Basic Salary <= 20000 : HRA = 25%, DA = 90%
//Basic Salary > 20000 : HRA = 30%, DA = 95%
import scala.io.StdIn as im 
object Abc
{
    def main(args:Array[String]):Unit=
    {
        print("Enter the salary: ")
        var sal=im.readInt()
        print("Calculating Gross Salary: ----------------")
        if(sal<=10000)
        {
            var hra=sal*0.20
            var da=sal*0.80
            var gs=sal+hra+da
            print("\nGross Salary: "+gs)
        } 
        else if(sal<=20000 && sal>10000)
        {
            var hra=sal*0.25
            var da=sal*0.90
            var gs=sal+hra+da
            print("\nGross Salary: "+gs)
        }
        else
        {
            var hra=sal*0.30
            var da=sal*0.95
            var gs=sal+hra+da
            print("\nGross Salary: "+gs)
        }
    }
}