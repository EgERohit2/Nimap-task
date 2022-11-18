package types;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String message ="Hello world"+ "Welcome" + "Good";
		System.out.println(message);
		message.endsWith(message);
		
		
		
		System.out.println(message.endsWith(message));
		

		System.out.println(message.length());
		
		message.indexOf(message);
		
		System.out.println(message.indexOf("G"));
		
		String target;
		String replacement;
		System.out.println(message.replace(target="Good", replacement="123"));
		
		System.out.println(message.toLowerCase());       //convert string in lowercase
		
		System.out.println(message.toUpperCase());       //convert string in uppercase
		
		System.out.println(message.trim());         //used for spaces
		
		System.out.println(message  );   //String is immutable
	}

}
