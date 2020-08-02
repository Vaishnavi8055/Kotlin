package ErrorsAndExceptions

import java.util.*

/*
 * Created by Vaishnavi Chaurasia 
 * 02-Aug-20
 * 1:30 PM
 * Kotlin
*/

fun main() {

    // An Error is a serious problem that does not let a program run
    // Errors can be seen in the message in Intellij IDE

    // An Exception indicates conditions that may or may not let the program run, based on the execution of the program
    // Exception can be seen in the Run in Intellij IDE

    var array1 = arrayOf(1, 2, 3, 4, 5)

    /* array1[5] = 6 */       // throws an Exception named "ArrayIndexOutOfBoundsException"

    println(Arrays.toString(array1))

    var array2: Int

    /*  println(array2)  */    // shows Compilation Error as array is not initialised

    // try-catch Example
    try {
        array1[5] = 6
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Exception !!!")
    }

    //try-catch-finally Example
    try {
        var a = 5 / 0
    } catch (e: ArithmeticException) {
        println("Exception !!!")                            //finally block is optional
    } finally {
        println("Yeah ! I caught an Exception")
    }

    //Null Pointer Exception

    var nullVal = null

    /*  var nullValue1 : String = null      // Compilation Error as a a null value cannot be a non-null type String
     println(nullValue1) */

    var nullSafteyValue: String? = null      // ? is a null-safety Operator tells the compiler it may have a null value
    println(nullSafteyValue)

    // Now the methods for a null value of String Type
    println(nullSafteyValue?.length)


    println(nullSafteyValue?.get(0))

    /* nullSafteyValue!!.length   */            /* !! is a non null asserted operator which forces IDE to give output that is not null
                                                so it will throw an Exception*/

    // Elvis Operator
    println(nullSafteyValue?.length ?: "Yeah! Its a null that's why I am your Output")

    // print array or lists without null values
    val arrayWithoutNull = arrayOf(1, 2, 3, 4, null, 8, 9, null, null)

    println(arrayWithoutNull.filterNotNull())    // filterNotNull(array) method used to print array without null values

}