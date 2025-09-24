package Programs;

public class StringConcatenation {
	String first_name="rose mary";
	String last_name="joseph";
	
	public void display() {
		
		System.out.println("concatenating the two strings in the simplest way:"+first_name+" "+last_name);
		System.out.println("concatenating two strings using concat method:"+first_name.concat(last_name));
		System.out.println("concatenating two strings using join method:"+String.join("",first_name, last_name));
	}
	

	public static void main(String[] args) {

		
		// TODO Auto-generated method stub
		StringConcatenation concat=new StringConcatenation();
		concat.display();
	}

}
