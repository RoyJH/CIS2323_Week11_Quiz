public class RaceHorse extends Horse{
	
		public int compRaces;
		
		public void setcompRaces(int r){
				compRaces = r;
		}
		public int getcompRaces(){
				return compRaces;
		}
	
		public void printRaceHorse(){
				System.out.println("Name of horse: " + getname());
				System.out.println("Color|s|: " + getcolor());
				System.out.println("Year of birth :" + getbirthYear());
				System.out.println("Races Completed: " + getcompRaces());
		}
}