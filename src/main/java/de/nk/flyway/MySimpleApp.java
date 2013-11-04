package de.nk.flyway;

import com.googlecode.flyway.core.Flyway;

/**
 * @author Niko Koebler, http://www.n-k.de
 */
public class MySimpleApp {

    public static void main(String[] args) {
        MySimpleApp app = new MySimpleApp();
        app.start();
    }

    public void start() {
        Flyway flyway = new Flyway();
        flyway.setDataSource("jdbc:mysql://localhost:3306/flyway_demo", "root", null);
        flyway.setValidateOnMigrate(true);
        flyway.migrate();
    }

}
