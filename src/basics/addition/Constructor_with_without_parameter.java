package basics.addition;

public class Constructor_with_without_parameter {
	
		//constructor
		void person(){
			System.out.println("hello motto");
		}
		
		void person(String args) {
			System.out.println(args);
		}
		
		public static void main(String[] args) {
			Constructor_with_without_parameter cw = new Constructor_with_without_parameter();
			cw.person();
			cw.person("hellew");
		}

}
