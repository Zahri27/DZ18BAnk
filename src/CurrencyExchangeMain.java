import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


public class CurrencyExchangeMain {

    private static double generateRandomExchangeRate() {
        Random random = new Random();
        return Math.round((37 + random.nextDouble() * (42 - 37)) * 100.0) / 100.0;
    }

    public static void main(String[] args) {

        List<Bank> banks = new ArrayList<>();
        banks.add(new Bank("ПриватБанк", generateRandomExchangeRate()));
        banks.add(new Bank("Ощадбанк", generateRandomExchangeRate()));
        banks.add(new Bank("Укргазбанк", generateRandomExchangeRate()));
        banks.add(new Bank("Аваль", generateRandomExchangeRate()));
        banks.add(new Bank("Райффайзен Банк Аваль", generateRandomExchangeRate()));
        banks.add(new Bank("УкрСиббанк", generateRandomExchangeRate()));
        banks.add(new Bank("Кредобанк", generateRandomExchangeRate()));
        banks.add(new Bank("Мегабанк", generateRandomExchangeRate()));
        banks.add(new Bank("Кредит Европа Банк", generateRandomExchangeRate()));
        banks.add(new Bank("ПУМБ", generateRandomExchangeRate()));
        banks.add(new Bank("ПроКредит Банк", generateRandomExchangeRate()));
        banks.add(new Bank("Альфа-Банк", generateRandomExchangeRate()));
        banks.add(new Bank("ВТБ Банк", generateRandomExchangeRate()));
        banks.add(new Bank("Финансовый Стандарт Банк", generateRandomExchangeRate()));


        System.out.println("Три банка с наибольшим курсом обмена:");
        banks.stream()
                .sorted(Comparator.comparingDouble(Bank::getExchangeRate).reversed())
                .limit(3)
                .forEach(bank -> System.out.println(bank.getName() + ": " +
                        String.format("%.2f", bank.getExchangeRate())));
    }
}
