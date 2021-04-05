package goods1;

public class GoodsMain2 {

	public static void main(String[] args) {
		GoodsManager manager = GoodsManager.getInstance();
		Goods[] arrGood = GoodsCreator.goodsCreate();
	
		manager.setArrGood(arrGood);
		manager.showAllGoods();
	

	}

}
