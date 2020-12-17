/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

//what I have infered from code is we are supposed to find sum of all even number upto n


fun main() {
	
    var n: Int
    var sum = 0
    var i = 0
    
    n = 83
    while(i<=n)
    {
        if(i%2==0)
        	sum += i
        
        i++
    }
    
    println("Sum of all even numbers upto " + n + " is " + sum)

}
