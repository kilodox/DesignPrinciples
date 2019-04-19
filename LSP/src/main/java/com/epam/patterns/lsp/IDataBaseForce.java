package com.epam.patterns.lsp;

import static com.epam.patterns.lsp.IDateBase.writeToDB;

public class IDataBaseForce {
    final static String WRITE_TO_DATABASE = "write to database";

    public static String database;

    public static void writeToDBForce(PowerUser user, String message){
        user.setupAccessRight(WRITE_TO_DATABASE, true);
        writeToDB(user, message);
    }
}
