package com.epam.construction.Material;
import java.util.Scanner;
public class HouseMenu {
	private Integer menuOption;
	private Scanner input;
	private HouseParameters houseQuality;
	private HouseInput houseInputController;
	private HouseCost totalHouseCost;
	public HouseMenu()
	{
		this.input=new Scanner(System.in);
		this.menuOption=new Integer(0);
		this.houseQuality=new HouseParameters();
		this.houseInputController=new HouseInput(this.input,this.houseQuality);
		this.totalHouseCost=new HouseCost(this.houseQuality);
	}
	public void menu()
	{
		do
		{
			this.menuOption=-1;
			while(!this.validateMenuOption())
			{
				System.out.println("Select the Material standard of the House");
				System.out.println("1:Standard Material");
				System.out.println("2:High Standard Material");
				this.menuOption=this.input.nextInt();
				if(!this.validateMenuOption())
				{
					System.out.println("invalid Option Try again");
				}
			}
			this.houseQuality.setHouseStandard(this.menuOption-1);
			this.houseInputController.setHouseArea();
			this.menuOption=-1;
			while(!this.validateMenuOption())
			{
				System.out.println("Select Type of house");
				System.out.println("1:Not Automated");
				System.out.println("2:Fully Automated");
				this.menuOption=this.input.nextInt();
				if(!this.validateMenuOption())
				{
					System.out.println("Invalid option Try again");
				}
			}
			this.houseQuality.setHouseAutomation(this.menuOption-1);
			this.totalHouseCost.calculateCostOfHouse();
			System.out.println("The cost of house is "+this.totalHouseCost.getCostOfTheHouse());
			this.menuOption=-1;
			while(!this.validateExitOption())
			{
				System.out.println("Do you want to continue press 1/0");
				this.menuOption=this.input.nextInt();
				if(!this.validateExitOption())
				{
					System.out.println("Invalid option Try again");
				}
			}
		}while(this.menuOption!=0);
	}
	public Boolean validateMenuOption()
	{
		return this.menuOption>0 && this.menuOption<3;
	}
	public Boolean validateExitOption()
	{
		return this.menuOption>-1 && this.menuOption<2;
	}
}
