package goods1;

import java.util.Arrays;

public class GoodsManager {
	
	private static GoodsManager instance;
	private Goods[] arrGood;
	
	private GoodsManager() {
		
	}

	public static GoodsManager getInstance() {
		if(instance == null) {
			instance = new GoodsManager();
		}
		return instance;
	}
	
	
	
	public Goods[] getArrGood() {
		return arrGood;
	}

	public void setArrGood(Goods[] arrGood) {
		this.arrGood = arrGood;
	}
	
	public void showAllGoods() {
		for(Goods g : arrGood) {
			System.out.println(g);
		}
	}

	@Override
	public String toString() {
		return "GoodsManager [arrGood=" + Arrays.toString(arrGood) + "]";
	}
	
	
	
	
	
	
	
}
