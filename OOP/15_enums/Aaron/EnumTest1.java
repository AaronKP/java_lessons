public class EnumTest1 {
	public static void main(String[] args) {
		Continents[] values = Continents.values();
		 
		for(Continents continent:values){
			System.out.println(continent +" population: "+continent.getPopulation());
		}

		// DayOfWeek[] values = DayOfWeek.values();
		 
		// for(DayOfWeek day:values){
		// 	System.out.println(day+ " excitement level: "+day.getExcitement());
		// }

	}
}
