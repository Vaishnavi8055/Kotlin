package DataTypes

/*
 * Created by Vaishnavi Chaurasia
 * 31-Jul-20
 * 12:42 PM
 * Kotlin
*/

fun main() {

    val string = "Welcome to kotlin Language !"
    val stringLength: Int = string.length;

    println(stringLength)                       //length() method

    println("......................................................")

    //val stringIndex = string.get(13)            //get(index) method

    /*print("The character at index 13 is :- ")
    println(stringIndex)*/

    println("The character at index 13 is :- ${string.get(13)}")   //print result using string templates

    println("......................................................")

    println("The subsequence of string is : ${string.subSequence(0, 7)}")      //subsequence(startIndex,endIndex+1)

}
