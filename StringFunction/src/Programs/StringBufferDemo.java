package Programs;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sbf=new StringBuffer("");
		System.out.println("capacity:"+sbf.capacity());
		System.out.println("lenght:"+sbf.length());
		sbf.append("hello, Rose Mary Joseph");
		System.out.println(sbf);
		System.out.println("capacity:"+sbf.capacity());
		System.out.println("lenght:"+sbf.length());
		sbf.append(" Welcome ");
		System.out.println(sbf);
		System.out.println("capacity:"+sbf.capacity());
		System.out.println("lenght:"+sbf.length());
		sbf.append(",hiii");
		System.out.println(sbf);
		System.out.println("capacity:"+sbf.capacity());
		System.out.println("lenght:"+sbf.length());
		
		StringBuilder sb=new StringBuilder("");
		System.out.println("\ncapacity of string builder:"+sb.capacity());
		System.out.println("lenght:"+sb.length());
		sb.append("hello, Rose Mary Joseph");
		System.out.println(sb);
		System.out.println("capacity:"+sb.capacity());
		System.out.println("lenght:"+sb.length());
		
	}

}
