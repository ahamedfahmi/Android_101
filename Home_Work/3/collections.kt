/*
    What's the difference between list and array?
        **** Meaning of element is a data inside a collection ***

    Before that there are two types of list and array
         list
              1.Immutable list
              2.Mutable list
              		(Meaning of the mutable is Changeable, In this type of list we can make any changes on it)
         array
              1.Immutable array
              2.array list

          first let's see difference between non-Mutable list and array
                if we look at non-Mutable list actually we can't add,remove elements and resize the list.
                But in array we can change a specific element . but we can't add,remove elements and resize the array

          Now let's see difference between Mutable list and array list
                if we look at Mutable list actually we can add , remove elements and we can resize the list as well.
                and array list also do the same thing.
                there no difference between Mutable list and array list.

          Use-Cases
          		list
                	1.immutable list =  we can use this if we have some elements that we won't make changes in any time then list is useful.
                    2.mutable list = we can use this if we make changes in elements often.
                array
                	1.Immutable array = we can use this for if we don't need to change elements but there is a chance to change an element, it means may be.
                    2.array List = we can use this if we make changes in elements often.

          Okay now I explain more in below code.

*/


fun main()
{
    // immutable list
    var nameList = listOf<String>("Richard","Ahamed","John") // if you won't change this in any time


    // mutable list
    var coloursForPaint = mutableListOf<String>("PearlWhite","RoseRed","CharcoalBlack") // if you have to change color or remove or whatever you like you can do with this
    coloursForPaint.add("AppleGreen")// if you like to add a colour
    coloursForPaint.removeAt(1) // if you like to remove the colour represents in first index.
    // so likewise you can do whatever you like.


    // Immutable array
    var acceptableAgeGroup = arrayOf<Int>(20,25,16,19) // if you have to change an age , this will be helpful for this scenario.
    acceptableAgeGroup.set(2 , 18) // if you have to change 16 to 18 .


    //  array list
    val honda : String = "Honda"
    var carBrand = arrayListOf<String>("BMW","lamborghini","Ford","Toyota") //if you have to change brand or remove or whatever you like you can do with this
    carBrand.add(1,honda) //if you have to add Honda to this array

}
