package KAMESH;
public class inheritence {

	public static void main(String[] args) {
		son1 obj=new son1();
		obj.displaygrandfather();
		obj.displayfather();
		obj.displayson();
		
	}
}		

  class grandfather1 {

		String gfname="govi";
		String gmname="kili";
		public void displaygrandfather(){
			System.out.println("GFname  :"+gfname );
			System.out.println("GFname  :"+gmname );
		}

	}
 class father1 extends grandfather1{
	String fname="ven";
	String mname="anu";
	public void displayfather() {
		System.out.println("fname :"+fname);
		System.out.println("mname :"+mname);
	}

}
 class son1 extends father1 {
	String sname1="kamesh";
	String sname2="archana";
	String sname3="priyanka";
	void displayson() {
		System.out.println("sname  :"+sname1);
		System.out.println("sname  :"+sname2);
		System.out.println("sname  :"+sname3);
	}

}

