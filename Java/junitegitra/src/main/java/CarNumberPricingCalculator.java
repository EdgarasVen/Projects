public class CarNumberPricingCalculator {

    /**
     * Naudojam TDD
     * Kursime programą Regitrai, kuri turi paskaičiuoti kainą pagal
     * pageidautiną automobilio numerį. Kainą politika yra tokia: Jeigu visos
     * trys raidės yra vienodos, arba jeigu visi trys skaičiai vienodi arba
     * "001","666" - numerio kaina 1000 eur. Jeigu trys raidės vienodos IR trys
     * skaičiai vienodi - numerio kaina 5000 EUR. Jeigu raidžių rinkinys yra
     * vienas iš "GOD", "KLR", "BOS" numerio kaina 2000 EUR. Jeigu prie aukščiau
     * minėto raidžių rinkinio pridėsime tris vienodus skaičius - 7000 EUR.
     * Jeigu numeris yra ne iš trijų simbolių ir trijų skaičių (1-6 simboliai)
     * jis yra vardinis - kaina 10 000 EUR.
     * Jei skaičiuoklei paduodamas blogo formato numeris - turi mesti
     * IllegalArgumentException su pranešimu - "Incorrect plate number format. Must be 1-6 symbols
     * latin letters and number combination"
     * mažosiomis ir d P.S. NIEKADA realiose sistemose nenaudokite float/double
     * pinigų ir kitoms tikslioms operacijoms tam naudokite BigDecimal tipą!
     */

    //testo metodo pvz.:
    //@Test
    // public void testAllNumbersAndLettersAreTheSameCost5000() {
    //	assertEquals(new Double(5000.0), priceCalc.calculatePrice("AAA111"));
    //}


    public double calculatePrice(String number) {
        return 0;
    }
}
