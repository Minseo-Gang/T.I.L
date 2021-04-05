package goods1;

public class GoodsMain {

	public static void main(String[] args) {
		Goods g1 = new Goods();
		// g1.name = "Nikon";
		g1.setName("Nikon");
		g1.setPrice(10000);
		g1.setNumberOfStock(10);
		g1.setSold(5);
		
		System.out.println(g1.getName());
		System.out.println(g1.getPrice());
		System.out.println(g1.getNumberOfStock());
		System.out.println(g1.getSold());
		
		System.out.println(g1); //toString적용되서 @값이 아닌 필드값이 나옴
								// 개발자가 객체의 상태를 보기 위해서 사용
	}

}
