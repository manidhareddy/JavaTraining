package Day1.EvaluationTask1;
import java.util.ArrayList;
class Product{
    private String name;
    private double price;
    private int quantity;
    public Product(String name,double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
class ShoppingCart{
    private ArrayList<Product> cart;
    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }
    public void addProduct(Product product){
        this.cart.add(product);
    }
    public void removeProduct(Product product){
        if(this.cart.isEmpty()){
            System.out.println("Your cart is empty");
        }
        else if(this.cart.contains(product)){
            cart.remove(product);
        }
        else{
            System.out.println("cart doesn't contain such product");
        }
    }
    public void totalCost(){
        if(this.cart.isEmpty()){
            System.out.println("Sorry we can't calculate total for empty cart!");
            return;
        }
        double total =0.0;
        for(Product product : this.cart){
            double value =0.0;
            value = product.getPrice() * product.getQuantity();
            System.out.println(product.getName()+": "+product.getQuantity()+"  "+product.getPrice()+" -->"+value);
            total += value;
        }
        System.out.println("--------------------------------------------\n Total Cost :\t"+total);
    }
}
public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Product prod1 = new Product("Rice Bag",1200,2);
        Product prod2 = new Product("Sprite bottle 2l",70,10);
        Product prod3 = new Product("Note Books",20,5);
        Product prod4 = new Product("Maggi",70,2);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(prod1);
        cart.addProduct(prod2);
        cart.addProduct(prod3);
        cart.addProduct(prod4);
//        cart.removeProduct(prod2);
//        cart.removeProduct(prod1);
//        cart.removeProduct(prod3);
//        cart.removeProduct(prod4);
//        cart.removeProduct(prod1);
        cart.totalCost();
    }
}
