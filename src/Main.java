import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int func = sc.nextInt();
		int ht = sc.nextInt();
		double hrec = sc.nextDouble();
		double salario = ht * hrec;
	
		System.out.printf("NUMBER = %d%n", func);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		
sc.close();

	}

}
