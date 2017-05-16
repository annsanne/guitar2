package test;
import java.util.Iterator;
import java.util.List;

import guitar.Builder;
import guitar.Inventory;
import guitar.Type;
import guitar.Wood;
import guitar.guitar;
import guitar.guitarSpec;

public class test {

  public static void main(String[] args) {
    Inventory inventory = new Inventory();
    initializeInventory(inventory);

    guitarSpec test= 
      new guitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC,
              Wood.INDIAN_ROSEWOOD, Wood.SITKA, 6);
    List matchingGuitars = inventory.search(test);
    if (!matchingGuitars.isEmpty()) {
      for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
        guitar guitar = (guitar)i.next();
        guitarSpec spec = guitar.getSpec();
        System.out.println(
          "BUILDER:"+spec.getBuilder()+"   MODEL:"+spec.getModel() + "   TYPE:"+
          spec.getType()+"   BACKWOOD:" +spec.getBackWood()  +"   TOPWOOD"+
          spec.getTopWood() + "   PRICE:"+guitar.getPrice());
      }
    } else {
      System.out.println("您所查找的吉他不存在");
    }
  }

  private static void initializeInventory(Inventory inventory) {
    inventory.addGuitar("11277", 3999.95, 
      new guitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC,
                     Wood.INDIAN_ROSEWOOD, Wood.SITKA, 6));
    inventory.addGuitar("V95693", 1499.95, 
      new guitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,
                     Wood.ALDER, Wood.ALDER, 6));
    inventory.addGuitar("V9512", 1549.95, 
      new guitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,
                     Wood.ALDER, Wood.ALDER, 6));
    inventory.addGuitar("122784", 5495.95, 
      new guitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC,
                     Wood.MAHOGANY, Wood.ADIRONDACK, 6));
    inventory.addGuitar("76531", 6295.95, 
      new guitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC,
                     Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, 6));
    inventory.addGuitar("70108276", 2295.95, 
      new guitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC,
                     Wood.MAHOGANY, Wood.MAHOGANY, 6));
    inventory.addGuitar("82765501", 1890.95, 
      new guitarSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC,
                     Wood.MAHOGANY, Wood.MAHOGANY, 6));
    inventory.addGuitar("77023", 6275.95, 
      new guitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC,
                     Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, 6));
    inventory.addGuitar("1092", 12995.95, 
      new guitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC,
                     Wood.INDIAN_ROSEWOOD, Wood.CEDAR, 12));
    inventory.addGuitar("566-62", 8999.95, 
      new guitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC,
                     Wood.COCOBOLO, Wood.CEDAR, 12));
    inventory.addGuitar("6 29584", 2100.95, 
      new guitarSpec(Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC 
                     , Wood.MAHOGANY, Wood.MAPLE, 6));
  }
}
