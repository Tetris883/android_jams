/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun factorial(a: Int): Int
{
    var fact: Int
    var n = a
    
    if(n==0)
    	return 1
    
    else
    {
        fact = n
        
        while(n>1)
        {
            fact=fact*(n-1)
        	n--
        }
    }
    
    return fact
}

fun sumOfFactorials(a: Int): Int
{
    var sum = 0
    
    var n = a
    
    while(n>=0)
    {
        sum += factorial(n)
    	n--
    }
    
    return sum
}

fun main() {

    var x: Int
    
    x = 5
    
    println("Sum of factorials of " + x + " is " + sumOfFactorials(x))
}
