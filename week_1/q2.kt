/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun maxOf3(a: Int, b: Int, c: Int): Int
{
    var max: Int
    
    max = a
    
    if(b>max)
    	max = b
    
    if(c>max)
    	max = c
    
    return max
}

fun main() {
    
    var x: Int
	
    var a = 1
    var b = 2
    var c = 3

    x = maxOf3(a,b,c);
    
    println("Maximum value among " + a + "," + b + " and " + c + " is " + x);
}
