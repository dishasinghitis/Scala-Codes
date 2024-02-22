object Leap_Year
{
    def main(args: Array[String]): Unit=
    {
        var year=2024
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
                println("This is a leap year..")
            }
        }
        else()
        {
            println("This is not a leap year.")
        }
    }
}