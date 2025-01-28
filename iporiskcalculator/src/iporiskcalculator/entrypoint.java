package iporiskcalculator;


import java.sql.SQLException;
import java.util.Scanner;

import iporiskcalculator.riskcalculator.RiskCalculator;

public class entrypoint {
    public static void main(String[] args) throws SQLException {
       Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the STOCK RISK CALCULATOR");
        System.out.print("Please enter the company's symbol: ");
       String companyname = sc.nextLine();  

        System.out.println("\nPlease provide the company's sector: ");
        System.out.println("1. TECHNOLOGY");
        System.out.println("2. HEALTHCARE");
        System.out.println("3. CONSTRUCTION");
        System.out.println("4. OIL AND GAS");
        System.out.println("5. BANKING SECTOR");
        System.out.println("6. TELECOMMUNICATION");
        String sector = sc.nextLine();
        System.out.print("Enter the market's trend (Bull market or Bear market): ");
        String markettrend = sc.nextLine();
        
       // System.out.println("Please Enter the company's debttoequity ratio");
        double debttoequity=infostore.getdebt(companyname);
    

        ipo ip = new ipo(companyname, sector, markettrend, debttoequity);

        String riskLevel = RiskCalculator.calculateRisk(ip);

        System.out.println("\nThe calculated risk level for the company is: " + riskLevel);

        sc.close();  
    }
}

