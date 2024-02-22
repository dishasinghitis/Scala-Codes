object IsWorkingDay
{
    def main(args:Array[String]):Unit=
    {
        print("Enter the day: ")
        var day=scala.io.StdIn.readLine()
        var sun="Sunday"
        var sat="Saturday"
        if(day==sun || day==sat)
        {
            print("Holiday!")
        }
        else 
        {
            print("Working Day.")
        }
    }
}