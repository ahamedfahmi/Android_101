fun main()
{
    var count :Int = 0 //variable

    // loop & conditions
    while (count < 100)

    {
      count+=1
      if(count%3 == 0)
      {
        print("Fizz")
      }
      if(count%5 == 0)
      {
        print("Buzz")
      }
      if(isPrime(count) )
      {
        print("Prime")
      }

      if(count%3 != 0 && count%5 != 0 && isPrime(count) == false)
      {
        print(count)
      }

      println()

    }



}

/*
    Sir sorry I used function for find prime numbers
    because i don't know how to make it without function
*/


fun isPrime( num: Int ): Boolean {
    var prime = true

    if(num <= 1)
        prime = false
    else
        for(i in 2 until num) {

            if(num % i == 0) {

                prime = false
                break
            }
        }

    return prime

}
