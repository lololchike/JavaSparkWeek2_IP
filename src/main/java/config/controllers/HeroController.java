package config.controllers;

import config.dao.HeroDao;
import config.model.Hero;
import spark.Request;
import spark.Response;
import spark.Route;


public class HeroController {

    private final HeroDao heroDao;

    public HeroController(HeroDao heroDao) {
        this.heroDao = heroDao;
    }

    public Route getAllHeroes() {
        return (Request req, Response res) -> {
            res.type("application/json");
            return new Gson().toJson(heroDao.getAllHeroes());
        };
    }

    public Route addHero() {
        return (Request req, Response res) -> {
            String name = req.queryParams("name");
            int age = Integer.parseInt(req.queryParams("age"));
            String power = req.queryParams("power");
            String weakness = req.queryParams("weakness");

            Hero hero = new Hero(name, age, power, weakness);
            heroDao.addHero(hero);

            res.status(201);
            return "Hero added successfully";
        };
    }
}

