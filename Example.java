import java.util.*;

class Example{
public static void leasingPayment(){
	Scanner input = new Scanner(System.in);
	do{
		clearConsole();
		System.out.println("+---------------------------------------------------------+");
		System.out.println("|                  LEASING PAYMENT                        |");
		System.out.println("+---------------------------------------------------------+");
		System.out.println("");
	
		System.out.println("\t[01] Calculate monthly installment ");
		System.out.println("");
		System.out.println("\t[02] Search leasing category ");
		System.out.println("");
		System.out.println("\t[03] Find leasing amount ");
		System.out.println("");
		System.out.println("\t[04] Exit");
		System.out.println("");
	
	
	
		System.out.print("Enter an option to continue -> ");
		int op = input.nextInt();
	
		switch(op){
			case 1:{
				monthlyInstallment();
				
					}
				break;
			case 2:{
				
				searchCategory();
				}
				break;
			case 3:	{
				findLeasing();
			
				}
			
				break;
			case 4:
			return;
			default:
				System.out.println("\t Invalid option....");
			}
		
		}while(true);
	
	
	}
public static void ssclTax(){
	Scanner input = new Scanner(System.in);
	L1:do{
		clearConsole();
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("|         Social security contribution levy (SSCL) tax           |");
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("");
	
		System.out.print("Enter value of good or service : ");
		double value = input.nextDouble();
	
		if(0<value){
			double ssclTax = (value*0.025)+((value*0.025)+value)*0.15;
	        
	        System.out.println("");
			System.out.printf("You have to pay sscl tax     : %.2f \n",ssclTax);
		    System.out.println("");
		    
			L2:do{
					System.out.print("Do you want to calculate another sscl tax (Y/N) : ");
					char ch = input.next().charAt(0);
					
					if(ch == 'Y' || ch=='y'){
						continue L1;
						}else if(ch == 'N' || ch=='n'){
							break L1;
							
							}else{
								System.out.println("\t Invalid option...");
								continue L2;
								}
					}while(true);	
		
		}else{
			System.out.println("\t Invalid input....");
				System.out.println("");
				
				L2:do{
					System.out.print("Do you want to enter the correct value again (Y/N) : ");
					char ch = input.next().charAt(0);
					
					if(ch == 'Y' || ch=='y'){
						continue L1;
						}else if(ch == 'N' || ch=='n'){
							break L1;
							
							}else{
								System.out.println("\t Invalid option...");
								continue L2;
								}
					}while(true);
			
			
			
			}
		}while(true);
		
	
	
	}
public static void incomeTax(){
	Scanner input =  new Scanner(System.in);
	L1:do{
		clearConsole();
		System.out.println("+---------------------------------------------------------+");
		System.out.println("|                     INCOME TAX                          |");
		System.out.println("+---------------------------------------------------------+");
		System.out.println("");
		
	    System.out.print("Enter your total income per year : ");
		double salary = input.nextDouble();
		double tax;
		if(0<salary){
			if(salary<=1200000){
				tax=0;
				}else if(salary<=1700000){
					tax = (salary-1200000)*0.06;
					}else if(salary<=2200000){
						tax = (500000*0.06)+(salary-1700000)*0.12;
						}else if(salary<=2700000){
							tax= (500000*0.06)+(500000*0.12)+(salary-2200000)*0.18;
							}else if(salary<=3200000){
								tax = (500000*0.06)+(500000*0.12)+(500000*0.18)+(salary-2700000)*0.24;
								}else if(salary<=3700000){
									tax = (500000*0.06)+(500000*0.12)+(500000*0.18)+(500000*0.24)+(salary-3200000)*0.3;
									}else{
										tax = (500000*0.06) + (500000*0.12) + (500000*0.18) + (500000*0.24) + (500000*0.30)+(salary-3700000)*0.36;
										}
				System.out.println("");	
				System.out.println("You have to pay income tax per year :"+tax);
				System.out.println("");	
				
				L2:do{
					System.out.print("Do you want to calculate another income tax (Y/N) : ");
					char ch = input.next().charAt(0);
					
					if(ch == 'Y' || ch=='y'){
						continue L1;
						}else if(ch == 'N' || ch=='n'){
							break L1;
							
							}else{
								System.out.println("\t Invalid option...");
								continue L2;
								}
					}while(true);					
										
			}else{
				System.out.println("Invalid input....");
				System.out.println("");
				
				L2:do{
					System.out.print("Do you want to enter the correct value again (Y/N) :");
					char ch = input.next().charAt(0);
					
					if(ch == 'Y' || ch=='y'){
						continue L1;
						}else if(ch == 'N' || ch=='n'){
							break L1;
							
							}else{
								System.out.println("\t Invalid option...");
								continue L2;
								}
					}while(true);
				
				}
		
		}while(true);
		
	}
public static void payableTax(){
	Scanner input =  new Scanner(System.in);
	L1:do{
		clearConsole();
		System.out.println("+---------------------------------------------------------+");
		System.out.println("|                    PAYABLE TAX                          |");
		System.out.println("+---------------------------------------------------------+");
		System.out.println("");
		
	    System.out.print("Enter your employee payment per month :");
		double salary = input.nextDouble();
		double tax;
		if(0<salary){
			if(salary<=100000){
				tax=0;
				}else if(salary<=141667){
					tax = (salary-100000)*0.06;
					}else if(salary<=183333){
						tax = (41667*0.06)+(salary-141667)*0.12;
						}else if(salary<=225000){
							tax= (41667*0.06)+(41667*0.12)+(salary-183333)*0.18;
							}else if(salary<=266667){
								tax = (41667*0.06)+(41667*0.12)+(41667*0.18)+(salary-225000)*0.24;
								}else if(salary<=308333){
									tax = (41667*0.06)+(41667*0.12)+(41667*0.18)+(41667*0.24)+(salary-266667)*0.3;
									}else{
										tax = (41667*0.06) + (41667*0.12) + (41667*0.18) + (41667*0.24) + (41667*0.30)+(salary-308333)*0.36;
										}
				System.out.println("");	
				System.out.println("You have to pay payable tax per month :"+(int)tax);
				System.out.println("");	
				
				L2:do{
					System.out.print("Do you want to calculate another payable tax (Y/N) :");
					char ch = input.next().charAt(0);
					
					if(ch == 'Y' || ch=='y'){
						continue L1;
						}else if(ch == 'N' || ch=='n'){
							break L1;
							
							}else{
								System.out.println("\t Invalid option...");
								continue L2;
								}
					}while(true);					
										
			}else{
				System.out.println("Invalid input....");
				System.out.println("");
				
				L2:do{
					System.out.print("Do you want to enter the correct value again (Y/N) :");
					char ch = input.next().charAt(0);
					
					if(ch == 'Y' || ch=='y'){
						continue L1;
						}else if(ch == 'N' || ch=='n'){
							break L1;
							
							}else{
								System.out.println("Invalid option...");
								continue L2;
								}
					}while(true);
				
				}
		
		}while(true);
		
	}
public static void withHoldingTax(){
	Scanner input =  new Scanner(System.in);
	do{
		clearConsole();
		System.out.println("+---------------------------------------------------------+");
		System.out.println("|                  WITHHOLDING TAX                        |");
		System.out.println("+---------------------------------------------------------+");
		System.out.println("");
	
		System.out.println("\t[01] Rental tax");
		System.out.println("");
		System.out.println("\t[02] Bank Interest tax");
		System.out.println("");
		System.out.println("\t[03] Divident tax");
		System.out.println("");
		System.out.println("\t[04] Exit");
		System.out.println("");
	
	
	
		System.out.print("Enter an option to continue -> ");
		int op = input.nextInt();
	
		switch(op){
			case 1:{
				rentalTax();
				
					}
				break;
			case 2:{
				
				bankInterestTax();
				}
				break;
			case 3:	{
				dividentTax();
			
				}
			
				break;
			case 4:
			return;
			default:
				System.out.println("\t Invalid option....");
			}
		
		}while(true);
	
	
	}
public  static void main (String args[]){
	Scanner input = new Scanner(System.in);
	L1:do{
	clearConsole();
	    System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t ______   ______   ________  ________ ");
        System.out.println("\t\t\t\t|      \\ /      \\ |        \\|        \\");
        System.out.println("\t\t\t\t \\$$$$$$|  $$$$$$\\| $$$$$$$$ \\$$$$$$$$");
        System.out.println("\t\t\t\t  | $$  | $$   \\$$| $$__       | $$   ");
        System.out.println("\t\t\t\t  | $$  | $$      | $$  \\      | $$   ");
        System.out.println("\t\t\t\t  | $$  | $$   __ | $$$$$      | $$   ");
        System.out.println("\t\t\t\t _| $$_ | $$__/  \\| $$_____    | $$   ");
        System.out.println("\t\t\t\t|   $$ \\ \\$$    $$| $$     \\   | $$   ");
        System.out.println("\t\t\t\t \\$$$$$$  \\$$$$$$  \\$$$$$$$$    \\$$   ");
        
        System.out.println("");
		System.out.println("");
		
		System.out.println("  _______       __   __   _____          _      _____ _    _ _            _______ ____  _____  ");
        System.out.println(" |__   __|/\\    \\ \\ / /  / ____|   /\\   | |    / ____| |  | | |        /\\|__   __/ __ \\|  __ \\ ");
        System.out.println("    | |  /  \\    \\ V /  | |       /  \\  | |   | |    | |  | | |       /  \\  | | | |  | | |__) |");
        System.out.println("    | | / /\\ \\    > <   | |      / /\\ \\ | |   | |    | |  | | |      / /\\ \\ | | | |  | |  _  / ");
        System.out.println("    | |/ ____ \\  / . \\  | |____ / ____ \\| |___| |____| |__| | |____ / ____ \\| | | |__| | | \\ \\ ");
        System.out.println("    |_/_/    \\_\\/_/ \\_\\  \\_____/_/    \\_\\______\\_____\\|____/|______/_/    \\_\\_|  \\____/|_|  \\_\\");
        System.out.println("");
    System.out.println("==================================================================================================");
    System.out.println("");
    System.out.println("\t[01] Withholding tax");
    System.out.println("");
    System.out.println("\t[02] Payable tax");
    System.out.println("");
    System.out.println("\t[03] Income tax");
    System.out.println("");
    System.out.println("\t[04] Social security Contribution levy (SSCL) tax");
    System.out.println("");
    System.out.println("\t[05] Leasing payment");
    System.out.println("");
    System.out.println("\t[06] Exit");
    System.out.println("");
    
    
    System.out.print("Enter an option to continue -> ");
    int op = input.nextInt();
    
    switch(op){
		case 1:{
			    clearConsole();
				withHoldingTax();
				}
		break;
		case 2:{
			     clearConsole();
				 payableTax();
			}
		break;
		case 3:{
				 clearConsole();
				 incomeTax();
				}
		break;
		case 4:{
				clearConsole();
				ssclTax();
			}
		break;
		case 5:{
				clearConsole();
				leasingPayment();
				}
		break;
		case 6:
		        System.out.println("");
		        System.out.println("\t		-------------");
				System.out.println("\t		|    Exit   |");
				System.out.println("\t		-------------");
		return;
		default:System.out.println("Enter invalid option....");
        
		
		}
	
	}while(true);
   
    
}

	public static void rentalTax(){
		
	
	Scanner input = new Scanner(System.in);
	
	L1:do{
	clearConsole();
	    System.out.println("+---------------------------------------------------------+");
		System.out.println("|                    RENTAL TAX                           |");
		System.out.println("+---------------------------------------------------------+");
	System.out.println("");
	System.out.print("Enter your rent                  : ");
	int rent = input.nextInt();
	
	if(0<rent){
		if(100000<rent){
			double tax = rent*0.1;
			System.out.println("");
			System.out.println("You have to pay rent tax : "+tax);
			System.out.println("");
			
			L3:do{
				
				System.out.print("Do You want to calculate another rent tax : ");
				
				char ch = input.next().charAt(0);
				
				if(ch =='Y'|| ch=='y'){
				continue L1;
				}else if(ch == 'N' || ch == 'n'){
					break L1;
					}else{
						System.out.println("\t Wrong selection,Try again..");
						continue L3;
						}
				
				}while(true);
			}else{
				System.out.println("");
				System.out.println("\t You dont have to pay rent...");
				System.out.println("");
				
				L4:do{
				System.out.print("Do You want to calculate another rent tax : ");
				char ch = input.next().charAt(0);
				
				if(ch =='Y'|| ch=='y'){
				continue L1;
				}else if(ch == 'N' || ch == 'n'){
					break L1;
					}else{
						System.out.println("\t Wrong selection,Try again..");
						continue L4;
						}
				
				}while(true);
				}
		}else{
			System.out.println("");
			System.out.println("\t Invalid input....");
			System.out.println("");
			
			L2:do{
			System.out.print("Do you want to enter the correct value again (Y/N) : ");
			char ch = input.next().charAt(0);
			
			if(ch =='Y'|| ch=='y'){
				continue L1;
				}else if(ch == 'N' || ch == 'n'){
					break L1;
					}else{
						System.out.println("\t Wrong selection,Try again..");
						continue L2;
						}
				
				}while(true);
			}
			
	   }while(true);
	}
	public static void bankInterestTax(){
		Scanner input = new Scanner(System.in);
		
		
		L1:do{
			clearConsole();
			System.out.println("+---------------------------------------------------------+");
			System.out.println("|                 BANK INTEREST TAX                       |");
			System.out.println("+---------------------------------------------------------+");
			System.out.println("");
			System.out.print("Enter your bank interest per year                   : ");
			
			int interest = input.nextInt();
			
			if(0<interest){
				double tax = interest*0.05;
				System.out.println("");
				System.out.println("Do you have to pay bank interest tax per year : "+tax);
				System.out.println("");
				
				L3:do{
				
					System.out.print("Do You want to calculate another bank interest tax : ");
			
				
					char ch = input.next().charAt(0);
				
					if(ch =='Y'|| ch=='y'){
						continue L1;
					}else if(ch == 'N' || ch == 'n'){
						break L1;
					}else{
						System.out.println("\t Wrong selection,Try again..");
						continue L3;
						}
				
				}while(true);
				}else{
					System.out.println("");
					System.out.println("\t Invalid input");
					System.out.println("");
					
			L2:do{
				System.out.print("Do you want to enter the correct value again (Y/N) : ");
				char ch = input.next().charAt(0);
			
				if(ch =='Y'|| ch=='y'){
					continue L1;
				}else if(ch == 'N' || ch == 'n'){
					break L1;
					}else{
						System.out.println("\t Wrong selection,Try again..");
						continue L2;
						}
				
				}while(true);
					}
			}while(true);
		
		
		}
	public static void dividentTax(){
		
	
		Scanner input = new Scanner(System.in);
	
		L1:do{
			clearConsole();
			System.out.println("+---------------------------------------------------------+");
			System.out.println("|                    DIVIDENT TAX                         |");
			System.out.println("+---------------------------------------------------------+");
			System.out.println("");
			System.out.print("Enter your total divident per year                  : ");
				int divident = input.nextInt();
	
			if(0<divident){
				if(100000<divident){
					double tax = (divident-100000)*0.14;
					System.out.println("");
					System.out.printf("You have to pay divident tax per year      :%.2f \n",tax);
					System.out.println("");
			
					L3:do{
				
						System.out.print("Do You want to calculate another divident tax (Y/N): ");
				
						char ch = input.next().charAt(0);
				
						if(ch =='Y'|| ch=='y'){
							continue L1;
						}else if(ch == 'N' || ch == 'n'){
							break L1;
						}else{
							System.out.println("\t Wrong selection,Try again..");
							continue L3;
						}
				
						}while(true);
					}else{
						System.out.println("");
						System.out.println("\t You dont have to pay tax...");
						System.out.println("");
				
					L4:do{
						System.out.print("Do You want to calculate another divident tax (Y/N): ");
						char ch = input.next().charAt(0);
				
						if(ch =='Y'|| ch=='y'){
							continue L1;
						}else if(ch == 'N' || ch == 'n'){
							break L1;
						}else{
							System.out.println("\t Wrong selection,Try again..");
							continue L4;
						}
				
					}while(true);
				}
		}else{
			System.out.println("");
			System.out.println("\t Invalid input....");
			System.out.println("");
			
			L2:do{
			System.out.print("Do you want to enter the correct value again (Y/N) : ");
			char ch = input.next().charAt(0);
			
			if(ch =='Y'|| ch=='y'){
				continue L1;
				}else if(ch == 'N' || ch == 'n'){
					break L1;
					}else{
						System.out.println("\t Wrong selection,Try again..");
						continue L2;
						}
				
				}while(true);
			}
			
	   }while(true);
	}
	public static void clearConsole(){
		try{
			final String os=System.getProperty("os.name");
			if(os.contains("Windows")){
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			}else{
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		}catch(final Exception e){
			e.printStackTrace();
			//Handle any exceptions.
		}
	}	
	public static void monthlyInstallment(){
		Scanner input = new Scanner(System.in);
		L1:do{
		clearConsole();
		System.out.println("+---------------------------------------------------------+");
		System.out.println("|            CALCULATE MONTHLY INSTALLMENT                |");
		System.out.println("+---------------------------------------------------------+");
		System.out.println("");
		
		int leaseAmount;
		double rate ;
		int year;
		
		L2:do{
			System.out.println("");
			System.out.print("Enter lease amount : ");
		    leaseAmount = input.nextInt();
			
			if(!(0<leaseAmount)){
			  System.out.println("\t Invalid lease amount.Enter valid amount...");
			  continue L2;
			}else{
				break L2;
				
				}
			
			}while(true);
			
			L3:do{
			System.out.println("");
			System.out.print("Enter annual interest rate : ");
		    rate = input.nextDouble();
			
			if(!(0.0<rate)){
			  System.out.println("\t Invalid interest rate.Enter valid rate...");
			  continue L3;
			}else{
				break L3;
				
				}
			
			}while(true);
			
			L4:do{
			System.out.println("");
			System.out.print("Enter number of year : ");
			 year = input.nextInt();
			
			if(!(0<year && year<=5)){
			  System.out.println("");
			  System.out.println("\t Invalid number of year.Enter valid year...");
			  continue L4;
			}else{
				break L4;
				
				}
				
			}while(true);
			
				double i = rate / 100 / 12;   

				int n = year*12;
				
				double monthlyInstallment = leaseAmount * i / (1 - (1 / Math.pow(1 + i, n)));

				System.out.println("");
				System.out.printf("Your monthly installment : %.2f \n",monthlyInstallment);
				System.out.println("");
				
				L5:do{
						System.out.print("Do You want to calculate another leasing payment (Y/N): ");
						char ch = input.next().charAt(0);
				
						if(ch =='Y'|| ch=='y'){
							continue L1;
						}else if(ch == 'N' || ch == 'n'){
							break L1;
						}else{
							System.out.println("");
							System.out.println("\t Wrong selection,Try again..");
							continue L5;
						}
						}while(true);
			
			}while(true);
		
		}
	public static void searchCategory(){
		Scanner input = new Scanner(System.in);
		L1:do{
		clearConsole();
		System.out.println("+---------------------------------------------------------+");
		System.out.println("|            SEARCH LEASING CATEGORY                      |");
		System.out.println("+---------------------------------------------------------+");
		System.out.println("");
		
		int leaseAmount;
		double rate ;
		
		
		L2:do{
			System.out.println("");
			System.out.print("Enter lease amount : ");
		    leaseAmount = input.nextInt();
			
			if(!(0<leaseAmount)){
			  System.out.println("\t Invalid lease amount.Enter valid amount...");
			  continue L2;
			}else{
				break L2;
				
				}
			
			}while(true);
			
			L3:do{
			System.out.println("");
			System.out.print("Enter annual interest rate : ");
		    rate = input.nextDouble();
			
			if(!(0.0<rate)){
			  System.out.println("\t Invalid interest rate.Enter valid rate...");
			  continue L3;
			}else{
				break L3;
				
				}
			
			}while(true);
			
			double i = rate / 100 / 12;
			
			for(int y=3;y<=5;y++){
				
				int n = y*12;
				
				double monthlyInstallment = leaseAmount * i / (1 - (1 / Math.pow(1 + i, n)));

				System.out.println("");
				System.out.printf("Your monthly installment for %d year leasing plan - %.2f%n", y, monthlyInstallment);
				
				
				}

				
				L4:do{
					    System.out.println("");
						System.out.print("Do You want to search another leasing category (Y/N): ");
						char ch = input.next().charAt(0);
				
						if(ch =='Y'|| ch=='y'){
							continue L1;
						}else if(ch == 'N' || ch == 'n'){
							break L1;
						}else{
							System.out.println("");
							System.out.println("\t Wrong selection,Try again..");
							continue L4;
						}
						}while(true);
			
			}while(true);
		
		}
	public static void findLeasing(){
		Scanner input = new Scanner(System.in);
		L1:do{
		clearConsole();
		System.out.println("+---------------------------------------------------------+");
		System.out.println("|            CALCULATE MONTHLY INSTALLMENT                |");
		System.out.println("+---------------------------------------------------------+");
		System.out.println("");
		
		int monthlyInstallment;
		double rate ;
		int year;
		
		L2:do{
			System.out.println("");
			System.out.print("Enter the monthly lease amount you can afford : ");
		    monthlyInstallment = input.nextInt();
			
			if(!(0<monthlyInstallment)){
			  System.out.println("\t Invalid monthly installment.Enter valid installment...");
			  continue L2;
			}else{
				break L2;
				
				}
			
			}while(true);
			
			L3:do{
			System.out.println("");
			System.out.print("Enter annual interest rate                    : ");
		    rate = input.nextDouble();
			
			if(!(0.0<rate)){
			  System.out.println("\t Invalid interest rate.Enter valid rate...");
			  continue L3;
			}else{
				break L3;
				
				}
			
			}while(true);
			
			L4:do{
			System.out.println("");
			System.out.print("Enter number of year                           : ");
			 year = input.nextInt();
			
			if(!(0<year && year<=5)){
			  System.out.println("");
			  System.out.println("\t Invalid number of year.Enter valid year...");
			  continue L4;
			}else{
				break L4;
				
				}
				
			}while(true);
			
				double i = rate / 100.0 / 12.0;   
				int n = year * 12;               

				double leaseAmount = monthlyInstallment * (1 - Math.pow(1 + i, -n)) / i;
                leaseAmount = Math.round(leaseAmount);

				System.out.println("");
				System.out.printf("Your can get lease amount : %.2f \n",leaseAmount);
				System.out.println("");
				
				L5:do{
						System.out.print("Do You want to calculate another monthly installment (Y/N): ");
						char ch = input.next().charAt(0);
				
						if(ch =='Y'|| ch=='y'){
							continue L1;
						}else if(ch == 'N' || ch == 'n'){
							break L1;
						}else{
							System.out.println("");
							System.out.println("\t Wrong selection,Try again..");
							continue L5;
						}
						}while(true);
			
			}while(true);
		
		}
		

}
