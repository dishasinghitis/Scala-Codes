object HelloWorld
{
	def main(args: Array[String]):Unit=
	{
    val number: Int = 3 
    val tableSize: Int = 5

    println(s"Multiplication Table of:")
    for (i <- 1 to tableSize) 
    {
      val product = number * i
      println(s"number * i = product")
    }
    }
}