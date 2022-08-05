package jana;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Da 2 a 200, dimmi fino a che numero vuoi giocare: ");
		int numero=scan.nextInt();
		
		if(numero<2 || numero>200) {
			
			System.out.println("Il numero inserito non è valido");				
		
		} else {
		
			for(int i=2;i<=numero;i++) {
									
				if(i%3==0 ) {
					System.out.println("Fizz");
				} else if(i%5==0) {
					System.out.println("FizzBuzz");
				}else {
					System.out.println(i);
				}
			}
		}
						
					
			scan.close();
			
		}
	}


