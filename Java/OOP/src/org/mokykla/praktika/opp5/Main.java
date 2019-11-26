package org.mokykla.praktika.opp5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account acc = new AccountSaving("George",1,1000,1.5);
        acc.withdraw(12,"asd");
        acc.withdraw(23,"aasdd");
        acc.withdraw(42,"asasdd");
        acc.withdraw(61,"axzsd");
        acc.withdraw(76,"asasdd");
        acc.add(123,"asda");
        acc.add(13123,"asasdda");
        acc.add(1323,"asdsada");
        acc.add(12323,"asda");
        acc.add(1233,"assadda");

        acc.printAllTransactions();
    }
}
