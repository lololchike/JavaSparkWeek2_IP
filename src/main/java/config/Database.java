package config;

public class Database {
    public static Sql2o getDatabase(){
        return new Sql2o("url","username","password");
    }
}
