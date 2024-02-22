//Task 1: Print the alphabet
class PrintAlphabet
{
    def fun():Unit=
    {
        for(i<-'A' to 'Z')
        {
            print(i)
        }
    }
}
object Xyz
{
    def main(args:Array[String]):Unit= 
    {
        var ob=new PrintAlphabet()
        ob.fun()
    }
}