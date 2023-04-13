package exercicios;
import java.util.Scanner;

public class entraNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x,y;
		
		System.out.print("Digite um número: ");
		x= input.nextInt();
		
		System.out.print("Digite outronúmero diferente: ");
		y= input.nextInt();
		
		
		if(x<y) {
			System.out.print("O número " +x+ " é o menor");
		
		}else {
			if(x>y) {
				System.out.print("O número "+y+ "é menor");
			}
		}
	}

}
