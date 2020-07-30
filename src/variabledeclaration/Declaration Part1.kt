package variabledeclaration

fun main() {

    /* var Variables are mutable , that is the data stored in them can change .*/
    var wholeNumber = 16
    var fractionalNumber = 6.8
    var sentence = "Kotlin is a mordern statically typed language"
    var condition = false;

    /*var Variables are immutable , that is the data stored in them cannot change .*/
    val number = 4526
    val decimalNumber = 5.6
    val name = "Kotlin"
    val conditions = true

    //var Variables can be  assigned
    wholeNumber += 20                    //We cannot change the datatype of variable hence Kotlin is known as statically Typed Language
    fractionalNumber = 45.0
    sentence = "Kotlin is Best Programming Language"
    condition = true

    //val Variables cannot be assigned

    /*number = number + 20;*/


    println("var Declaration :-")
    println(wholeNumber);
    println(fractionalNumber);
    println(sentence);
    println(condition);

    println();

    println("val Declaration :-")
    println(number)
    println(decimalNumber)
    println(name)
    println(conditions)
}
