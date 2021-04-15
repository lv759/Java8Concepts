
public class Consmain {

	public static void main(String[] args) {
		/*Provider pr=()->{
			return new Student();
		};*/
		//Constructor Reference classname::new
		Provider pr=Student::new;
		Student st=pr.provide();
		st.getdata();
		
	}
}
