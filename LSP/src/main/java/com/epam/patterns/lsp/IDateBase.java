package com.epam.patterns.lsp;

public abstract class IDateBase extends IDataBaseForce{
    final static String WRITE_TO_DATABASE = "write to database";

    public static String database;

    public static void writeToDB(PowerUser user, String message) {
        if (user.getValueOfAccessRight(WRITE_TO_DATABASE)) {
            database = message;
        }
    }

    public static String readFromDB() {
        return database;
    }
}