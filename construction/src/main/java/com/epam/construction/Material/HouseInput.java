package com.epam.construction.Material;
import java.util.Scanner;
public class HouseInput {
	private Scanner input;
	private HouseParameters houseQuality;
	public HouseInput(Scanner input,HouseParameters houseQuality)
	{
		this.houseQuality=houseQuality;
		this.input=input;
	}
	public void setHouseArea()
	{
		System.out.println("Enter the Area of the house");
		this.houseQuality.setHouseAreaInSqft(this.input.nextDouble());
	}
}
