/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun tri_type(a: Int, b: Int, c: Int)
{
    var equal: Int
	var stat : Boolean
    stat = false
    
    if(!((a+b)>c) || !((a+c)>b) || !((b+c)>a))
       {
           println("Triangle won't exist!!!")
           return
       }
    if(a==b)
    {
        equal = a
        stat = true
        
        if(equal == c)
        {
            println("Its an equilateral triangle")
            return
        }
    }	
    
    if(c==b)
    {
        equal = b
        stat = true
        
        if(equal == a)
        {
            println("Its an equilateral triagnle")
        	return
        }
    }	
    
    if(a==c)
    {
        equal = a
        stat = true
    	
        if(equal == b)
        {
            println("Its an equilateral triangle")
            return
        }
    }	
    
    if(stat)
    	println("Its an isocelles triangle")
        
   	else
    	println("Its a scalen triangle")
    
}

fun main() {

    var x = 12
    var y = 13
    var z = 14
    
    tri_type(x,y,z)
}
