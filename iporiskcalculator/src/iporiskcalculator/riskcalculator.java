package iporiskcalculator;

public class riskcalculator {
	class RiskCalculator {
	    public static String calculateRisk(ipo companyname) {
	        String sector = companyname.getsector().toUpperCase(); 
	        double debtToEquity = companyname.getdebttoequity();
	        String riskLevel = "Unknown";

	        
	        if (sector.equals("1") || sector.equals("TECHNOLOGY")) {
	          
	            if (debtToEquity <=0.2) {
	                riskLevel = "Low Risk"; 
	            } else if (debtToEquity>0.2  && debtToEquity<=0.6) {
	                riskLevel = "Medium Risk"; 
	            } else {
	                riskLevel = "High Risk"; 
	            }
	        } else if (sector.equals("2") || sector.equals("HEALTHCARE")) {
	            
	            if (debtToEquity <=0.3) {
	                riskLevel = "Low Risk"; 
	            } else if (debtToEquity>0.3  && debtToEquity<=0.8) {
	                riskLevel = "Medium Risk";
	            } else {
	                riskLevel = "High Risk"; 
	        } 
	        }
	            else if (sector.equals("3") || sector.equals("CONSTRUCTION")) {
	            
	            if (debtToEquity <=0.5) {
	                riskLevel = "Low Risk"; 
	            } else if (debtToEquity>0.5  && debtToEquity<=1.5) {
	                riskLevel = "Medium Risk"; 
	            } else {
	                riskLevel = "High Risk"; 
	            }
	        } else if (sector.equals("4") || sector.equals("OIL AND GAS")) {
	        	if (debtToEquity <=0.4) {
	                riskLevel = "Low Risk"; 
	            } else if (debtToEquity>0.4  && debtToEquity<=1.5) {
	                riskLevel = "Medium Risk"; 
	            } else {
	                riskLevel = "High Risk"; 
	            }
	        }
	            
	         else if (sector.equals("5") || sector.equals("BANKING SECTOR")) {
	            
	            if (debtToEquity < 4) {
	                riskLevel = "Low Risk"; 
	            } else if (debtToEquity>4  && debtToEquity<=8) {
	                riskLevel = "Medium Risk"; 
	            } else {
	                riskLevel = "High Risk"; 
	            }
	        } 
	         else if (sector.equals("6") || sector.equals("TELECOMMUNICATION")) {
		            
		            if (debtToEquity <=1) {
		                riskLevel = "Low Risk"; 
		            } else if (debtToEquity>1  && debtToEquity<=2.5) {
		                riskLevel = "Medium Risk"; 
		            } else {
		                riskLevel = "High Risk"; 
		            }
	         }
	         else if (sector.equals("7") || sector.equals("AUTOMOBILE")) {
		            
		            if (debtToEquity <=0.3) {
		                riskLevel = "Low Risk"; 
		            } else if (debtToEquity>0.3  && debtToEquity<=0.6) {
		                riskLevel = "Medium Risk"; 
		            } else {
		                riskLevel = "High Risk"; 
		            }
	         }
	         else {
	            riskLevel = "Invalid Sector"; 
	        }

	        
	        
	        if (companyname.getmarkettrend().equalsIgnoreCase("Bearmarket") && !riskLevel.equals("Low Risk")) {
	            riskLevel += " (Increased risk due to bear market conditions)";
	        }

	       
			return riskLevel;
	    
	        }
}
	}


