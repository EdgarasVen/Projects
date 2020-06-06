import ibank.Bank;
import ibank.BaseBankTest;

public class TestBankClass extends BaseBankTest {
    @Override
    protected Bank createBank() {
        return new MyBank();
    }
}
