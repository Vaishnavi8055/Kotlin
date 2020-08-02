package RealLifeApplication

/*
 * Created by Vaishnavi Chaurasia
 * 02-Aug-20
 * 04:28 PM
 * Kotlin
*/


fun main() {

    val res1 = Restaurants("5 Star Galaxy", 5.0, 300)

    val res2 = Restaurants("Wingston", 4.6, 270)

    val res3 = Restaurants("Hotel Galaxy", 4.8, 295)

    val res4 = Restaurants("Brijwasi Lands Inn", 5.0, 500)

    val res5 = Restaurants("Brijwasi Royal", 4.7, 290)

    /* println(res1)

      println(res2)

      println(res3)          // It will print the hashcode

      println(res4)

      println(res5) */

    println(res1)

    println(res2)

    println(res3)

    println(res4)

    println(res5)

    println()

    // Restaurants can be many so its difficult to make objects for each

    var restaurantList = mutableListOf(res1, res2, res3)

    restaurantList.add(res4)
    restaurantList.add(res5)

    println(restaurantList)     // all are in one line

    println()

    for (i in restaurantList) {
        println(i)
    }

}