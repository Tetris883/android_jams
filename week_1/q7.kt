/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun factorial(a: Int): Int
{
    var fact: Int
    var n = a;
    
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

fun main() {

    var x: Int
    
    x = 5
    
    println("Factorial of " + x + " is " + factorial(x))
}
