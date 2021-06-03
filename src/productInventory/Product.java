package productInventory;

public class Product
{

    // Instance field declarations
    private int PRODUCTID;
    private String productName;
    private int stock;
    private double productPrice;
    private boolean productStatus;

    // add empty product
    public Product()
    {
	PRODUCTID = 0;
	productName = "";
	stock = 0;
	productPrice = 0.0;
	productStatus = true;
    }

    // add product with content
    public Product(int PRODUCTID, String productName, int stock, double productPrice, boolean productStatus)
    {
	this.PRODUCTID = PRODUCTID;
	this.productName = productName;
	this.stock = stock;
	this.productPrice = productPrice;
	this.productStatus = productStatus;
    }

    public int getPRODUCTID()
    {
	return PRODUCTID;
    }

    public void setPRODUCTID(int PRODUCTID)
    {
	this.PRODUCTID = PRODUCTID;
    }

    public String getProductName()
    {
	return productName;
    }

    public void setProductName(String productName)
    {
	this.productName = productName;
    }

    public int getStock()
    {
	return stock;
    }

    public void setStock(int stock)
    {
	this.stock = stock;
    }

    public double getProductPrice()
    {
	return productPrice;
    }

    public void setProductPrice(double productPrice)
    {
	this.productPrice = productPrice;
    }

    /**
     * @return the productStatus
     */
    public boolean isProductStatus()
    {
	return productStatus;
    }

    /**
     * @param productStatus the productStatus to set
     */
    public void setProductStatus(boolean productStatus)
    {
	this.productStatus = productStatus;
    }

    @Override
    public String toString()
    {
	return "PRODUCTID\t" + PRODUCTID + "\nproduct name\t" + productName + "\nstock\t\t" + stock
		+ "\nproduct price\t" + productPrice + "\n" + "stockvalue\t" + (stock * productPrice)+"\n" +"product status\t" + productStatus + "\n";
    }

}
