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
    
    val d = Animal("Dog") 
    val c = Animal("Cat") 
        d.display 
        c.display 
  }
}
  
