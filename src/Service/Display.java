package Service;

import Domain.Product;
import java.util.Scanner;

/**
 * Класс для вывода списка всех товаров и получения номера товара, который выбрал пользователь
 */
public class Display {
    private final VendingMachine vendingMachine;

    public Display(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    public void displayProducts(){
        for (Product prod : vendingMachine.getListProduct()) {
            System.out.println(prod);
        }
    }

    public void displayMenu() {
        System.out.println("Выберите номер товара:");
        displayProducts(); // Отображаем список доступных товаров
    }
    public int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
