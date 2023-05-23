package dao;

import models.Hero;

import java.util.List;

public interface HeroDao {
    // list hat class will implement
    int add (Hero hero);
    List<Hero> getAll();
    Hero findById(int heroId);

}
