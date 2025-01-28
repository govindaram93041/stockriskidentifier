package iporiskcalculator;

public class ipo {
	private String companyname;
	private String sector;
	private  String markettrend;
	private double debttoequity;
	public ipo(String companyname,String sector,String markettrend, double debttoequity) {
		this.companyname=companyname;
		this.sector=sector;
		this.markettrend=markettrend;
		this.debttoequity=debttoequity;
	}
	public String getcompanyname() {
		return companyname;
	}
	public String getsector() {
		return sector;
	}
	public String getmarkettrend() {
		return markettrend;
	}
	public double getdebttoequity() {
		return debttoequity;
	}
	

}
