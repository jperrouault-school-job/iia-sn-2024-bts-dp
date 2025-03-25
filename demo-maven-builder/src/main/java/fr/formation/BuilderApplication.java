package fr.formation;

public class BuilderApplication {
    public static void main(String[] args) {
        DbConfig config = DbConfig.builder()
            .host("host")
            .username("username")
            .port(1234)
            .dbname("dbname")
            .build()
        ;

        System.out.println(config);
    }
}
