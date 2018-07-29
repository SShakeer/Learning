package Opps
/*
 *Class: A class is a model for creating objects and it does not exists in physical. 
  (Or) A class is a specification (Theory/Plan/Idea) of properties and actions of objects.
Syntax:
class <NameOfTheClass>
{
constructor(s)
data members (variable)
method definitions (actions)
}

- by using class keyword, we can create class.
- class contains mainly two parts, variable initializations and method definitions.
- Data members represents the type of the data.
- Method definitions will perform operations on data members in class.
 * 
 * 
 * */
 

class Employee(Empno:Int, name:String)
{
def showDetails ()
{
println("Name is:" +name)
println("Employee No:" +Empno)
}
}

object ClassDemo1 {
  def main(args: Array[String])
{
var e = new Employee(37893,"Shakeer")
e.showDetails()

}
  

}