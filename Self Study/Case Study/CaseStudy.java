import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Book {
    String name;
    String category;
    int pages;
    double price;

    public Book(String name, String category, int pages, double price) {
        if (price <= 0 || !Double.isFinite(price)) throw new IllegalArgumentException("Price must be positive.");

        this.name = name;
        this.category = category;
        this.pages = pages;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }
}

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String msg) {
        super(msg);
    }
}

class InsufficientStockException extends Exception {
    public InsufficientStockException(String msg) {
        super(msg);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

class BookShop {
    Map<String, Integer> inventory = new HashMap<>();
    Map<String, Double> prices = new HashMap<>();

    public void addBook(Book book, int quantity) {
        if (quantity <= 0) throw new IllegalAccessError("Quantity must be positive.");

        String name = book.getName();

        if (!inventory.containsKey(name) && inventory.size() >= 10000) throw new IllegalStateException("Maximum book limit reached.");

        inventory.put(name, inventory.getOrDefault(name, 0) + quantity);
        prices.put(name, book.getPrice());
    }

    public double buyBook(String bookName, int quantity, double moneyPaid) throws BookNotAvailableException, InsufficientFundsException, InsufficientStockException {

        if(!inventory.containsKey(bookName)) throw new BookNotAvailableException("Book is not available.");
        if(quantity <= 0) throw new IllegalAccessError("Quantity must be positive.");
        if(quantity > inventory.get(bookName)) throw new InsufficientStockException("Requested quantity exceeds available stock.");

        double totalCost = prices.get(bookName) * quantity;

        if(totalCost > moneyPaid) throw new InsufficientStockException("Insufficient funds.");

        inventory.put(bookName, inventory.get(bookName) - quantity);
        return moneyPaid - totalCost;
    }
}

public class CaseStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookShop shop = new BookShop();

        // Sample initial inventory
        shop.addBook(
            new Book("Java Programming", "Programming", 500, 30.0),
            3
        );

        shop.addBook(
            new Book("Mystery Novel", "Fiction", 250, 20.0),
            5
        );

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();

            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            if (line.isEmpty()) {
                continue;
            }

            String[] parts = line.split(",", 3);

            if (parts.length != 3) {
                System.out.println("Error: Invalid input format.");
                continue;
            }

            try {
                String bookName = parts[0].trim();
                int quantity = Integer.parseInt(parts[1].trim());
                double moneyPaid = Double.parseDouble(parts[2].trim());

                double change = shop.buyBook(
                    bookName, quantity, moneyPaid
                );

                System.out.println(
                    "Purchase successful! Change returned: " + change
                );

            } catch (BookNotAvailableException
                     | InsufficientStockException
                     | InsufficientFundsException e) {

                System.out.println("Error: " + e.getMessage());

            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid quantity or payment.");

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
