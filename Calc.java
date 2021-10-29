import java.util.Scanner;


public class Calc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int userInput;
		double x;
		double y;
		
		
		System.out.println("Please select an option: ");
		System.out.println("1) Add");
		System.out.println("2) Sub");
		System.out.println("3) Prod");
		System.out.println("4) Div");
		System.out.println("5) Mod");
		System.out.println("6) Pow");
		System.out.println("7) End");
		
		userInput = s.nextInt();
		
//		System.out.println(userInput);
		
		while (userInput != 7) {
			switch (userInput) {
				case 1:
					System.out.println("Enter x: ");
					x = s.nextDouble();
					System.out.println("Enter y: ");
					y = s.nextDouble();
					
					double ans = x + y;
					
					System.out.println("The result of " + x + " + " + y + " = " + ans);
					
					System.out.println("What would you like to do next: ");
					
					System.out.println("1) Add");
					System.out.println("2) Sub");
					System.out.println("3) Prod");
					System.out.println("4) Div");
					System.out.println("5) Mod");
					System.out.println("6) Pow");
					System.out.println("7) End");
					userInput = s.nextInt();
					
					break;
				case 2:
					System.out.println("Enter x: ");
					x = s.nextDouble();
					System.out.println("Enter y: ");
					y = s.nextDouble();
					
					ans = x - y;
					
					System.out.println("The result of " + x + " - " + y + " = " + ans);
					
					System.out.println("What would you like to do next: ");
					
					System.out.println("1) Add");
					System.out.println("2) Sub");
					System.out.println("3) Prod");
					System.out.println("4) Div");
					System.out.println("5) Mod");
					System.out.println("6) Pow");
					System.out.println("7) End");
					userInput = s.nextInt();
					
					break;
				case 3:
					System.out.println("Enter x: ");
					x = s.nextDouble();
					System.out.println("Enter y: ");
					y = s.nextDouble();
					
					ans = x * y;
					
					System.out.println("The result of " + x + " * " + y + " = " + ans);
					
					System.out.println("What would you like to do next: ");
					
					System.out.println("1) Add");
					System.out.println("2) Sub");
					System.out.println("3) Prod");
					System.out.println("4) Div");
					System.out.println("5) Mod");
					System.out.println("6) Pow");
					System.out.println("7) End");
					userInput = s.nextInt();
					
					break;
				case 4:
					System.out.println("Enter x: ");
					x = s.nextDouble();
					System.out.println("Enter y: ");
					y = s.nextDouble();
					
					ans = x / y;
					
					System.out.println("The result of " + x + " / " + y + " = " + ans);
					
					System.out.println("What would you like to do next: ");
					
					System.out.println("1) Add");
					System.out.println("2) Sub");
					System.out.println("3) Prod");
					System.out.println("4) Div");
					System.out.println("5) Mod");
					System.out.println("6) Pow");
					System.out.println("7) End");
					userInput = s.nextInt();
					
					break;
				case 5:
					System.out.println("Enter x: ");
					x = s.nextDouble();
					System.out.println("Enter y: ");
					y = s.nextDouble();
					
					ans = x % y;
					
					System.out.println("The result of " + x + " % " + y + " = " + ans);
					
					System.out.println("What would you like to do next: ");
					
					System.out.println("1) Add");
					System.out.println("2) Sub");
					System.out.println("3) Prod");
					System.out.println("4) Div");
					System.out.println("5) Mod");
					System.out.println("6) Pow");
					System.out.println("7) End");
					userInput = s.nextInt();
					
					break;
				case 6:
					System.out.println("Enter x: ");
					x = s.nextDouble();
					System.out.println("Enter y: ");
					y = s.nextDouble();
					
					ans = Math.pow(x, y);
					
					System.out.println("The result of " + x + " ^ " + y + " = " + ans);
					
					System.out.println("What would you like to do next: ");
					
					System.out.println("1) Add");
					System.out.println("2) Sub");
					System.out.println("3) Prod");
					System.out.println("4) Div");
					System.out.println("5) Mod");
					System.out.println("6) Pow");
					System.out.println("7) End");
					userInput = s.nextInt();
					
					break;
			}
				
		}
		
		System.out.println("Thanks for using the calculator!");
		
	}

}
