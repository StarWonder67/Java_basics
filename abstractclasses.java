/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
abstract class Human{
    public void eat(){
        
    }
    abstract public void speak();
        
    
    
}

class Man extends Human{
    public void speak(){
     System.out.println("i am a man");
    }
}

class Woman extends Human{
    public void speak(){
        System.out.println("i am a woman");
    }
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Human h1 = new Man();
	    h1.speak();
	        
	    
		// your code goes here
	}
}
