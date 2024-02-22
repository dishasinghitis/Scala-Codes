//Create a Scala program that will ask the following question to a customer:
object User_Input
{
    def main(args: Array[String]): Unit=
    {
        println("What is your favorite book of all time?: ")
        var book=scala.io.StdIn.readLine()
        println(book + " is totally awesome.")
    }
}