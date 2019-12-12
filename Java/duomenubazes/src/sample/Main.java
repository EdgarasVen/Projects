package sample;

import sample.DbEngage;

public class Main {
    public static void main(String[] args) {
        DbEngage db = new DbEngage();
       db.preparedQuery();
       //db.printAllTable();
    }
}
