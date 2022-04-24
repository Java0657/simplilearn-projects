package simplilearnExamples;



import java.util.Scanner;

public class NormalCalculater {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Input the First Number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Input the Second Number: ");
		int num2 = sc.nextInt();
		
		
		 
		
		

		while(true) {
		

		System.out.println("1.Chosse the oprator : +");
		System.out.println("2.Chosse the oprator : -");
		System.out.println("3.Chosse the oprator : *");
		System.out.println("4.Chosse the oprator : /");
		System.out.println("5.exit");
		System.out.println("\n");
		
		
		char oprator = sc.next().charAt(0);
		
		
		
		
		
		
	
	switch(oprator) {
	
	case '1':
		System.out.println("you are selected addition");
		 int sum = num1+num2;
		 System.out.println("Add result is ="+ sum);
			System.out.println("\n");

		 break;
		 
	case '2':
		System.out.println("you are selected substract");
		 int substract = num1-num2;
		 System.out.println(" substract result is = "+ substract);
			System.out.println("\n");

		 break;
		 
	case '3':
		
		System.out.println("you are selected multipication");
		 int multi = num1 * num2;
		 System.out.println("Multification result is = "+ multi);
			System.out.println("\n");

		 break;
		 
	case '4':
		
		System.out.println("you are selected divided");

			 int div = num1/num2;
			 System.out.println("Dived result is = "+ div);
			
				System.out.println("\n");	
	break;
	
	
		
    case '5':
		
		System.exit(0);

		System.out.println("\n");	

    default: 
		System.out.println("Invalid Option");
		
	}
	
	

	}



	
	
	}
	
	
}
