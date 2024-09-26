 class product {
    int proId;
    String proName;
    Double ProPrice;

    public void setProductDetails(int id, String name, Double price){
        this.proId = id;
        this.proName = name;
        this.ProPrice = price;
    }
    public void displayProductDetails(){
        System.out.println("Product ID: " + this.proId);
        System.out.println("Product Name: " + this.proName);
        System.out.println("Product Price: " + this.ProPrice);
    }
}
class category extends product{
    String categoryName;
    public void setCategory(String category){
        this.categoryName = category;
    }
    public void displayCategory(){
        System.out.println("Category Name: " + this.categoryName);
    }
}
class brand extends product{
    String brandName;
    public void setBrand(String brand){
        this.brandName = brand;

    }
    public void displayBrand(){
        System.out.println("Brand Name: " + this.brandName);
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        category cat = new category();

    }
}
