package Opps

//Data can be hide using private declaration

class SBIAccount
{
 	//private val balance: Double = 500;
 	
 	val balance: Double = 500;
}
class HDFCBank
{
def m1()
{
val a = new SBIAccount()
println(a.balance) // Error
}
}
object DataHidingDemo1
{
def main (args: Array[String])
{
val a = new HDFCBank()
a.m1()
}
}

