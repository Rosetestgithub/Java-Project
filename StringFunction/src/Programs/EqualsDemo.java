package Programs;

public class EqualsDemo {
String var1="sunrise";
String var2="sunrise";
String var3="SUNRISE";
String var4="sunset";

public void display() {
	
	if(var1.equals(var2)) {
		System.out.println(var1+" equals "+var2);

	}
	else {
		System.out.println(var1+" not equals "+var2);
	}
	
	if(var1.equals(var3)) {
		System.out.println(var1+" equals "+var3);

	}
	else {
		System.out.println(var1+" not equals "+var3);

	}
	if(var1.equalsIgnoreCase(var3)) {
		System.out.println(var1+" equals "+var3);

	}
	else {
		System.out.println(var1+" not equals "+var3);

	}
	
	if(var1.equals(var4)) {
		System.out.println(var1+" equals "+var4);

	}
	else {
		System.out.println(var1+" not equals "+var4);

	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualsDemo demo=new EqualsDemo();
		demo.display();
	}

}
