package com.epam.calculations;
import java.util.Scanner;

public class CollectData {
	private Data interestData;
	private Scanner input;
	public CollectData(Scanner input,Data interestData)
	{
		this.interestData=interestData;
		this.input=input;
	}
	public void getPrincipleData()
	{
		System.out.println("Enter the principle amount");
		this.interestData.setPrincipleAmount(this.input.nextDouble());
	}
	public void getRateOfInterestData()
	{
		System.out.println("Enter the Rate of Interest");
		this.interestData.setRateOfInterest(this.input.nextDouble());
	}
	public void getNumberOfYearsData()
	{
		System.out.println("Enter the Number of years");
		this.interestData.setTimeRequiredToPay(this.input.nextDouble());
	}
}
