import java.util.*;

public class CountryMap {
    public static void main(String[] args) {
        Map<String, Double> countries = new TreeMap<>();
        countries.put("China", 100.60000d);
        countries.put("USA", 12358d);
        countries.put("Poland", 5584d);
        countries.put("German", 2342d);
        //odbiór kluczyków
        System.out.println(" ");
        for (String key : countries.keySet()) {
            System.out.println(key);

        }

        //odbiór wartości
        for (Double val : countries.values()) {
            System.out.println(val);
        }
        System.out.println(" ");
        // odbiór wartości z używaniem kluczyka
        for (String key : countries.keySet()) {
            System.out.println(key + " -> " + countries.get(key));
        }
        // suma mieszkańców
        Double v = 0d;
        for (Double val : countries.values()) {
            v = v + val;

        }
        System.out.println("suma mieszkańców ===>>> " + v);
        //ZADANIE 2
        CountryMap countryMap = new CountryMap();
        countryMap.zadanie2(countries);
    }


    public void zadanie2(Map<String, Double> countries) {
        Double v = 0d;
        for (String key : countries.keySet()) {
            if (!key.equals("USA")) {
                countries.get(key);
                double String = 0;
                v = (v + String);
            }
            System.out.println(v);
        }

    }
    public void zadanie3(Map<String, Double> countries) {
        Double v = 0d;
        for (String key : countries.keySet()) {
          if (key.equals("USA") || key.equals("Poland")) {
              Double val = countries.get(key);
              v = v + val;
              }
        }

        System.out.println(v);
    }
    public void keyTopList (Map<String, Double> countries) {
        List<String> result = new ArrayList<>();
        result.addAll(countries.keySet());
        for (String c: result)
            System.out.println(c);
    }
}
