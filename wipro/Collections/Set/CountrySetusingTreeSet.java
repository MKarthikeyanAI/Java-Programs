package wipro.Collections.Set;

import java.util.TreeSet;

public class CountrySetusingTreeSet {
    private TreeSet<String> H1;

    public CountrySetusingTreeSet() {
        H1 = new TreeSet<>();
    }

    public TreeSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {
        if (H1.contains(countryName)) {
            return countryName;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        CountrySet countrySet = new CountrySet();

        countrySet.saveCountryNames("USA");
        countrySet.saveCountryNames("Canada");
        countrySet.saveCountryNames("Mexico");

        System.out.println(countrySet.getCountry("USA")); // prints "USA"
        System.out.println(countrySet.getCountry("Germany")); // prints null
    }
}

