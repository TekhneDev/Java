import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String nome = "Maria";
		int idade = 19;
		double renda = 4900.0;
		
		
		
		int x = 19;
		double y = 5.6789;
		System.out.println(x);
		System.out.printf("%.2f%n", y);
		System.out.printf("%.4f%n", y);
		System.out.println("RESULTADO = " + x +" METROS.");
		System.out.printf("RESULTADO = %.2f METROS.%n", y);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
