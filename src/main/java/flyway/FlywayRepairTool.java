package flyway;

import org.flywaydb.core.Flyway;

public class FlywayRepairTool {

    public static void main(String[] args) {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:mysql://localhost:3306/vollmed_api", "root", "root")
                .load();

        try {
            flyway.repair();
            System.out.println("Flyway repair executed successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Flyway repair failed.");
        }
    }
}


