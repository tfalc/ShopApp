import java.util.Arrays;

public class ShopApp {
    public static void main(String[] args) {

        double total = 0.0;
        int measurement = 8;
        String separator = "****************************************************************************************";

        System.out.println("Welcome to this simples Shop App");

        Customer c1 = new Customer();

        System.out.println(separator); //Adição de items
        System.out.println("Minimum price: " + Clothing.minPrice);
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] items = {item1,
                item2,
                new Clothing("Green Scarf", 5.0, "S"),
                new Clothing("Blue T-Shirt", 10.5, "S")};

        c1.addItems(items);
        System.out.println(separator); //Descrição do cliente
        System.out.println("Customer is " + c1.getName() + ", " + c1.getSize() + ", " + c1.getTotalClothingCost());
        System.out.println(separator); //Laço que imprime itens de compra
        for (Clothing item : c1.getItems()) {
            System.out.println("Item: " + item);
        }
        int average = 0;
        int count = 0;

        System.out.println(separator);//Laço para aumento de preço médio
        for (Clothing item : c1.getItems()){
            if(item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }
        }
        try {
            average = average / count;
            System.out.println("Average price " + average + ", Count " + count);
        } catch (ArithmeticException e) {
            System.out.println("Cant' divide " + average + " by " + count);
        }
        Arrays.sort(c1.getItems());
        System.out.println("Total with tax is: " + total);
        System.out.println(separator);
    }
}
