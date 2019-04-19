package com.epam.patterns.lsp;

class DatabaseGateway extends IDateBase {

    public static void writeToDBForce(PowerUser user, String message) {
        user.setupAccessRight(WRITE_TO_DATABASE, true);
        writeToDB(user, message);
    }

    public static void writeToDB(PowerUser user, String message) {
        if (user.getValueOfAccessRight(WRITE_TO_DATABASE)) {
            database = message;
        }
    }
}
