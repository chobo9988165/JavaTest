package Q100;

public class Packer {
	
	static int pencilCount;
	static int eraserCount;
	static int ballPointPenCount;
	static int rulerCount;
	
	void packing(Pencil pencil) {
		
		if(pencil.getHardness().equals("4B")||pencil.getHardness().equals("3B")||
				pencil.getHardness().equals("2B")||pencil.getHardness().equals("HB")||
				pencil.getHardness().equals("B")||pencil.getHardness().equals("H")||
				pencil.getHardness().equals("2H")||pencil.getHardness().equals("3H")||
				pencil.getHardness().equals("4H")) {
		System.out.printf("포장 전 검수:%s 진하기 연필입니다.\n", pencil.getHardness());
		System.out.println("포장을 완료했습니다.");
		Packer.pencilCount++;
		} else return;
	}
	
	void packing(Eraser eraser) {
		
		if((eraser.getSize().equals("Large"))
				||(eraser.getSize().equals("Medium"))
				||(eraser.getSize().equals("Small"))){
			System.out.printf("포장 전 검수:%s 사이즈 지우개입니다.\n", eraser.getSize());
			System.out.println("포장을 완료했습니다.");
			Packer.eraserCount++;
		} else return;
		
	}
	
	void packing(BallPointPen ballPointPen) {
		
		if(ballPointPen.getThickness() == 0.3 || ballPointPen.getThickness() == 0.5 || ballPointPen.getThickness() == 0.7 || ballPointPen.getThickness() == 1.0 || ballPointPen.getThickness() == 1.5) {
			
			if(ballPointPen.getColor().equals("red")||ballPointPen.getColor().equals("blue")||ballPointPen.getColor().equals("grenn")||ballPointPen.getColor().equals("black")) {

				System.out.printf("포장 전 검수:%s 색상 %.1f 볼펜입니다.\n", ballPointPen.getColor(), ballPointPen.getThickness());
				System.out.println("포장을 완료했습니다.");
				Packer.ballPointPenCount++;
			}//Color
		}//Thick

	}
	
	void packing(Ruler ruler) {
		
		if(ruler.getLength() == 30||ruler.getLength() == 50||ruler.getLength() == 100) {
		
			if(ruler.getShape().equals("줄자")||ruler.getShape().equals("운형자")||ruler.getShape().equals("삼각자")) {

				System.out.printf("포장 전 검수:%dcm %s입니다.\n", ruler.getLength(), ruler.getShape());
				System.out.println("포장을 완료했습니다.");
				Packer.rulerCount++;
				
			}///shape
		}//length 
	}
	
	void countPacking(int type) {
		
		switch(type) {
		case 0 : System.out.printf("=====================\n"
				+ "포장 결과\n"
				+ "=====================\n"
				+ "연필 %d회\n지우개 %d회\n볼펜 %d회\n자 %d회\n", pencilCount, eraserCount, ballPointPenCount, rulerCount);
		case 1 : System.out.printf("=====================\n"
				+ "포장 결과\n"
				+ "=====================\n"
				+ "연필 %d회\n", pencilCount);
		case 2 : System.out.printf("=====================\n"
				+ "포장 결과\n"
				+ "=====================\n"
				+ "지우개 %d회\n",eraserCount);
		case 3 : System.out.printf("=====================\n"
				+ "포장 결과\n"
				+ "=====================\n"
				+ "볼펜 %d회\n", ballPointPenCount);
		case 4 : System.out.printf("=====================\n"
				+ "포장 결과\n"
				+ "=====================\n"
				+ "자 %d회\n",rulerCount);
		}
		System.out.println();
	}

}//Packer

class Pencil{
	
	private String hardness;

	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		
		this.hardness = hardness;
	}
	
	public String info() {
		return this.hardness;
	}
	
	
}//pencil

class Eraser{
	
	private String size;

	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		
		this.size = size;
	}

	public String info() {
		
		return this.size;
	}
	
	
}//eraser

class BallPointPen{
	
	private double thickness;
	private String color;
	
	public double getThickness() {
		return thickness;
	}
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String info() {
		return this.thickness + this.color;
	}
	
}//ballpoint

class Ruler{
	
	private int length;
	private String shape;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public String info() {
		return this.length + this.shape;
	}
	
	
}//ruler


