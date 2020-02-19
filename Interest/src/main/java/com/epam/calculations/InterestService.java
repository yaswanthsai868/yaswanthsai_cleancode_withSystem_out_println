package com.epam.calculations;
import java.util.Scanner;
public class InterestService {
	private Integer menuOption;
	private Data interestData;
	private Scanner input;
	private CollectData interestDataCollector;
	public InterestService()
	{
		this.menuOption=new Integer(0);
		this.input=new Scanner(System.in);
		this.interestData=new Data();
		this.interestDataCollector=new CollectData(this.input,this.interestData);
	}
	public void consoleMenu()
	{
		do
		{
			System.out.println("Choose the options....");
			System.out.println("1:Simple Interest");
			System.out.println("2:Compound Interest");
			System.out.println("3:Exit");
			this.menuOption=this.input.nextInt();
			if(this.menuOption!=3)
			{
				this.interestDataCollector.getPrincipleData();
				this.interestDataCollector.getRateOfInterestData();
				this.interestDataCollector.getNumberOfYearsData();
			}
			switch(this.menuOption)
			{
			case 1:
				SimpleInterest calSimpleInterest=new SimpleInterest(interestData);
				calSimpleInterest.calculateInterest();
				System.out.println("The Simple Interest is "+calSimpleInterest.getSimpleInterestTotal());
				break;
			case 2:
				CompoundInterest calCompoundInterest=new CompoundInterest(interestData);
				calCompoundInterest.calculateCompoundInterest();
				System.out.println("The Compound Interest is "+calCompoundInterest.getCompoundInterestTotal());
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid option");
			}
			if(this.menuOption!=3)
			{
				while(true)
				{
					System.out.println("Do you want to continue press 1 to continue or 0 to stop");
					Integer choice=new Integer(this.input.nextInt());
					if(choice==0)
					{
						this.menuOption=3;
						break;
					}
					else if(choice==1)
					{
						break;
					}
					else
					{
						System.out.println("Invalid Option");
					}
				}
			}
		}while(this.menuOption!=3);
	}
}
