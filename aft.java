import java.text.SimpleDateFormat;
import java.util.Date;

public class aft {
	
	private int max_age = 0; //max-age seconds
	
	public aft(){}
	
	/*
	 * Get CurrentDate MM/dd/YY
	 * SimpleDateFormat https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
	 */
	private String getDate(){
		SimpleDateFormat f = new SimpleDateFormat("MM/dd/YY");
		return f.format(new Date());
	}
	
	/*
	 * Get 24HourTime HH:mm:ss
	 * SimpleDateFormat https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
	 */
	private String get24HourTime(){
		SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
		return f.format(new Date());
	}
	
	/**
	 * @return the max_age
	 */
	public int getMax_age() {
		return max_age;
	}

	/**
	 * @param max_age the max_age to set
	 */
	public void setMax_age(int max_age) {
		this.max_age = max_age;
	}

	public static void main(String[] args){
		aft aft = new aft();
		System.out.println("Date: "+aft.getDate()+" Time: "+aft.get24HourTime());
	}
}
