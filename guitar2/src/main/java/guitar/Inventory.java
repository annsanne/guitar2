package guitar;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import jdbc.sqlitejdbc;
import guitar.guitar;

public class Inventory {
  private LinkedList guitars;
  private String sql;
  private String specSql;
  private PreparedStatement pstmt;
  private PreparedStatement sp;
  public Inventory() {
    guitars = new LinkedList();
  }

  public void addGuitar(String serialNumber, double price,
          guitarSpec spec) {
	  	  guitar guitar = new guitar(serialNumber, price, spec);
	  	  guitars.add(guitar);
}

  public guitar getGuitar(String serialNumber) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      guitar guitar = (guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }

  public List<guitar> guitarList(){
	  sql="select * from guitar;"; 
	  specSql= "select * from guitarSpec where spec= ";
	  try {
			pstmt =sqlitejdbc.getConnection().prepareStatement(sql);      			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				String serialNumber = rs.getString("serialNumber");
				double price = rs.getDouble("price");
		        int id = rs.getInt("spec");
		        sp =sqlitejdbc.getConnection().prepareStatement(specSql+id);      			
				ResultSet spec1 = sp.executeQuery();
				while(spec1.next()){
					String  builder = spec1.getString("builder");
					String	model = spec1.getString("model");
					String	type = spec1.getString("type");
					String	backWood = spec1.getString("backWood");
					String	topWood = spec1.getString("topWood");
					int numStrings = spec1.getInt("numStrings");
					guitarSpec spec=new guitarSpec(Builder.valueOf(builder.toUpperCase()),
					model,Type.valueOf(type.toUpperCase()),Wood.valueOf(backWood.toUpperCase()),Wood.valueOf(topWood.toUpperCase()),numStrings);
					guitar guitar=new guitar(serialNumber,price,spec);
					guitars.add(guitar);			    
				}
				sp.close();
			}
				pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return guitars;
	
}
  public List search(guitarSpec searchSpec) {
	    List matchingGuitars = new LinkedList();
	    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	      guitar guitar = (guitar)i.next();
	      if (guitar.getSpec().matches(searchSpec))
	        matchingGuitars.add(guitar);
	    }
	    return matchingGuitars;
	  }
}