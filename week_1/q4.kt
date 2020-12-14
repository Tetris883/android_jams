/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun div_5_11(a: Int)
{
    if((a%5==0) && (a%11==0))
    	println("the given number is divisible by both 5 and 11")
        
    else if(a%5==0)
    	println("the given number is only divisible by 5")
        
    else if(a%11==0)
    	println("the given number is only divisible by 11")
        
    else
    	println("the given number is neither divisible by 5 nor by 11")
        
        
}

fun main() {

    var x = 55
    
    div_5_11(x)
}
