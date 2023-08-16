//package Q101;
//
//public class Barista {
//	
//	Espresso makeEspresso(int bean) {
//		Espresso e = new Espresso();
//		e.setBean(bean);
//		return e;
//	}
//	
//	Espresso[] makeEspressoes(int bean, int count) {
//		
//		for(int i=0; i<count; i++) {
//			ea[i].setBean(bean);
//			
//		}
//		return ea[i];
//	}
//	
//	Latte makeLatte(int bean, int milk) {
//		Latte l = new Latte();
//		l.setBean(bean);
//		l.setMilk(milk);
//		return l;
//	}
//	
//	Latte[] makeLattes(int bean, int milk, int count) {
//		Latte[] la = new Latte[count];
//		for(int i=0; i<la.length; i++) {
//			la[i].setBean(bean);
//			la[i].setMilk(milk);
//		}
//		return la;
//	}
//	
//	Americano makeAmericano(int bean, int water, int ice) {
//		Americano ame = new Americano();
//		ame.setBean(bean);
//		ame.setWater(water);
//		ame.setIce(ice);
//		return ame;
//	}
//	
//	Americano[] makeAmericanos(int bean, int water, int ice, int count) {
//		Americano[] amea = new Americano[count];
//		for(int i=0; i<amea.length; i++) {
//			amea[i].setBean(bean);
//			amea[i].setIce(ice);
//			amea[i].setWater(water);
//		}
//		return amea;
//	}
//	
//	void result() {
//		System.out.println("=================================");
//		System.out.println("판매 결과");
//		System.out.println("=================================");
//		System.out.println();
//		System.out.println("---------------------------------");
//		System.out.println("음료 판매량");
//		System.out.println("---------------------------------");
//		System.out.printf("에스프레소: %d잔\n아메리카노: %d잔\n라테: %d잔\n", Coffee.espresso, Coffee.americano, Coffee.latte);;
//		System.out.println("---------------------------------");
//		System.out.println("원자재 소비량");
//		System.out.println("---------------------------------");
//		System.out.printf("원두: %,dg\n 물: %,dml\n 얼음: %,d개\n 우유: %,dml\n", Coffee.bean, Coffee.water, Coffee.ice, Coffee.milk);
//		System.out.println("---------------------------------");
//		System.out.println("매출액");
//		System.out.println("---------------------------------");
//		System.out.printf("원두: %,d원\n 물: %,d원\n 얼음: %,d원\n 우유:%,d원", Coffee.beanTotalPrice, Coffee.waterTotalPrice, Coffee.iceTotalPrice, Coffee.milkTotalPrice);
//		
//	}
//
//}//Ba
//
//class Coffee {//공용정보 클래스
//	static int bean;
//	static int water;
//	static int ice;
//	static int milk;
//	static int beanUnitPrice;
//	static int waterUnitPrice;
//	static int milkUnitPrice;
//	static int iceTotalPrice;
//	static int beanTotalPrice;
//	static int waterTotalPrice;
//	static int milkTotalPrice;
//	static int americano;
//	static int latte;
//	static int espresso;
//	
//}//Cof
//
//class Espresso {
//	
//	private int bean;
//	
//	public int getBean() {
//		return bean;
//	}
//
//	public void setBean(int bean) {
//		this.bean = bean;
//		Coffee.bean += bean;
//		Coffee.beanTotalPrice += Coffee.beanUnitPrice;
//	}
//
//	void drink() {
//		System.out.printf("원두 %dg로 만들어진 에스프레소를 마십니다.\n", this.bean);
//	}
//	
//	
//}//Esp
//
//class Latte {
//	
//	private int bean;
//	private int milk;
//	
//	public int getBean() {
//		return bean;
//	}
//
//	public void setBean(int bean) {
//		this.bean = bean;
//		Coffee.bean += bean;
//		Coffee.beanUnitPrice += bean;
//	}
//
//	public int getMilk() {
//		return milk;
//	}
//
//	public void setMilk(int milk) {
//		this.milk = milk;
//		Coffee.milk += milk;
//		Coffee.milkTotalPrice += (milk*4);
//	}
//
//	void drink() {
//		System.out.printf("원두 %dg, 우유 %dml로 만들어진 라테를 마십니다.\n", this.bean, this.milk);
//	}
//	
//}//Lat
//
//class Americano {
//	private int bean;
//	private int water;
//	private int ice;
//	
//	public int getBean() {
//		return bean;
//	}
//
//	public void setBean(int bean) {
//		this.bean = bean;
//		Coffee.bean += bean;
//		Coffee.beanUnitPrice += bean;
//	}
//
//	public int getWater() {
//		return water;
//	}
//
//	public void setWater(int water) {
//		this.water = water;
//		Coffee.water += water;
//		Coffee.waterUnitPrice += (water*3);
//	}
//
//	public int getIce() {
//		return ice;
//	}
//
//	public void setIce(int ice) {
//		this.ice = ice;
//		Coffee.ice += ice;
//		Coffee.iceTotalPrice += (ice*3);
//	}
//
//	void drink() {
//		
//		System.out.printf("원두 %dg, 물 %dml, 얼음 %d개로 만들어진 아메리카노를 마십니다.\n", this.bean, this.water, this.ice);
//		
//	}
//	
//}//Amer