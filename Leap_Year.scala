object Leap_Year
{
    def main(args: Array[String]): Unit=
    {
        println("Enter the year: ")
        var year=scala.io.StdIn.readInt()
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    println("This is a leap year.")
                }
                else()
                {
                    println("Nope")
                }
            }
            else()
            {
                println("This is a leap year.")
            }
        }
        else if(year%4!=0)
        {
            println("This is not a leap year.")
        }
    }
}