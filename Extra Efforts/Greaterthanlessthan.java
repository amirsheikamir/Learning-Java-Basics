public class GreaterLessThan {
	public static void main(String[] args) {   
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
    boolean canBuyLaptop = creditsAfterSeminar > creditsToGraduate;
    System.out.print(canBuyLaptop);
	}
}