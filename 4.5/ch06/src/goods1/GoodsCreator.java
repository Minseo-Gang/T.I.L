package goods1;

public class GoodsCreator {
	public static Goods[] goodsCreate() {
		
		
		Goods[] arrGood = new Goods[3];
		arrGood[0] = new Goods("KIM");
		arrGood[1] = new Goods("LEE");
		arrGood[2] = new Goods("HONG");
		
		arrGood[0].setPrice(1000);
		arrGood[1].setPrice(2000);
		arrGood[2].setPrice(3000);
		
		return arrGood;
	}
	

}
