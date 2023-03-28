package FasesString;

public class vuelta {
	public static void main(String[] args) {
		String entrada ="";
		String volcado ="";
		String sustituir ="";
		
		for (int i = 0; i < args.length; i++) {
			entrada +=args[i]+" ";
		}
		
		
		System.out.println("fase 1: "+entrada);
		System.out.println("fase 2: ");
		int l = entrada.length();
		for (int i = 0; i < l; i++) {
			System.out.println(entrada.charAt(i));
		}
		
		
		for (int i = l-1; i >= 0; i--) {
			volcado += entrada.charAt(i);
		}
		
		
		System.out.println("fase 3: "+volcado);
		for (int i = 0; i < l; i++) {
			
			switch (entrada.charAt(i)) {
			case 'a':
				sustituir += '4';
				break;
			case 'e':
				sustituir += '3';
				break;
			case 'i':
				sustituir += '1';
				break;
			case 'o':
				sustituir += '0';
				break;	
			case 'u':
				sustituir += '9';
				break;	
			default:
				sustituir += entrada.charAt(i);
				break;
			}
			
		}
		
		System.out.println("fase 4: "+sustituir);
		String resultado ="";
		Character separador = null;
		int i = 1;
		separador = entrada.charAt(0);
		while (true) {
			 i++;
			if(separador == entrada.charAt(i)){
				break;
			}
			switch (entrada.charAt(i)) {
			case 'a':
				resultado += '4';
				break;
			case 'e':
				resultado += '3';
				break;
			case 'i':
				resultado += '1';
				break;
			case 'o':
				resultado += '0';
				break;	
			case 'u':
				resultado += '9';
				break;	
			default:
				resultado += entrada.charAt(i);
				break;
			}
			
		}
		
		System.out.println("fase 5: "+resultado);
		
		
		
		
		
	}

}
