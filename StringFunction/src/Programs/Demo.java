package Programs;

public class Demo {
	int var1,var2;

	Demo(){
	var1=10;
	var2=20;
	}

	Demo(int var3){
	this();
	System.out.println("var1="+var1+"\nvar2="+var2+"\nvar3="+var3);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo d=new Demo();
		Demo d1=new Demo(10);
		
	}

}
