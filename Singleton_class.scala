package Opps
/*In Scala static keyword is not available, instead of that we need to define singleton class to fulfil the requirement. 
We can create singleton class by using object keyword. 

In scala, there is no static concept. So scala creates a singleton object to provide entry point for your program 
execution.
If you don't create singleton object, your code will compile successfully but will not produce any output. Methods declared inside Singleton Object are accessible globally. 
A singleton object can extend classes and traits.
 
 */


class Student2 (id: Int, name: String, collegeName: String) 
{  
def showDetails() 
	 	{   
 	println(id)    	 	
 	println(name)   
  println(collegeName)   
	 	}   
}   

object College 
{ 
	 val collegeName: String = "ABC college" 
} 

object Singleton_class {
  
  def main(args:Array[String])={
  
  val e1 = new Student2(1, "Shakeer", College.collegeName) 
  val e2 = new Student2(2, "Shaik", College.collegeName) 
  
}
}
