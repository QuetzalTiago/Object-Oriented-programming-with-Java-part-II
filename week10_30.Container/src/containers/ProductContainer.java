package containers;

public class ProductContainer extends Container {
    private String productName;

    public ProductContainer(String productName, double capacity){
        //It creates an empty product container. The product name and the container capacity are given as parameters.
        super(capacity);
        this.productName=productName;
    }

    public String getName(){
        //It returns the product name.
        return productName;

    }


    public void setName(String newName){
        //Sets a new name to the product.
        this.productName=newName;
    }

    @Override
    public String toString(){
        //Returns the object state in String form, like Juice: volume = 64.5, free space 123.5
        return productName+": "+super.toString();
    }


}
