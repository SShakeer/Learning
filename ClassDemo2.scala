package Opps


class Student
{
var id: Int = 10
var name: String = "Shakeer"
def m1()
{
println("Student is: "+id)
println("Student name is :"+name)
}
}
object ClassDemo2
{
def main (args: Array[String])
{
val s = new Student() //Student() --Constructor
s.m1()
}
}



  
