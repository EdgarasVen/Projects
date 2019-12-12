package work;

public class Main {
    public static void main(String[] args) {
        DbEngage db = new DbEngage();

        db.addNewEmployee("Edgaras","Programuotojas",4,"VGTU");
        db.printNamesAndSurname();
        db.updateEmployeeProject(6,"Buhalterinė apskaita",300);
        db.printCompanyAndEmployees();

    }

}
