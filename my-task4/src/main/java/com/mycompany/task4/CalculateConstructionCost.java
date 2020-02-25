package com.mycompany.task4;

public class CalculateConstructionCost {
	int type,area;
	String choice;
	public double ConstructionCost() {
		
		if(choice.equals("y"))
		{
			if(type==3)
				return area*2500;
			
			return area*1200;	
		}
		if(type==1)
			return area*1200;
		if(type==2)
			return area*1500;
		if(type==3)
			return area*1800;

		return -1;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}
	
}
