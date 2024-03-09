import Domain.Bottle;
import Domain.Product;
import Service.CoinDispenser;
import Service.Display;
import Service.Holder;
import Service.VendingMachine;
import Domain.HotDrink;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello");
        Product item1 = new Product(100.0, 1, "lays");
        Product item2 = new Product(80.0, 2, "nuts");
        Product item3 = new Product(40.0, 3, "mars");
        Product item4 = new Bottle(14.5, 4, "Cola", 0.5f);
        Product item5 = new Bottle(20.5, 5, "Mineral", 0.5f);
        Product item6 = new HotDrink(10, 6, "Cocoa", 60);
        Product item7 = new HotDrink(28.5, 7, "Nescafe", 75);

        List<Product> products = new ArrayList<>();

        products.add(item1);
        products.add(item2);
        products.add(item3);
        products.add(item4);
        products.add(item5);
        products.add(item6);
        products.add(item7);

        VendingMachine vendingMachine = new VendingMachine(products);
        Holder holder = new Holder(products);
        CoinDispenser coinDispenser = new CoinDispenser();
        Display display = new Display(vendingMachine);
        // Отображаем меню для пользователя
        display.displayMenu();

        // Получаем выбор пользователя
        int choice = display.getUserChoice();

        // Получаем цену выбранного товара
        double price = holder.validateProduct(choice);

            System.out.println("Цена выбранного товара: " + price);
            System.out.println("Введите сумму:");
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();

            if (holder.takePayment(payment, price)) {
                // Вычисляем сдачу
                double change = payment - price;
                coinDispenser.dispenseChange((int) change);
            } else {
            System.out.println();
        }
    }


        /* MainFrame myFrame = new MainFrame();
        myFrame.initialize(); */
    }
