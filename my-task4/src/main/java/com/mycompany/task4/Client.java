package com.mycompany.task4;

import java.io.FileDescriptor;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;

/*
 * Write Program to calculate simple interest, and compound interest
 * Write Program to estimate house construction cost, based on various  materials
 * Construction cost per square feet is
 * 1200INR if we use standard materials
 * 1500INR if we use above standard materials
 * 1800INR if customers needs high standard material
 * 2500INR if customer needs high standard material and fully
 * automated home
 * Input will be material standard, total area of house and if they want fully automated home.
 * Use logger class
 */
public class Client 
{
	static PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
	static Scanner scan = new Scanner(System.in);
	static int option;
	private static final Logger logger = LogManager.getLogger(Client.class);
	public static void main( String[] args ) 
    {
		BasicConfigurator.configure();  
		logger.info("Client class");  
		
		boolean startOver = true;
    	while(startOver)
    	{
    		CalculateInterest ci = new CalculateInterest();
    		readInputs(ci);
    		
    	if(option==1)     		
    		myout.print(ci.CalculateSimpleInterest());

    	else if(option==2) 
    		myout.print(ci.CalculateCompoundInterest());
    	
    	else {
    		myout.print("The option you've entered is not valid. Please try again.\n");
    		startOver = false;	
    	}

		if(!startOver)
            startOver=true;

		else 
			startOver=false;

      }
    	myout.print("------------------------------------------\n");
    	CalculateConstructionCost obj = new CalculateConstructionCost();
    	readInputsCost(obj);
    	myout.print("Estimated house construction cost is :  "+obj.ConstructionCost());
    }
	public static void  readInputs(CalculateInterest obj) {
		try {
		logger.warn("Please Enter your option within the options given");
		myout.print("Types of Interest   \n 1. Simple Interest \n 2. Compound Interest \n");
    	myout.print("Enter type of Interest : ");
    	option = scan.nextInt();
    	myout.print("Enter pricipal amount : ");
		double principal = scan.nextDouble();
		myout.print("Enter rate of interest : ");
		double rate = scan.nextDouble();
		myout.print("Enter time in years : ");
		double time = scan.nextDouble();
		obj.setPrincipal(principal);
		obj.setRate(rate);
		obj.setTime(time);
		}
		catch(Exception exception) {
			logger.error(exception);
			logger.info("The option you've entered is not valid. Please try again.\n");
			System.exit(0);
		}
	}
	public static void readInputsCost(CalculateConstructionCost obj) {
		try {
		logger.warn("Please Enter the area in sq.feet value less than 15 digits.");
		myout.print("Enter area in sq.feet : ");
    	int area = scan.nextInt(); 
    	logger.warn("Choose the option within the given below");
    	myout.print("Types of Materials :  \n 1. Standard Materials \n 2. Above Standard Material \n 3. High Standard material \n");
    	myout.print("Enter type of material that you want : ");
    	int type = scan.nextInt();
    	myout.print("Do you want automated home(y/n) ? : ");
    	String choice = scan.next();
    	obj.setArea(area);
    	obj.setChoice(choice);
    	obj.setType(type);
		}
		catch(Exception exception) {
			logger.error(exception);
			logger.info("The option you've entered is not valid. Please try again.\n");
			System.exit(0);
		}
		
	}
}



 