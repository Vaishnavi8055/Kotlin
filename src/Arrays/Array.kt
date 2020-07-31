package Arrays

import java.util.*

/*
 * Created by Vaishnavi Chaurasia
 * 31-July-20
 * 4:37 PM
 * Kotlin
*/


fun main() {

    var characterArray1: Array<Char> = arrayOf<Char>('k', 'v', 'a', 'p', 'i', 's', 'h', 'l', 'u')

    val characterArray2 = arrayOf<Char>('k', 'v', 'a', 'p', 'i', 's', 'h', 'l', 'u')

    characterArray1 = characterArray2    // var array can be assigned

    val characterArray3 = arrayOf<Char>('k', 'v', 'a', 'p', 'i', 's', 'h', 'l', 'u')

    /* characterArray2 = characterArray1 */  // val array cannot be assigned

    characterArray1 = characterArray3

    val newArray: Array<Any> = arrayOf("Kotlin", 156, 'K', true)   // Array with all types of elements

    println(newArray.get(1))        // get(index) method of array used to access an element

    println("${newArray[2]}")                // Replacement of get(index) method

    newArray[2] = 'V'                        // Change a value in array
    println("${newArray}")                  // will print the address of array
    println(Arrays.toString(newArray))      // toString() returns a string representation of an array

    println("Size of array : ${newArray.size}")

    /* newArray[4] = "Programming"                        // Index Out Of Bound Error
     println("New Size of array :${newArray.size}") */    // Array size cannot change

}