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
		
		System.out.println(g1); //toString����Ǽ� @���� �ƴ� �ʵ尪�� ����
								// �����ڰ� ��ü�� ���¸� ���� ���ؼ� ���
	}

}
