package Opps

class Animal(name: String) 
{
  def display = println("Animal name is:"+name) 
} 

object Animal 
{ 
  def apply(name: String): Animal = 
  { 
    new Animal(name) 
   } 
} 


object Companion_Object {
  
  def main(args:Array[String]){
    
    val d = Animal("Tiger") 
    val c = Animal("Lion") 
        d.display 
        c.display 
  }
}
  
