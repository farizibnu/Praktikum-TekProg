package AssociationFariz;
import java.util.*;

public class AssociationMain {
    public static void main(String[] args){
        Continent continent = new Continent();
        continent.setContinentName("Asia");

        CountryClass country = new CountryClass();
        country.setCountryName("Indonesia");
        CountryClass country2 = new CountryClass();
        country2.setCountryName("Korea");

        List<CountryClass> empList = new ArrayList<CountryClass>();
        empList.add(country);
        empList.add(country2);

        continent.setContinent(empList);

        System.out.println(continent.getCountrys()+" adalah negara yang terdapat pada benua "+continent.getContinentName());

    }
}
