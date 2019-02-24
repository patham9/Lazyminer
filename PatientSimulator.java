//--------------------------PatientSimulator---------------------------
// Simulates a typical day of a patient,
// involving location data, activities and heart rate.
//---------------------------------------------------------------------
public class PatientSimulator {

    //""""""""""""""""""""""""""""""""""""""""""
    //"""""""Init and query definition""""""""""
    //""""""""""""""""""""""""""""""""""""""""""
	
	//The LazyMiner instance to add input to:
	LazyMiner lazyminer;
	//Constructor, assuming a lazyminer which is currently running:
	public PatientSimulator(LazyMiner lazyminer) {
		this.lazyminer = lazyminer;
		lazyminer.HowSensorEventReachedValue("heartrate",110);
	}
	
	//""""""""""""""""""""""""""""""""""""""""""
    //""""""""""Patient simulation step"""""""""
    //""""""""""""""""""""""""""""""""""""""""""
    
    //Starting at home, before going to sleep
	int k=9;
	public void step() {		
		//Heart-rate
		int heartrate; 
		//Fluctuation of heart-rate:
		fluctuation = (int) (r.nextDouble()*10);
		
		//after sleeping the patient has a certain heart-rate
		if(k==1) { 
			heartrate = 50+fluctuation;
			lazyminer.AddSensorEvent("heartrate", heartrate);
			System.out.println("heartrate="+String.valueOf(heartrate));
		}
		
		//and will eat something
		if(k==2) {
			lazyminer.AddActivity("eating");
			System.out.println("Patient is eating now");
		}
		
		//eventually he ate something poisonous, the heart-rate will reflect it
		if(k==3) {
			if (r.nextDouble() > 0.5) {
				heartrate = 110 + fluctuation;

			} else {
				heartrate = 70 + fluctuation;
			}
			lazyminer.AddSensorEvent("heartrate", heartrate);
			System.out.println("heartrate=" + String.valueOf(heartrate));
		}
		
		//then he is at a local park
		if(k == 4) {
			lazyminer.AddAttributeEvent("SELF","park","at");
			System.out.println("patient is at the park now");
		}
		
		//to do some sport (running)
		if(k==5) {
			lazyminer.AddActivity("running");
			System.out.println("Patient is running now");
		}
		
		//in which case his heart rate is ok
		if(k==6) {
			heartrate = 90+fluctuation;
			lazyminer.AddSensorEvent("heartrate", heartrate);
			System.out.println("heartrate="+String.valueOf(heartrate));
		}
		
		//then he eats something there
		if(k==7) {
			lazyminer.AddActivity("eating");
			System.out.println("Patient is eating now");
		}
		
		//in which case his heart rate is also fine
		if(k==8) {
			heartrate = 70+fluctuation;
			lazyminer.AddSensorEvent("heartrate", heartrate);
			System.out.println("heartrate="+String.valueOf(heartrate));
		}
		
		//then he is at home again
		if(k == 9) {
			lazyminer.AddAttributeEvent("SELF","home","at");
			System.out.println("patient is at home now");
		}
		
		//and goes to sleep
		if(k == 0) {
			lazyminer.AddActivity("sleeping");
			System.out.println("Patient is sleeping now");
		}

		k++;
		if(k>=10) {
			k=0;
		}
	}
}
