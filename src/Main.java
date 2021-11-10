import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList<Membros> familiaSimpsons = new ArrayList<Membros>();

		Membros Vo = new Membros("Vô", 68, "pai", "masculino");
		Membros Hommer = new Membros("Hommer", 38, "pai", "masculino");
		Membros Marge = new Membros("Marge", 37, "mãe", "feminino");
		Membros Bart = new Membros("Bart", 13, "filho", "masculino");
		Membros Liza = new Membros("Liza", 12, "filha", "feminino");
		Membros Maggie = new Membros("Maggie", 3, "filha", "feminino");

		familiaSimpsons.add(Vo);
		familiaSimpsons.add(Hommer);
		familiaSimpsons.add(Marge);
		familiaSimpsons.add(Bart);
		familiaSimpsons.add(Liza);
		familiaSimpsons.add(Maggie);
		
		for(int i = 0;i< familiaSimpsons.size(); i++) {
			familiaSimpsons.get(i).print();
		}

	}

}
