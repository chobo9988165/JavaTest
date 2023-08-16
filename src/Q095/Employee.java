package Q095;

public class Employee {
//직속상사 존재, 같은 부서만
	   private String name;
	   private String[] department = {"영업부", "기획부", "총무부", "개발부", "홍보부"};
	   private String position;
	   private String tel;
	   private Employee boss;
	   private int index = 0;

	   //getter, setter 구현


	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		char c;
		
		for(int i=0; i<this.name.length(); i++) {//한글유효성검사
			
			c = this.name.charAt(i);
			
			if(!(c >= '가' && c <= '힣')) {
				return;
			}
		}//for
		
		if(this.name.length() >= 2 && this.name.length() <=5) {
			
		this.name = name;
		
		}
	}

//	public String getDepartment() {
//		return department;
  //  }

	public void setDepartment(String department) {
		
//		this.department = department;
		
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		
		char c;
		
		
		for(int i=0; i<this.tel.length(); i++) {
			c = this.tel.charAt(i);
			
			if(!this.tel.substring(0,3).equals("010") && this.tel.substring(3,4).equals("-") && this.tel.substring(8,9).equals("-")) {
				return;
			}
			
			if(c<'1' || c>'9' || c != '0') {
				return;
			}
			
		}
		
		this.tel = tel;
	}

	public Employee getBoss() {
		return boss;
	}

	public void setBoss(Employee boss) {
		this.boss = boss;
	}
	
	
	public void info() {
		
	}
}
