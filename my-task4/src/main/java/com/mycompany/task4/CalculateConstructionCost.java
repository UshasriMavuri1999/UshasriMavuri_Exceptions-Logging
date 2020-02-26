package com.mycompany.task4;

public class CalculateConstructionCost {
	int type;
	double area;
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

	public void setArea(double area2) {
		this.area = area2;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}
	
}
