import java.util.Scanner;

public class Program {
	public static final int ROOMS = 10;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[ROOMS];
		String[] emails = new String[ROOMS];
		
		System.out.print("How many rooms will be rented? ");
		int rentingAmount = sc.nextInt();
		
		for(int i=0; i<rentingAmount; i++) {
			System.out.printf("\nRent #%d:\n", i + 1);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			names[room - 1] = name;
			emails[room - 1] = email;
		}
		
		System.out.printf("\nBusy rooms:\n");
		
		for(int i=0; i<names.length; i++) {
			if (names[i] != null) {
				System.out.printf("%d: %s, %s\n", i + 1, names[i], emails[i]);
			}
		}
		
		sc.close();
	}
}
