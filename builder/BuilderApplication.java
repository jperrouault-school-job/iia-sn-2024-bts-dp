public class BuilderApplication {
    public static void main(String[] args) {
        // DbConfig config = new DbConfig("host", 1234, "dbname", "username");

        DbConfig config = DbConfig.builderV1()
            .host("host")
            .username("username")
            .port(1234)
            .dbname("dbname")
            .build()
        ;

        System.out.println(config);
    }
}
