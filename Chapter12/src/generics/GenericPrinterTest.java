package generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial(); //T말고 Object를 썼으면, 여기에서 (Object)powderPrinter.getMaterial()이렇게 업캐스팅 해줬어야함
		System.out.println(powderPrinter); //그냥 해당 클래스만 출력이면 주소까지 나오는 형태이지만, Powder 클래스에서 toString을 해서 문자열로 변환했으므로 해당 변환한 문자열이 출력이 됨
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);//그냥 해당 클래스만 출력이면 주소까지 나오는 형태이지만, Plastic 클래스에서 toString을 해서 문자열로 변환했으므로 해당 변환한 문자열이 출력이 됨

		
//		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>(); //오류가 뜨는 이유 : Water 클래스는 Material의 상속을 못 받아서..
//		
//		waterPrinter.setMaterial(new Water());
//		Waterplastic = waterPrinter.getMaterial();
//		System.out.println(waterPrinter);
	
	}

}
