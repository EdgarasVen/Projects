import lt.vtvpmc.municipality.IllegalCitizenException;
import lt.vtvpmc.municipality.Municipality;
import lt.vtvpmc.municipality.Person;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class MyMunicipality implements Municipality {
    Set<Person> personsSet = new HashSet<Person>();

    public void registerCitizen(Person person) throws IllegalCitizenException {
        checkExceptions(person);
        personsSet.add(person);
    }

    public boolean isRegisteredCitizen(Person person) {
        return personsSet.contains(person);
    }

    public Person findOldestPerson() {
        return personsSet.stream()
                .min(Comparator.comparing(Person::getDateOfBirth))
                .orElse(null);
    }

    public double totalIncomeInTaxes() {
        double sumIncome=0;
        for (Person person: personsSet) {
            if (person.getYearlyIncome()>1000000)
                sumIncome+=person.getYearlyIncome()*16/100;
            else if (person.getYearlyIncome()>14000){
                sumIncome+=person.getYearlyIncome()*15/100;
            }else {
                sumIncome+=0;
            }
        }
        return sumIncome;
    }

    public int getCitizenCount() {
        return personsSet.size();
    }

    private void checkExceptions (Person person) throws IllegalCitizenException {
        if (person==null || person.getFirstName()==null || person.getLastName()==null ||
                person.getDateOfBirth()==null || person.getYearlyIncome()<0 )
            throw new IllegalCitizenException(person);
        LocalDate date = LocalDate.now();
        if(person.getDateOfBirth().compareTo(date)>0) throw new IllegalCitizenException(person);
    }
}
