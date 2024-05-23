package InnerClass;

public class Main {
    public static void main(String[]args){
        Product product = new Product("Laptop",999.99,Category.ELETRONICS);
        System.out.println(product.getCategory());

    }
}
