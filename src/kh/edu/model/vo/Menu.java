package kh.edu.model.vo;

public class Menu {
	private String foodName;
	private int foodPrice;
	private int menuNum;
	private String national;
	
	
	public Menu(String foodName, int foodPrice, int menuNum, String national) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.menuNum = menuNum;
		this.national = national;
	}


	public String getNational() {
		return national;
	}


	public void setNational(String national) {
		this.national = national;
	}


	public Menu() {}


	public Menu(String foodName, int foodPrice, int menuNum) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.menuNum = menuNum;
	}


	public String getFoodName() {
		return foodName;
	}


	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}


	public int getFoodPrice() {
		return foodPrice;
	}


	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}


	public int getMenuNum() {
		return menuNum;
	}


	public void setMenuNum(int menuNum) {
		this.menuNum = menuNum;
	}


	@Override
	public String toString() {
		return "Menu = " + foodName + ", 가격 = " + foodPrice + ", 메뉴 번호 = " + menuNum + ", 국가코드 = "
				+ national + "]";
	}


	
	
	
	
	

}
