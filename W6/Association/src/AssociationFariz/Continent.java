package AssociationFariz;
import java.util.*;

class Continent {

    private String continentName;

    List<CountryClass> countrys;
    public String getContinentName(){
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public List<CountryClass> getCountrys() {
        return countrys;
    }
    public void setContinent(List<CountryClass> countrys) {
        this.countrys = countrys;
    }

}
