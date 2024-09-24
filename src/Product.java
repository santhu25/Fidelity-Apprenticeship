public class Product {
    private int productId;
    private String productName;
    private String productCategory;


    public void setProductDetails(int Id,String Name,String Category) {
        this.productId = Id;
        this.productName = Name;
        this.productCategory = Category;
    }
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Category: " + productCategory);
    }



}
