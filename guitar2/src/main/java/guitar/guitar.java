package guitar;

public class guitar {
	 private String serialNumber;
	  private double price;
	  guitarSpec spec;

	  public guitar(String serialNumber, double price, guitarSpec spec) {
	    this.serialNumber = serialNumber;
	    this.price = price;
	    this.spec = spec;
	  }

	  public String getSerialNumber() {
	    return serialNumber;
	  }

	  public double getPrice() {
	    return price;
	  }

	  public void setPrice(float newPrice) {
	    this.price = newPrice;
	  }

	  public guitarSpec getSpec() {
	    return spec;
	  }
	}

