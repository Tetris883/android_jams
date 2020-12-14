/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun pos_neg(a: Int) 
{
    if(a>=0)
    	println("-> " + a + " is greater than zero");
    
    else
    	println("-> " + a + " is less than zero")
}

fun main() {

    var x = 5
    
    pos_neg(x)
    
    x = -4
	pos_neg(x)
    
    x = 8
	pos_neg(x)
    
    x = 0
	pos_neg(x)
    
    x = -992
	pos_neg(x)
    

}
