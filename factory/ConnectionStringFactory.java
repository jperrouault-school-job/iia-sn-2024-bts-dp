public class ConnectionStringFactory {
    public static String create(String type, DbConfig dbConfig) {
        return "jdbc:" + type + "://" + dbConfig.getUsername() + "@" + dbConfig.getHost() + ":" + dbConfig.getPort() + "/" + dbConfig.getDbname();
    }
}
