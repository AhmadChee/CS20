//Add Phidgets Library 
import com.phidget22.*;

public class ReadTemperature1 
{
    public static void main(String[] args) throws Exception
    {

        //Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        
        
       
       
        //Open 
        temperatureSensor.open(1000);

        //Use your Phidgets 
        while (true) 
        {
            double tempF = (temperatureSensor.getTemperature()*1.8+32);
        	System.out.println("Temperature: " + tempF + "  °F " );
        	Thread.sleep(150);
        }
        
        
    }
    
}

  

  