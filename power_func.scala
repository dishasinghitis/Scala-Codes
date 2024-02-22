class APowerN 
{
    def powerOf(A: Int, N: Int): Int =
    {
        if (N == 0) 
        {
            1
        } 
        else
        {
            A * powerOf(A, N - 1)
        }
    }
}
object Main
{
    def main(args: Array[String]): Unit = 
    {
        val aPowerN = new APowerN()
        val result = aPowerN.powerOf(5, 3)
        println("The value of 5 to the power of 3 is: " + result)
    }
}
