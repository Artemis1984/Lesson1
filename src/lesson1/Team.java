package lesson1;

import lesson1.Competitors.Cat;
import lesson1.Competitors.Competitor;
import lesson1.Competitors.Dog;
import lesson1.Competitors.Human;
import lesson1.obstacles.Cross;
import lesson1.obstacles.Obstacle;
import lesson1.obstacles.Wall;
import lesson1.obstacles.Water;

public class Team {

    private String teamname;
    private Competitor[] competitors;
    private Obstacle[] obstacles;


    public Team(String teamname){

        this.teamname = teamname;
        competitors = new Competitor[] {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
        obstacles = new Obstacle[]{new Cross(400), new Wall(2), new Water(1)};

    }

    public void Show(){

        System.out.println(teamname);
        for (Competitor c: competitors){
            for (Obstacle o: obstacles){
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        System.out.println("===========================================");
        for (Competitor c: competitors){
            c.showResult();
        }

    }

}
