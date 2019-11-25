package org.mokykla.praktika.opp5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account acc = new AccountSaving("George",1,1000,1.5);



        acc.withdraw(123);
        acc.withdraw(324);
        acc.withdraw(345);
        acc.withdraw(23);

        System.out.println(acc);
    }
}
