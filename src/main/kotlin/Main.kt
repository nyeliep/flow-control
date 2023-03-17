fun main(args: Array<String>) {
    odd(12)
 println(  names(arrayOf("Georgia","Samantha","Soniya","Tuli","Lisa")))
    robot(3)
    robot(11)
    robot(17)
    nambari(24)


}
//Create a function that prints out all the odd numbers between 1 and 100

fun odd(num:Int){
    for (num in 1..100){
        if (num%2==1){
            println(num)
        }

    }
}

//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun names(name:Array<String>):Int{
    var x = 0
    for (nme in name) {
        if (nme.length > 5) {
            x++
        }
    }
    return x
    }


//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca-cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.
fun robot(age:Int){
    when(age){
        in 1..6 -> println("milk")
        in 7..14 -> println("fanta")
        else -> println("coca-cola")

    }

}


//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.

fun nambari(namb:Int) {
    for (nam in 1..100) {

        if (nam % 15 == 0) {
            println("FizzBuzz")
        } else if (nam % 5 == 0) {
            println("Buzz")
        } else if (nam % 3 == 0) {
            println("Fizz")
        } else {
            println(nam)
        }
    }
}