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
			&& (inputTitle.matches("[A-Z]{1}[a-z]{3,20}"))) {
			title = inputTitle;
		}
		else
		{
			title = "Unknown";
		}
	}

public void setVehicleCode() {
	 VehicleCode = id + " _ " + title;
}
public void setPrice(float inputPrice) {
	if(inputPrice > 0 && inputPrice <= 100000 ) {
		price = inputPrice ;
	}
	else
	{
		price = 1;
	}
}
  public void setEType(EnergyType inputEType) {
	  if (inputEType !=null) {
		  eType = inputEType;
	  }
	  else
	  {
		  eType= EnergyType.not_specified;
	  }
  }

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}