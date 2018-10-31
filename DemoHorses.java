public class DemoHorses{
	
		public static void main (String[] args){
			Horse nancy = new Horse();
			RaceHorse skipper = new RaceHorse();
			
			nancy.setcolor("black");
			nancy.setname("Nancy");
			nancy.setbirthYear(2008);
			
			skipper.setcolor("White and Black");
			skipper.setname("Skipper");
			skipper.setbirthYear(2012);
			skipper.setcompRaces(15);
			
			nancy.printHorse();
			skipper.printRaceHorse();
		}

}