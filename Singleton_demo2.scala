package Opps
/*
 * In scala, there is no static concept. So scala creates a singleton object to provide entry point for your program execution.
If you don't create singleton object, your code will compile successfully but will not produce any output. 
Methods declared inside 
Singleton Object are accessible globally. A singleton object can extend classes and traits.
 */
object SingletonObject{  
    def hello()
    {  
        println("Hello, This is Singleton Object")  
    } 
    
    def addition(a:Int,b:Int) = {
      println(a+b)
    
    }
}  

object Singleton_demo2 extends App{
  
  SingletonObject.hello()         // No need to create object.  
  SingletonObject.addition(10,20)
}