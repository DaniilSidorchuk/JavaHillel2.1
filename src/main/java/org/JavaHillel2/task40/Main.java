package org.JavaHillel2.task40;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        Databases db = new Databases("jdbc:mysql://localhost:3306/cars?verifyServerCertificate=false&useSSL=true&serverTimezone=UTC", "root", "Da1992Va1966");
        db.autoByMark("Toyota");
    }
}
