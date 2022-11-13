import java.util.ArrayList;
import java.util.List;

public class StockMain {

    public static void main(String[] args) {
        Stock stock1 = new Stock("amazon", "amz", 5.23);
        Stock stock2 = new Stock("microsoft", "msf", 145.23);
        Stock stock3 = new Stock("google", "ggl", 4.23);
        Stock stock4 = new Stock("apple", "apl", 67.23);

        List<Stock> stock = new ArrayList<>();
        stock.add(stock1);
        stock.add(stock2);
        stock.add(stock3);
        stock.add(stock4);
    }


    }

