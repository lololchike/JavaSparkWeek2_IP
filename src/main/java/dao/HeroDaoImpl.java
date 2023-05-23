package dao;

import models.Hero;

import java.util.List;

public class HeroDaoImpl implements HeroDao {
    private static Sql20 sql2o = Database.getdatabase();
    @Override
    public int add(Hero hero) {
        final String sql = "INSERT INTO heroes () VALUES ();";
        try(Connection con = sql2o.open()) {
        int id = con.createQuery (sql)
            .bind(hero)
                .executeUpdate()
                .getKey();
        return id;


        }catch (Exeptiopn)
        return 0;
        }

    @Override
    public List<Hero> getAll() {
        return null;
    }

    @Override
    public Hero findById(int heroId) {
        return null;
    }
}
