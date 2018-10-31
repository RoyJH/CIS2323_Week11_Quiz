import java.util.Scanner;
public class Horse{

		String name;
		String color;
		int birthYear;
			
		public void setname(String n){
				name = n;
		}
		public String getname(){
				return name;
		}
		void setcolor(String c){
				color = c;
		}
		public String getcolor(){
				return color;
		}
		public void setbirthYear(int y){
				birthYear = y;
		}
		public int getbirthYear(){
				return birthYear;
		}
		public void printHorse(){
				System.out.println("Name of horse: " + getname());
				System.out.println("Color|s|: " + getcolor());
				System.out.println("Year of birth :" + getbirthYear());
				System.out.println("");
		}
}