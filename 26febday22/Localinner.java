package com.cts.feb26;

public class Localinner {public void display()
{
	   
	   class Local
	   {
		   public void sayHi()
		   {
			   System.out.println("Hello I am Local Inner Class");
		   }
	   }
	   Local l= new Local();
	   l.sayHi();
}

}
