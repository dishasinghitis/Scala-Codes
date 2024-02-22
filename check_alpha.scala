//Check if the charater is an alphabet or not
class PrintAlphabet
{
    def fun():Unit=
    {
        print("Enter the char: ")
        var c= scala.io.StdIn.readChar()
        for(i<-'a' to 'z')
        {
            if(c==i)
            {
                print("The character is an alphabet.")
            }
            else 
            {
                print("Not an alphabet")
            }
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
