import javax.swing.JOptionPane;

public class Calculator{

	/**
	*
	* Funções Protegidas: Apenas para uso interno!!! 
	*/

	protected void error(String msg){
		JOptionPane.showMessageDialog(null, msg, "ERRO!", JOptionPane.ERROR_MESSAGE);
	}

	protected double relative360(double a){
		if(a > 360){
			a = a%360;
		}

		return a;
	}

	/**
	*
	* Funções Públicas: Uso Externo!!! 
	*/

	/* Aritmética Decimal */
	public double sum(double a, double b){
		return (a+b);
	}

	public double subtract(double a, double b){
		return (a-b);
	}

	public double divide(double a, double b){
		/* Não Existe Divisão por Zero! */
		if(b == 0){
			this.error("Não é possível Dividir por Zero");
			return 0;
		}
		else
		{
			return (a/b);
		}
	}

	public double multiply(double a, double b){
		return (a*b);
	}

	/* Exponenciais */
	public double squareRoot(double a){
		/* Não Existe Raiz Quadrada de número negativo! */
		if(a < 0){
			this.error("Não existe Raiz Quadrada de Número Negativo!");
			return 0;
		}
		else{
			return Math.sqrt(a);
		}
	}

	public double cubeRoot(double a){
		/* Existe Raiz Cúbica de Número Negativo! */
		return Math.pow(a, (1/3));
	}

	public double root(double a, double b){
		if(b % 2 == 0 && a < 0){
			/* Não existe raiz par-ésima de números negativos */
			this.error("Não existe Raiz \"Par-ésima\" de Número Negativo!");
			return 0;
		}
		else{
			/* Raiz Impar-ésima */
			return Math.pow(a, 1/b);
		}
	}

	public double toSquare(double a){
		return Math.pow(a, 2);
	}

	public double toCube(double a){
		return Math.pow(a, 3);
	}

	public double potency(double a, double b){
		return Math.pow(a, b);
	}

	public double module(double a){
		return Math.sqrt(Math.pow(a, 2));
	}

	/* Fatorial */
	public int factorial(int a){
		/* Não existe fatorial de números Negativos */
		if(a < 0){
			this.error("Não existe Fatorial de Número Negativo!");
			return 0;
		}
		else{
			if(a == 1 || a == 0){
				return 1;
			}
			else
			{
				return a*this.factorial(--a);
			}
		}
	}

	/* Trigonométricas */
	public double sine(double a){
		a = this.relative360(a);
		return Math.sin(a);
	}

	public double cosine(double a){
		a = this.relative360(a);
		return Math.cos(a);
	}

	public double tangent(double a){
		/* Não Existe Tangente de 90º nem de 270º!!! */
		a = this.relative360(a);

		if(a == 90 || a == 270){
			this.error("Tangente de "+Integer.toString((int) (a))+"º é inexistente!");
			return 0;
		}

		return Math.tan(a);
	}

	public double secant(double a){
		return (1/this.cosine(a));
	}

	public double cosecant(double a){
		return (1/this.sine(a));
	}

	public double cotangent(double a){
		/* Não Existe Cotangente de 90º nem de 270º!!! */
		if(a == 90 || a == 270){
			this.error("Cotangente de "+Integer.toString((int) (a))+"º é inexistente!");
			return 0;
		}

		return (1/this.tangent(a));
	}

	public double convertRadians(double a){
		return Math.toRadians(a);
	}

	public double convertDegrees(double a){
		return Math.toDegrees(a);
	}

	/* Logarítmicas */
	public double logB10(double a){
		if(a < 0){
			this.error("Logaritmando deve ser maior do que Zero!");
			return 0;
		}

		return Math.log10(a);
	}

	public double log(double a, double b){
		if(a < 0){
			this.error("Logaritmando deve ser maior do que Zero!");
			return 0;
		}
		if(b == 1 || b < 0){
			this.error("Base deve ser diferente de 1 e Maior que Zero!");
			return 0;
		}

		return (Math.log10(a)/Math.log10(b));
	}

	/* Conversões */
	public String decToBin(int a){
		String prefix = "";

		// Verificando dados negativos
		if(Integer.toString(a).charAt(0) == '-'){
			prefix = "-";
			a = Integer.parseInt(
					Integer.toString(a).substring(1, Integer.toString(a).length())
				);
		}

		if(a < 2){
			return Integer.toString(a);
		}
		return prefix+this.decToBin(a/2)+(a%2);
	}

	public String decToOct(int a){
		String prefix = "";

		// Verificando dados negativos
		if(Integer.toString(a).charAt(0) == '-'){
			prefix = "-";
			a = Integer.parseInt(
					Integer.toString(a).substring(1, Integer.toString(a).length())
				);
		}

		if(a < 8){
			return Integer.toString(a);
		}
		return prefix+this.decToOct(a/8)+(a%8);
	}

	public String decToHex(int a){
		String prefix = "";

		// Verificando dados negativos
		if(Integer.toString(a).charAt(0) == '-'){
			prefix = "-";
			a = Integer.parseInt(
					Integer.toString(a).substring(1, Integer.toString(a).length())
				);
		}

		if(a < 16){
			switch(a){
				case 10:
					return "A";
				case 11:
					return "B";
				case 12:
					return "C";
				case 13:
					return "D";
				case 14:
					return "E";
				case 15:
					return "F";
				default:
					return Integer.toString(a);
			}
		}

		String sufix = "";

		switch(a%16){
			case 10:
				sufix = "A";
				break;
			case 11:
				sufix = "B";
				break;
			case 12:
				sufix = "C";
				break;
			case 13:
				sufix = "D";
				break;
			case 14:
				sufix = "E";
				break;
			case 15:
				sufix = "F";
				break;
			default:
				sufix = Integer.toString(a%16);
				break;
		}

		return prefix+this.decToHex(a/16)+sufix;
	}

	public String binToHex(String a){
		return this.decToHex(
			Integer.parseInt(this.binToDec(a))
		);
	}

	public String binToDec(String a){
		int temp_return = 0;

		String prefix = "";

		// Verificando dados negativos
		if(a.charAt(0) == '-'){
			prefix = "-";
			a = a.substring(1, a.length());
		}

		for(int i=0; i<a.length(); i++){
			temp_return += (Character.getNumericValue(a.charAt(i))*Math.pow(2, (a.length()-1)-i));
		}
		return prefix+Integer.toString(temp_return);
	}

	public String binToOct(String a){
		return this.decToOct(
			Integer.parseInt(this.binToDec(a))
		);
	}

	public String octToHex(String a){
		return this.decToHex(
			Integer.parseInt(this.octToDec(a))
		);
	}

	public String octToDec(String a){
		int temp_return = 0;

		String prefix = "";

		// Verificando dados negativos
		if(a.charAt(0) == '-'){
			prefix = "-";
			a = a.substring(1, a.length());
		}

		for(int i=0; i<a.length(); i++){
			temp_return += (Character.getNumericValue(a.charAt(i))*Math.pow(8, (a.length()-1)-i));
		}
		return prefix+Integer.toString(temp_return);
	}

	public String octToBin(String a){
		return this.decToBin(
			Integer.parseInt(this.octToDec(a))
		);
	}

	public String hexToBin(String a){
		return this.decToBin(
			Integer.parseInt(this.hexToDec(a))
		);
	}

	public String hexToDec(String a){
		int temp_return = 0;

		String prefix = "";

		// Verificando dados negativos
		if(a.charAt(0) == '-'){
			prefix = "-";
			a = a.substring(1, a.length());
		}

		int x;

		for(int i=0; i<a.length(); i++){
			
			switch(a.charAt(i)){
				case 'A':
					x = 10;
					break;
				case 'B':
					x = 11;
					break;
				case 'C':
					x = 12;
					break;
				case 'D':
					x = 13;
					break;
				case 'E':
					x = 14;
					break;
				case 'F':
					x = 15;
					break;
				default:
					x = Character.getNumericValue(a.charAt(i));
					break;
			}

			temp_return += (x*Math.pow(16, (a.length()-1)-i));
		}
		return prefix+Integer.toString(temp_return);
	}

	public String hexToOct(String a){
		return this.decToOct(
			Integer.parseInt(this.hexToDec(a))
		);
	}

	/* Aritmética Binária */
	public String sumBin(String a, String b){
		return this.decToBin(
			(int) (
				this.sum(
					Double.parseDouble(this.binToDec(a)),
					Double.parseDouble(this.binToDec(b))
				)
			)
		);
	}

	public String subBin(String a, String b){
		return this.decToBin(
			(int) (
				this.subtract(
					Double.parseDouble(this.binToDec(a)),
					Double.parseDouble(this.binToDec(b))
				)
			)
		);
	}

	public String multBin(String a, String b){
		return this.decToBin(
			(int) (
				this.multiply(
					Double.parseDouble(this.binToDec(a)),
					Double.parseDouble(this.binToDec(b))
				)
			)
		);
	}

	/* Aritmética Hexadecimal */
	public String sumHex(String a, String b){
		return this.decToHex(
			(int) (
				this.sum(
					Double.parseDouble(this.hexToDec(a)),
					Double.parseDouble(this.hexToDec(b))
				)
			)
		);
	}

	public String subHex(String a, String b){
		return this.decToHex(
			(int) (
				this.subtract(
					Double.parseDouble(this.hexToDec(a)),
					Double.parseDouble(this.hexToDec(b))
				)
			)
		);
	}

	public String multHex(String a, String b){
		return this.decToHex(
			(int) (
				this.multiply(
					Double.parseDouble(this.hexToDec(a)),
					Double.parseDouble(this.hexToDec(b))
				)
			)
		);
	}

	/* Aritmética Octal */
	public String sumOct(String a, String b){
		return this.decToOct(
			(int) (
				this.sum(
					Double.parseDouble(this.octToDec(a)),
					Double.parseDouble(this.octToDec(b))
				)
			)
		);
	}

	public String subOct(String a, String b){
		return this.decToOct(
			(int) (
				this.subtract(
					Double.parseDouble(this.octToDec(a)),
					Double.parseDouble(this.octToDec(b))
				)
			)
		);
	}

	public String multOct(String a, String b){
		return this.decToOct(
			(int) (
				this.multiply(
					Double.parseDouble(this.octToDec(a)),
					Double.parseDouble(this.octToDec(b))
				)
			)
		);
	}

}