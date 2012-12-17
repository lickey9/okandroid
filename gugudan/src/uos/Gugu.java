package uos;

public class Gugu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 2; i < 9; i++) {
			printDan(i);
			System.out.println();
		}
	}

	public static void printDan(int i) {
		for (int j = 1; j < 9; j++) {
			System.out.print(i + " x " +  j + " = " + i * j + ", ");
		}
	}
}
