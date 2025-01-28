package iporiskcalculator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class infostore {
        public static double getdebt(String companyname) throws SQLException {
        	String query="select deptratio from result where companyname =?";
        	Connection con=dataconnection.getconnection();
        	PreparedStatement p=con.prepareStatement(query);
        	p.setString(1, companyname);
        	ResultSet rt=p.executeQuery();
        	System.out.println("Connected");
        	rt.next();
//        	double res=0.0;
//        	while(rt.next()) {
//        		res=rt.getDouble(1);
//        		return res;
//        	}
        	return rt.getDouble(1);
        	
        }
}
