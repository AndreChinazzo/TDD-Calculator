/**
 * 
 * @author Guilherme Oliveira
 * @email guilhermeoliveira564@gmail.com
 * @github gosantos
 * 
 */
public class Calculator {

	public int add(int i, int j) {
		return i + j;
	}

	public int sub(int i, int j) {
		return i - j;
	}

	public int mult(int i, int j) {
		return i * j;
	}

	public int div(int i, int j) {
		return i / j;
	}

	public String calc(int i, int j, String operator) {
		String result;

		if (operator.equals("+")) {
			result = Integer.toString(this.add(i, j));
		} else if (operator.equals("-")) {
			result = Integer.toString(this.sub(i, j));
		} else if (operator.equals("*")) {
			result = Integer.toString(this.mult(i, j));
		} else if (operator.equals("/")) {
			result = Integer.toString(this.div(i, j));
		} else {
			result = operator + " is not a valid operator";
		}

		return result;
	}

}
