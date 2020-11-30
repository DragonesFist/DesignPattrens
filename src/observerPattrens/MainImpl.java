package observerPattrens;

public class MainImpl {
	public static void main(String args[]) {
		System.out.println("Hello world");
		AverageScroe as = new AverageScroe();
		CurrrenScore cs = new CurrrenScore();
		SubjectClass sc = new SubjectClass(cs, as);
		sc.pushDataToDisplays();

	}
}
