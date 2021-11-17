package task;

import analytics.ReportBuilder;
import database.Authorisation;
import database.DataBase;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorisation auth = new Authorisation();
        if (auth.authorise(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
