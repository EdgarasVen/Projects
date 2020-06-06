import java.util.ArrayList;

public class DigitsProvider {
    public ArrayList generateListOfDigits(Parameters parameters){
        return new Generator().generate(parameters);
    }
}
