	/**
	 * Almanac stores and manages an array of City objects.
	 */
	public class Almanac {
		City[] list;
		public String[] name;
		public int[] population;
		public Almanac() {
			list = new City[5];
	
			list[0] = new City(1581000, "Philadelphia");
			list[1] = new City(486290 , "Atlanta");
			list[2] = new City(486290 , "Boston");
			list[3] = new City(8623000, "New York");
			list[4] = new City(28491, "West Windsor");
			population = new int[list.length];
			for(int i = 0; i != list.length;i++){population[i]= list[i].getPopulation();}

			name = new String[list.length];
			for(int i = 0; i != list.length;i++){name[i]= list[i].getName();}
		}
	
	
		/**
		 * Displays List of Cities
		 */
		public void printList() {
		
			System.out.println("name	          Population");
			 for (int i = 0; i < list.length; i++) {
					if(list[i]!=null) { 
						System.out.println( list[i] );}
				           
				  }
		}
	
		/**
		 * Finds the city with the smallest population return the name.
		 */
		public String smallestPop() {
			int a = 0;
			 int minValue = population[0]; 
			    for(int i=0;i<population.length;i++){ 
			      if(population[i] < minValue){ 
			        minValue = population[i]; 
			        a = i;
			       
			      } 
			     
			    }
			    return name[a];
		}
		/**
		 * Returns the average population
		 */
		public int averagePop() {
			 int sum = 0;
			    int average;

			    for(int i=0; i < population.length; i++){
			        sum = sum + population[i];
			    }
			    average = (int)sum/population.length;
			    
			    return average;    
		}
	
		
		/**
		 * Changes the population of a City that matches searchName to newPopulation
		 */
		public void changePop(String searchName, int newPopulation) {
			int a = 0;
			  for(int i=0; i < name.length; i++){
			        if(name[i] == searchName) {
			        	list[i].setPopulation(newPopulation);
			        	a = i;
			        }
			    }
			  System.out.println("The population of " + name[a] + " has been changed to : " + population[a]);
		}
	
	
		/**
		* This method will add rate % to each population in the list
		* e.g. increasePop(5) will increase each city's population by 5%
		*/
		public void increasePop(double rate) {
			double percent = (rate * 0.01) + 1 ;
			  for(int i=0; i < name.length; i++){
				
				  list[i].setPopulation( (int) (population[i] * percent));
			        	
			        }
			  System.out.println("The population of all city's has been Increased by : " +  rate + "%" );
			    }
			
		
		public static void main(String[] args) {
			Almanac one = new Almanac();
			one.printList();
			System.out.println();
			System.out.println("Average Population: " + one.averagePop());
			System.out.println("Smallest: " + one.smallestPop());
			one.changePop("West Windsor", 40000);
			System.out.println();
			System.out.println("After Change");
			one.printList();
			one.increasePop(5);
			System.out.println();
			System.out.println("After Increase");
			one.printList();
		}
	
	}