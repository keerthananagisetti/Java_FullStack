package tcs;

public class C {
		int ssc;
		int inter;
		int btech;
	public C() {
		System.out.println("Welcome to my profile:keerthana");
	}
	public C(int ssc) {
		this.ssc=ssc;
		System.out.println("ssc marks:"+ssc);
	}
	public C(int ssc,int inter) {
		this.ssc=ssc;
		this.inter=inter;
		System.out.println("ssc marks:"+ssc+",inter marks:"+inter);
	}
   public C(int ssc,int inter,int btech) {
	   this.ssc=ssc;
	   this.inter=inter;
	   this.btech=btech;
	   System.out.println("ssc marks:"+ssc+",inter marks:"+inter+",btech marks:"+btech);
   }
	public static void main(String[] args) {
          C t1=new C();
          C t2=new C(468);
          C t3=new C(468,923);
          C t4=new C(468,923,79);
          
	}

}
