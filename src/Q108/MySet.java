package Q108;

public class MySet {
	
	private String[] MySet;
	private int index = 0;
	
	public MySet() {
		
		this.MySet =  new String[1];
		
	}
	
	
	boolean add(String value) {
		
		if(checkLength()) {
			doublig();
		}
		
		for(int i=0; i<this.MySet.length; i++) {
			if(value.equals(this.MySet[i])) {
				return false;
			}
		}
		
		this.MySet[this.index] = value;
		this.index++;
		return true;
		
	}
	
	private void doublig() {
		
		String[] temp = new String[this.MySet.length * 2];
		this.MySet = temp;
		
	}


	private boolean checkLength() {
		
		if(this.MySet.length == this.index) {
		return true;
		} else return false;
	}


	int size() {
		
		return this.MySet.length;
		
	}
	
	boolean remove(String value) {
		

		
		
		
		for(int i=0; i<this.MySet.length; i++) {
			
			if(this.MySet[i].equals(value)) {
				this.MySet[i] = this.MySet[i+1];
			} else {
				System.out.println("입력한 이름이 존재하지 않음");
				return false;
			}
		}
		resizing();
		
		return true;
	}
	
	private void resizing() {
		String temp[] = new String[this.index];
		
		this.MySet = temp;
	}


	void clear() {
		
		this.index = 0;
		
	}
	
	boolean hasNext() {
		
		if(this.MySet[this.index + 1] != null) {
			return true;
		} else return false;
		
	}
	
	String next() {
		
		if(this.MySet[this.index +1] != null) {
			return this.MySet[this.index+1];
		} else return String.format("값이 없습니다.");
		
	}
	
	

}
