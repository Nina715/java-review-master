import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TransactionTest {
    public static void main(String[] args) {

        //1 - find all transactions in 2011 and sort by value
        List<Transaction> newTransList = TransactionData.getAll().stream()
                .filter(trans -> trans.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println(newTransList);

        //2 - what are all the unique cities where the trader work?
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //3 - find all traders from cambridge and sort them by name

        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equalsIgnoreCase("cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        //4 - return a string of all traders names sorted alphabetically
        Optional<String> concatStr = TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .reduce(String::concat);
        System.out.println(concatStr.get());

        //5 - are any traders based in milan?
        System.out.println(TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .anyMatch(trader -> trader.getCity().equalsIgnoreCase("milan")));

        //6 - print the values of all transactions from the traders living in cambridge
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //7 - what is the highest value of all the transaction
        int maxValue = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max).get();
        System.out.println(maxValue);

        //8 - find the transaction with the smallest value
        int minValue = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::min).get();
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getValue()==minValue)
                .forEach(System.out::println);

        //shorter way
        //first stream, then compare object 1 with object 2.. if object1's value is smaller, return object1.. if object2's value is smaller then return obj2
        System.out.println(TransactionData.getAll().stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2).get());
        //way2
        System.out.println(TransactionData.getAll().stream()
                .min(Comparator.comparing(Transaction::getValue)).get());


    }
}
