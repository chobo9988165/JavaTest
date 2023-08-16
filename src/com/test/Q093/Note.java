package com.test.Q093;

class Note  {
	

	public void setSize(String size) {
		
		if(size.equals("A3") || size.equals("A4") 
				|| size.equals("A5") || size.equals("B3") 
				|| size.equals("B4") || size.equals("")) {
		
			this.size = size;
		} else return;
		
		if(size.equals("A3")) {
			this.price += 400;
		} else if(size.equals("A4")) {
			this.price += 200;
		} else if(size.equals("B3")) {
			this.price += 500;
		} else if(size.equals("B4")) {
			this.price += 300;
		} else if(size.equals("B5")) {
			this.price += 100;
		}
		
	}

	public void setColor(String color) {
		if(color.equals("검정색")
		  ||color.equals("흰색")
		  ||color.equals("노란색")
		  ||color.equals("파란색")) {
			this.color = color;
		}
		
		if(color.equals("검정색")) {
			this.price += 100;
		} else if(color.equals("노란색") || color.equals("파란색")) {
			this.price += 200;
		}
		
	}

	public void setPage(int page) {
		if(page < 10 && page > 200) {
			return;
		}
		
		if(page >= 10 && page <= 50) this.thickness = "얇은";
		else if(page >= 51 && page <= 100) this.thickness = "보통";
		else if(page >= 101 && page <= 200) this.thickness = "두꺼운";
		
		this.page = page;
		
		this.price += (page-10) * 10;
		
		
	}

	public void setOwner(String owner) {
		
		
		if (owner.length() <2 || owner.length() > 5) {
			return;
		}
		
		
		for(int i=0; i<owner.length(); i++) {
			
			char c = owner.charAt(i);
			
			if(c < '가' || c > '힣') {
				return;
			}
		}//for
		
		this.owner = owner;
	}

	   private String size;
	   private String color;
	   private int page;
	   private String owner;
	   private int price = 500;
	   private String thickness = "";

	   //setter, getter 구현
	   
//	   public int noteprice() {
//		   
//		   this.price = 500;
//		   
//		   if(this.size.equals("A3")) this.price += 400;
//		   else if(this.size.equals("A4")) this.price += 200;
//		   else if(this.size.equals("B3")) this.price += 500;
//		   else if(this.size.equals("B4")) this.price += 300;
//		   else if(this.size.equals("B5")) this.price += 100;
//		   
//		   if(this.color.equals("검정색")) this.price += 100;
//		   else if(this.color.equals("노란색")) this.price += 200;
//		   else if(this.color.equals("파란색")) this.price += 200;
//		   
//		   if(this.page > 10) {
//			   this.price += (this.page-10) * 10;
//		   }
//		   
//		   return price;
//	   }
	   

	   public String info() {
		   
		   	if(this.owner == null) {
		   		return String.format("■■■■■■노트정보■■■■■■\n주인 없는 노트\n■■■■■■■■■■■■■■■■■■■■■■");
		   	}
		   
	         return String.format("■■■■■■노트정보■■■■■■\n"
	         		+ "소유자: %s\n특성: %s %s %s노트\n가격: %,d원\n"
	         		+ "■■■■■■■■■■■■■■■■■■■■■■\n",this.owner, this.color, this.thickness, this.size, this.price);
	   }
}