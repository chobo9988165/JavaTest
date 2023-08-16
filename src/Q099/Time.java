package Q099;


public class Time {	
	
	private int hour;
	private int minute;
	private int second;
	
	
	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	
	public Time(int hour, int minute, int second) {
		
		this.second = second % 60;
		this.hour = (second / 60 + minute) / 60;
		this.minute = (second / 60 + minute) % 60;
		this.hour += hour;
		
	}
	
	public Time(int minute, int second) {
		
		this.second = second % 60;
		this.hour = (second / 60 + minute) / 60;
		this.minute = (second / 60 + minute) % 60;
		
	}
	
	public Time(int second) {
		
		this.second = second % 60;
		this.hour = (second / 60) / 60;
		this.minute = (second / 60) % 60;
		
	}
	
	public String info() {
		
		return String.format("%03d:%02d:%02d"
				, this.hour
				, this.minute
				, this.second);
	}

}
