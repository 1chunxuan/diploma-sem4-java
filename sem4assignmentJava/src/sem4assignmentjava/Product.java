package sem4assignmentJava;

public class Product {
     int product_no;
    String product_name;
    int product_price;
    
    Product() {
        
    }

    public int getProduct_no() {
        return product_no;
    }

    public void setProduct_no(int product_no) {
        this.product_no = product_no;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }
    
    Product(int product_no, String product_name, int product_price) {
        this.product_no = product_no;
        this.product_name = product_name;
        this.product_price = product_price;
    }
    
    public String toString() {
        return
                "\nProductNo = " + product_no +
                "\nProductName = " + product_name +
                "\nProductPrice = " + product_price;
    }
    
}

