class variableExample{ // class keyword with class name
int id = 10;   //------Instance variable
String name = "vanshika is greatssssss";   //----Instance variable

int rollNo; // instance variable

static int age =20; // static variable

void display() // method
{
String status= "Active"; // local variable
System.out.println("status:"+status); // printing statement
}
public static void main(String args[]) //main method
{
variableExample var = new variableExample(); // object creation
var.display(); // non static method so we have to create object
var.rollNo= 67; // instance variable access using object

System.out.println("age"+age);
}
}