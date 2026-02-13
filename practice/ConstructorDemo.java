class ConstructorDemo
{
	int id;
	String name ;
	int age ;
	//default constructor
	public ConstructorDemo()
	{
		System.out.println("constructor program");
	}
		void display(){
			System.out.println("ID:"+id);
			System.out.println("NAME:"+name);
			System.out.println("NAME:"+age);
		
	}
	public ConstructorDemo(int id , String name , int age)
	{
		this.id = id;
		this.name =name;
		this.age = age;
	}
	public static void main(String args[])
	{
		ConstructorDemo cd = new ConstructorDemo( 1,"vanshika",18);
		System.out.println(cd);
		cd.display();
	}
}
		
		
		
		
