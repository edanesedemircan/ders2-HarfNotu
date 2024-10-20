package HarfNotu;

import java.util.Scanner;

public class Student {

	private  String name;
	private int avarage;
	private String harfNotu;
	
	Student(String name, int avarage){
		this.name=name;
		this.avarage=avarage;
		}
	
		public String getName() {
		return this.name;
		}
	
	
		public int getAvarage() {
		return this.avarage;
		}
	
		
		public String getharfNotu() {
		if( avarage<0) {
			return "Geçerli bir ortalama giriniz";
		}
		
		else if (avarage>=90) {
			return this.harfNotu="AA";
		}
		
		else if ((avarage<90)&&(avarage>=85)) {
			return this.harfNotu="BA";
		}
		
		else if ((avarage<85)&&(avarage>=80)) {
			return this.harfNotu="BB";
		}
		
		else if ((avarage<80)&&(avarage>=75)) {
			return this.harfNotu="CB";
		}
		
		else if ((avarage<75)&&(avarage>=65)) {
			return this.harfNotu="CC";
		}
		
		else if ((avarage<65)&&(avarage>=60)) {
			return this.harfNotu="DC";
		}

		else if ((avarage<60)&&(avarage>=55)) {
			return this.harfNotu="DD";
		}
		
			else {
			return this.harfNotu="FF kaldınız";
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Öğrenci ismini giriniz");
		String name= input.nextLine();
		
		System.out.println("ortalama giriniz");
		int avarage= input.nextInt();
		
		Student s1 = new Student(name,avarage) ;
		System.out.println("Harf Notu: "+s1.getharfNotu());
		
	
	}
	
}
