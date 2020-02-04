public class CarNumberPricingCalculator {

    /**
     * Naudojam TDD
     * Kursime programą Regitrai, kuri turi paskaičiuoti kainą pagal
     * pageidautiną automobilio numerį. Kainą politika yra tokia:
     *
     * Jeigu visos trys raidės yra vienodos, arba jeigu visi trys skaičiai vienodi arba "001","666" - numerio kaina 1000 eur.
     * ABC001,ABC666,ABC333,ABC999
     * Jeigu trys raidės vienodos IR trys skaičiai vienodi - numerio kaina 5000 EUR.
     * AAA001,BBB666,CCC333,EEE999
     * Jeigu raidžių rinkinys yra vienas iš "GOD", "KLR", "BOS" numerio kaina 2000 EUR.
     * GOD123,KLR123,BOS123
     * Jeigu prie aukščiau minėto raidžių rinkinio pridėsime tris vienodus skaičius - 7000 EUR.
     * GOD111,KLR222,BOS333
     * Jeigu numeris yra ne iš trijų simbolių ir trijų skaičių (1-6 simboliai) jis yra vardinis - kaina 10 000 EUR.
     * GOD,BIOS,123,123456,BOSS
     * Jei skaičiuoklei paduodamas blogo formato numeris - turi mesti
     * IllegalArgumentException su pranešimu - "Incorrect plate number format. Must be 1-6 symbols
     * latin letters and number combination"
     * mažosiomis ir d P.S. NIEKADA realiose sistemose nenaudokite float/double
     * pinigų ir kitoms tikslioms operacijoms tam naudokite BigDecimal tipą!
     */

    public Double calculatePrice(String number) throws CarNumberFormatException {
        checkNumberLegit(number);
        if(number.length()<6&&number.length()>0) return 10000.0;
        if(number.length()==6 && isPlateFirstThreeNotLetters(number)||number.length()==6 && isPlateLastThreeNotNumbers(number)) return 10000.0;
        if (isPlateLettersSpecial(number)) if (isPlateNumbersAreSame(number)) return 7000.0;else return 2000.0;
        if (!isPlateLettersAreSame(number)&&isPlateNumbersAreSame(number)) return 1000.0;
        if (isPlateLettersAreSame(number)&&isPlateNumbersAreSame(number)) return 5000.0;

        return 0.0;
    }

    private void checkNumberLegit(String number) throws CarNumberFormatException {
            if(isPlateFirstThreeNotLetters(number)&&isPlateLastThreeNotNumbers(number))
                throw new CarNumberFormatException(number);
    }

    private boolean isPlateNumbersAreSame(String number){
        char[] arr =number.toCharArray();
        return arr[3] == arr[4] && arr[3] == arr[5];
    }

    private boolean isPlateLettersAreSame(String number){
        char[] arr =number.toCharArray();
        return arr[0] == arr[1] && arr[0] == arr[2];
    }

    private boolean isPlateLettersSpecial(String number){
        char[] arr =number.toCharArray();
        return arr[0]=='G' && arr[1]=='O' && arr[2]=='D' ||
                arr[0]=='K' && arr[1]=='L' && arr[2]=='R' ||
                arr[0]=='B' && arr[1]=='O' && arr[2]=='S' ;
    }

    private boolean isPlateFirstThreeNotLetters(String number){
        String letters = String.valueOf(number.charAt(0)) + number.charAt(1) + number.charAt(2);
        return !letters.chars().allMatch(Character::isLetter);
    }

    private boolean isPlateLastThreeNotNumbers(String number){
        String numeric = String.valueOf(number.charAt(3)) + number.charAt(4) + number.charAt(5);
        return !numeric.chars().allMatch(Character::isDigit);
    }
}
