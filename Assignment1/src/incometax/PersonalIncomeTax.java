package incometax;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This file used to implement the personal income tax for the 
 * Australian Government
 * 
 * @author senthuran
 *
 */
public class PersonalIncomeTax {
	public static void main(String[] args) {
		// Welcome message
				 System.out.println("\nPersonal Income Tax - 2017");
				 System.out.println("\n------------Tax Filing Status Details------------");
				 System.out.println("\nIdentity Number\t\tFiling Status");
				 System.out.println("\t0\t\tSingle");
				 System.out.println("\t1\t\tMarried Filing Jointly Or Qualified widow(er)");
				 System.out.println("\t2\t\tMarried Filing Separately");
				 System.out.println("\t3\t\tHead Of Household");

				 // Create scanner object to get input from user
				 Scanner input = new Scanner(System.in);

				 System.out.print("\nEnter the filing status: ");
				 // Get filing status from user
				 int filingStatus = input.nextInt();

				 System.out.print("Enter the taxable income: ");
				 // Get taxable income amount from user
				 double taxableIncome = input.nextFloat();

				 double taxAmount = 0;
				 double maxTaxTenPercent = 0;
				 double maxTaxFifteenPercent = 0;
				 double maxTaxTwentyfivePercentage = 0;
				 double maxTaxTwentyeightPercentage = 0;
				 double maxTaxThirtythreePercentage = 0;
				 
				 DecimalFormat decimalFormat = new DecimalFormat("#.##");

				 switch(filingStatus) {
					 case 0:
						 // Calculate maximum tax amount for each taxable income limit
						 maxTaxTenPercent = (float) 8350 * 10 / 100;
						 maxTaxFifteenPercent = (float) (33950 - 8350) * 15 / 100;
						 maxTaxTwentyfivePercentage = (float) (82250 - 33950) * 25 / 100;
						 maxTaxTwentyeightPercentage = (float) (171550 - 82250) * 28 / 100;
						 maxTaxThirtythreePercentage = (float) (332950 - 171550) * 33 / 100;

						 if (taxableIncome >= 0 && taxableIncome <= 8350) {
							 // Calculate tax amount if taxable income range is 0 - 8350
							 taxAmount = (taxableIncome - 0) * 10 / 100;
						 } else if (taxableIncome >= 8351 && taxableIncome <= 33950) {
							 // Calculate tax amount if taxable income range is 8351 - 33950
							 taxAmount = maxTaxTenPercent + (taxableIncome - 8350) * 15 / 100;
						 } else if (taxableIncome >= 33951 && taxableIncome <= 82250) {
							 // Calculate tax amount if taxable income range is 33951 - 82250
							 taxAmount = maxTaxTenPercent + maxTaxFifteenPercent + (taxableIncome - 33950) * 25 / 100;
						 } else if (taxableIncome >= 82251 && taxableIncome <= 171550) {
							 // Calculate tax amount if taxable income range is 82251 - 171550
							 taxAmount = maxTaxTenPercent + maxTaxFifteenPercent + maxTaxTwentyfivePercentage + (taxableIncome - 82250) * 28 / 100;
						 } else if (taxableIncome >= 171551 && taxableIncome <= 332950) {
							 // Calculate tax amount if taxable income range is 171551 - 332950
							 taxAmount = maxTaxTenPercent + maxTaxFifteenPercent + maxTaxTwentyfivePercentage + maxTaxTwentyeightPercentage + 
												(taxableIncome - 171550) * 33 / 100;
						 } else if (taxableIncome >= 332951) {
							 // Calculate tax amount if taxable income range is more than 332950
							 taxAmount = maxTaxTenPercent + maxTaxFifteenPercent + maxTaxTwentyfivePercentage + maxTaxTwentyeightPercentage + 
												maxTaxThirtythreePercentage + (taxableIncome - 332950) * 35 / 100;
						 } else {
							 System.out.println("Provided amount is negative that not in a tax range!!!");
						 }
						 System.out.println("Tax is " + taxAmount);
						 break;
					 case 1:
						 // Calculate maximum tax amount for each taxable income limit
						 maxTaxTenPercent = (float) 16700 * 10 / 100;
						 maxTaxFifteenPercent = (float) (67900 - 16700) * 15 / 100;
						 maxTaxTwentyfivePercentage = (float) (137050 - 67900) * 25 / 100;
						 maxTaxTwentyeightPercentage = (float) (208850 - 137050) * 28 / 100;
						 maxTaxThirtythreePercentage = (float) (332950 - 208850) * 33 / 100;

						 if (taxableIncome >= 0 && taxableIncome <= 16700) {
							 // Calculate tax amount if taxable income range is 0 - 16700
							 taxAmount = (taxableIncome - 0) * 10 / 100;
						 } else if (taxableIncome >= 16701 && taxableIncome <= 67900) {
							 // Calculate tax amount if taxable income range is 16701 - 67900
							 taxAmount = maxTaxTenPercent + (taxableIncome - 16700) * 15 / 100;
						 } else if (taxableIncome >= 67901 && taxableIncome <= 137050) {
							 // Calculate tax amount if taxable income range is 67901 - 137050
							 taxAmount = maxTaxTenPercent + maxTaxFifteenPercent + (taxableIncome - 67900) * 25 / 100;
						 } else if (taxableIncome >= 137051 && taxableIncome <= 208850) {
							 // Calculate tax amount if taxable income range is 137051 - 208850
							 taxAmount = maxTaxTenPercent + maxTaxFifteenPercent + maxTaxTwentyfivePercentage + (taxableIncome - 137050) * 28 / 100;
						 } else if (taxableIncome >= 208851 && taxableIncome <= 332950) {
							 // Calculate tax amount if taxable income range is 208851 - 332950
							 taxAmount = maxTaxTenPercent + maxTaxFifteenPercent + maxTaxTwentyfivePercentage + maxTaxTwentyeightPercentage + 
												(taxableIncome - 208850) * 33 / 100;
						 } else if (taxableIncome >= 332951) {
							 // Calculate tax amount if taxable income range is more than 332950
							 taxAmount = maxTaxTenPercent + maxTaxFifteenPercent + maxTaxTwentyfivePercentage + maxTaxTwentyeightPercentage + 
												maxTaxThirtythreePercentage + (taxableIncome - 332950) * 35 / 100;
						 } else {
							 System.out.println("Provided amount is negative that not in a tax range!!!");
						 }
						 System.out.println("Tax is " + taxAmount);
						 break;
					 case 2:
						 // Calculate maximum tax amount for each taxable income limit
						 maxTaxTenPercent = (float) 8350 * 10 / 100;
						 maxTaxFifteenPercent = (float) (33950 - 8350) * 15 / 100;
						 maxTaxTwentyfivePercentage = (float) (68525 - 33950) * 25 / 100;
						 maxTaxTwentyeightPercentage = (float) (104425 - 68525) * 28 / 100;
						 maxTaxThirtythreePercentage = (float) (180475 - 104425) * 33 / 100;

						 if (taxableIncome >= 0 && taxableIncome <= 8350) {
							 // Calculate tax amount if taxable income range is 0 - 8350
							 taxAmount = (taxableIncome - 0) * 10 / 100;
						 } else if (taxableIncome >= 8351 && taxableIncome <= 33950) {
							 // Calculate tax amount if taxable income range is 8351 - 33950
							 taxAmount = maxTaxTenPercent + (taxableIncome - 8350) * 15 / 100;
						 } else if (taxableIncome >= 33951 && taxableIncome <= 68525) {
							 // Calculate tax amount if taxable income range is 33951 - 68525
							 taxAmount = maxTaxTenPercent + maxTaxFifteenPercent + (taxableIncome - 33950) * 25 / 100;
						 } else if (taxableIncome >= 68526 && taxableIncome <= 104425) {
							 // Calculate tax amount if taxable income range is 68526 - 104425
							 taxAmount = maxTaxTenPercent + maxTaxFifteenPercent + maxTaxTwentyfivePercentage + (taxableIncome - 68525) * 28 / 100;
						 } else if (taxableIncome >= 104426 && taxableIncome <= 180475) {
							 // Calculate tax amount if taxable income range is 104426 - 180475
							 taxAmount = maxTaxTenPercent + maxTaxFifteenPercent + maxTaxTwentyfivePercentage + maxTaxTwentyeightPercentage + 
												(taxableIncome - 104425) * 33 / 100;
						 } else if (taxableIncome >= 180476) {
							 // Calculate tax amount if taxable income range is more than 180475
							 taxAmount = maxTaxTenPercent + maxTaxFifteenPercent + maxTaxTwentyfivePercentage + maxTaxTwentyeightPercentage + 
												maxTaxThirtythreePercentage + (taxableIncome - 180475) * 35 / 100;
						 } else {
							 System.out.println("Provided amount is negative that not in a tax range!!!");
						 }
						 System.out.println("Tax is " + taxAmount);
						 break;
					 case 3:
						 // Calculate maximum tax amount for each taxable income limit
						 maxTaxTenPercent = (float) 11950 * 10 / 100;
						 maxTaxFifteenPercent = (float) (45500 - 11950) * 15 / 100;
						 maxTaxTwentyfivePercentage = (float) (117450 - 45500) * 25 / 100;
						 maxTaxTwentyeightPercentage = (float) (190200 - 117450) * 28 / 100;
						 maxTaxThirtythreePercentage = (float) (372950 - 190200) * 33 / 100;

						 if (taxableIncome >= 0 && taxableIncome <= 11950) {
							 // Calculate tax amount if taxable income range is 0 - 11950
							 taxAmount = (taxableIncome - 0) * 10 / 100;
						 } else if (taxableIncome >= 11951 && taxableIncome <= 45500) {
							 // Calculate tax amount if taxable income range is 11951 - 45500
							 taxAmount = maxTaxTenPercent + (taxableIncome - 11950) * 15 / 100;
						 } else if (taxableIncome >= 45501 && taxableIncome <= 117450) {
							 // Calculate tax amount if taxable income range is 45501 - 117450
							 taxAmount = maxTaxTenPercent + maxTaxFifteenPercent + (taxableIncome - 45500) * 25 / 100;
						 } else if (taxableIncome >= 117451 && taxableIncome <= 190200) {
							 // Calculate tax amount if taxable income range is 117451 - 190200
							 taxAmount = maxTaxTenPercent + maxTaxFifteenPercent + maxTaxTwentyfivePercentage + (taxableIncome - 117450) * 28 / 100;
						 } else if (taxableIncome >= 190201 && taxableIncome <= 372950) {
							 // Calculate tax amount if taxable income range is 190201 - 372950
							 taxAmount = maxTaxTenPercent + maxTaxFifteenPercent + maxTaxTwentyfivePercentage + maxTaxTwentyeightPercentage + 
												(taxableIncome - 190200) * 33 / 100;
						 } else if (taxableIncome >= 372951) {
							 // Calculate tax amount if taxable income range is more than 372950
							 taxAmount = maxTaxTenPercent + maxTaxFifteenPercent + maxTaxTwentyfivePercentage + maxTaxTwentyeightPercentage + 
												maxTaxThirtythreePercentage + (taxableIncome - 372950) * 35 / 100;
						 } else {
							 System.out.println("Provided amount is negative that not in a tax range!!!");
						 }
						 System.out.println("Tax is " + taxAmount);
						 break;
					 default:
						 System.out.println("\nFiling Status is invalid!!!");
				 }
	 }
}
