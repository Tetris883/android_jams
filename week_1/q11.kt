/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun armstrong_no(a: Int): Boolean
{
    var n = a
    var size = 0
    
    //find no. of digits
    while(n>0)
    {
    	size++
        n=n/10
    }
    
    println("size: " + size)
    var n2 = a
    
    var sum= 0
    
    while(n2!=0)
    {
        var m = n2%10
        var p = 0
        
        var m1 = m
        while(p<(size-1))
        {
            println(m1)
            m1 *= m
            p++
        }
        
        sum += m1
        println("sum: " + sum)
        n2 = n2/10
    }
    
    println("arm_no: " + sum)
    
    if(a==sum)
    	return true
    
    else 
    	return false
    
}

fun main() {
    
    var x = 1634
    
    if(armstrong_no(x))
    	println("Its an armstrong number")
        
    else 
    	println("Its not an armstrong number")
}
