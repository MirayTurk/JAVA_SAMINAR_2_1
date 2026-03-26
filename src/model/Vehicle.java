package model;

public class Vehicle {
   private int id;
   private String title;
   private String VehicleCode;
   private float price;
   private EnergyType eType;
   private static int counter=0;

public int getid() {
	return id;
}
public String getTitle() {
	return title;
}
public String getVehicleCode() {
	return VehicleCode;
}
public float getPrice() {
	return price;
}
public EnergyType getEType() {
	return eType;
}
public void setId(int id) {
   id= counter;
   counter++ ;

}
public void setTitle(String inputTitle) {
	if( (inputTitle != null) && (!inputTitle.isEmpty()) 
			&& (title.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
			title = inputTitle;
		}
		else
		{
			title = "Unknown";
		}
	}

}
public void setVehicleCode() {
	






}