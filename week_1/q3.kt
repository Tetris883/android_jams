/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun absolute(a: Int): Int
{
    var n = a
    
    if(n>0)
    	return n
    
    else
    	return (-1*n)
}

fun main() {

	var x = -8

    println("The absolute value of " + x + " is " + absolute(x))

}
