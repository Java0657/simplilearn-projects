package simplilearnExamples;

public class Example1 {

	public static void main(String[] args) {
		dog d = new dog();
		employee e = new employee();
		
		d.name="labdog";
		d.color ="red";
		d.cost= 2000;
		
		
		e.name="rahul";
		e.salary =2000;
		e.id = 123;
		
		System.out.println(d.name);

		System.out.println(d.color);
		System.out.println(d.cost);
		
		System.out.println(".........................");
		System.out.println(e.name);
		System.out.println(e.salary);
		System.out.println(e.id);
}

}
class dog{
	
	 String name ;
	 String color;
	 int cost;
}

class employee{
	String name;
	int  salary;
	int id;
	
	
}

