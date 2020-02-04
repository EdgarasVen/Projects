import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CarNumberPricingCalculatorTest {
    CarNumberPricingCalculator calculator;


    @Before
    public void CarNumberPricingCalculator(){
        calculator=new CarNumberPricingCalculator();
    }

    @Test
    public void isCalculatorCreated(){
        assertNotNull("Car Calculator is added",calculator);
    }

    @Test
    public void isCarNumberLegit()  {
        assertEquals(""
        ,CarNumberFormatException.class,calculator.calculatePrice("!@##$"));
    }

    @Test
    public void testAllNumbersAndLettersAreTheSameCost5000()  {
        assertEquals("Jeigu trys raidės vienodos IR trys skaičiai vienodi - numerio kaina 5000 EUR"
                ,new Double(5000.0),calculator.calculatePrice("AAA111"));
        assertEquals("Jeigu trys raidės vienodos IR trys skaičiai vienodi - numerio kaina 5000 EUR"
                ,new Double(5000.0),calculator.calculatePrice("CCC222"));
        assertEquals("Jeigu trys raidės vienodos IR trys skaičiai vienodi - numerio kaina 5000 EUR"
                ,new Double(5000.0),calculator.calculatePrice("BBB333"));
    }

    @Test
    public void testAllNumbersAreTheSameCost1000()  {
        assertEquals("Jeigu visos trys raidės yra vienodos, arba jeigu visi trys skaičiai vienodi arba \"001\",\"666\" - numerio kaina 1000 eur."
                ,new Double(1000.0),calculator.calculatePrice("ABC111"));
        assertEquals("Jeigu visos trys raidės yra vienodos, arba jeigu visi trys skaičiai vienodi arba \"001\",\"666\" - numerio kaina 1000 eur."
                ,new Double(1000.0),calculator.calculatePrice("ABC444"));
        assertEquals("Jeigu visos trys raidės yra vienodos, arba jeigu visi trys skaičiai vienodi arba \"001\",\"666\" - numerio kaina 1000 eur."
                ,new Double(1000.0),calculator.calculatePrice("ABC000"));
    }

    @Test
    public void testAreLettersIsSpecials2000()  {
        assertEquals("Jeigu raidžių rinkinys yra vienas iš \"GOD\", \"KLR\", \"BOS\" numerio kaina 2000 EUR."
                ,new Double(2000.0),calculator.calculatePrice("BOS123"));
        assertEquals("Jeigu raidžių rinkinys yra vienas iš \"GOD\", \"KLR\", \"BOS\" numerio kaina 2000 EUR."
                ,new Double(2000.0),calculator.calculatePrice("KLR123"));
        assertEquals("Jeigu raidžių rinkinys yra vienas iš \"GOD\", \"KLR\", \"BOS\" numerio kaina 2000 EUR."
                ,new Double(2000.0),calculator.calculatePrice("GOD123"));
    }

    @Test
    public void testAreLettersIsSpecialsAndNumbersSame7000()  {
        assertEquals("Jeigu raidžių rinkinys yra vienas iš \"GOD\", \"KLR\", \"BOS\" ir pridėsime tris vienodus skaičius - 7000 EUR"
                ,new Double(7000.0),calculator.calculatePrice("BOS111"));
        assertEquals("Jeigu raidžių rinkinys yra vienas iš \"GOD\", \"KLR\", \"BOS\" ir pridėsime tris vienodus skaičius - 7000 EUR."
                ,new Double(7000.0),calculator.calculatePrice("KLR222"));
        assertEquals("Jeigu raidžių rinkinys yra vienas iš \"GOD\", \"KLR\", \"BOS\" ir pridėsime tris vienodus skaičius - 7000 EUR"
                ,new Double(7000.0),calculator.calculatePrice("GOD333"));
    }

    @Test
    public void testArePlateNamed10000(){
        assertEquals("Jeigu numeris yra ne iš trijų simbolių ir trijų skaičių (1-6 simboliai) jis yra vardinis - kaina 10 000 EUR.'BOSS'"
                ,new Double(10000.0),calculator.calculatePrice("BOSS"));
        assertEquals("Jeigu numeris yra ne iš trijų simbolių ir trijų skaičių (1-6 simboliai) jis yra vardinis - kaina 10 000 EUR.'123456'"
                ,new Double(10000.0),calculator.calculatePrice("123456"));
        assertEquals("Jeigu numeris yra ne iš trijų simbolių ir trijų skaičių (1-6 simboliai) jis yra vardinis - kaina 10 000 EUR.'EDGAR'"
                ,new Double(10000.0),calculator.calculatePrice("EDGAR"));
    }

    @Test
    public void testSimplePlates0(){
        assertEquals("Jaigu numereiai standartiniai , kaina bus 0"
                ,new Double(0.0),calculator.calculatePrice("ABD123"));
        assertEquals("Jaigu numereiai standartiniai , kaina bus 0"
                ,new Double(0.0),calculator.calculatePrice("CDF234"));
        assertEquals("Jaigu numereiai standartiniai , kaina bus 0"
                ,new Double(0.0),calculator.calculatePrice("FFJ887"));

    }
}
