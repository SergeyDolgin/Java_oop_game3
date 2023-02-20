/*
В материалы добавил xls с полями и параметрами по умолчанию. Убедиться что у вас все поля описанны. 
Создать в основной программе два списка. Положить в них по 10 случайных персонажей. 
В первом только крестьянин, разбойник, снайпер или колдун. Во втором крестьянин, копейщик, арбалетчик, монах. 
Вывести в консоль информацию обо всех персонажах не зависимо от списка, очередь должна определяться скоростью каждого персонажа.
 */

import units.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // BaseHero hero1 = new Arbalester();
        // System.out.println(hero1.getInfo());

        // BaseHero hero2 = new Sniper();
        // System.out.println(hero2.getInfo());

        // BaseHero hero3 = new Villager();
        // System.out.println(hero3.getInfo());

        // BaseHero hero4 = new Magician();
        // System.out.println(hero4.getInfo());

        // BaseHero hero5 = new Monk();
        // System.out.println(hero5.getInfo());

        // BaseHero hero6 = new Raider();
        // System.out.println(hero6.getInfo());

        // BaseHero hero7 = new Spearman();
        // System.out.println(hero7.getInfo());
        System.out.println("---------");

        // пример атаки героев и получения урона
        // hero1.Attack(hero2);
        // System.out.println(hero1.getInfo());
        // System.out.println(hero2.getInfo());

        /** Создать в основной программе два списка. */
        /** В первом только крестьянин, разбойник, снайпер или колдун */
        System.out.println("Первая команда:");
        int teamCount1 = 10;
        Random rand = new Random();
        List<BaseHero> team1 = new ArrayList<>();
        for (int i = 0; i < teamCount1; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    team1.add(new Sniper());
                    break;
                case 1:
                    team1.add(new Villager());
                    break;
                case 2:
                    team1.add(new Magician());
                    break;
                case 3:
                    team1.add(new Raider());
                    break;
                default:
                    // teams.add(new BaseHero());
                    break;
            }
            System.out.println(team1.get(i).getInfo());
        }
        /** Создать в основной программе два списка. */
        /** Во втором крестьянин, копейщик, арбалетчик, монах */
        System.out.println("Вторая команда:");
        List<BaseHero> team2 = new ArrayList<>();
        int teamCount2 = 10;
        for (int i = 0; i < teamCount2; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    team2.add(new Arbalester());
                    break;
                case 1:
                    team2.add(new Villager());
                    break;
                case 2:
                    team2.add(new Monk());
                    break;
                case 3:
                    team2.add(new Spearman());
                    break;
                default:
                    // teams.add(new BaseHero());
                    break;
            }
            System.out.println(team2.get(i).getInfo());
        }

        List<BaseHero> listResult = new ArrayList<>();
        listResult.addAll(team1);
        listResult.addAll(team2);
        // System.out.println("Общий список:");
        /** Вывести в консоль информацию обо всех персонажах не зависимо от списка, очередь должна определяться скоростью каждого персонажа */
        listResult.sort(new Comparator<BaseHero>() {

            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                if (o2.getSpeed() == o1.getSpeed())
                    return o2.getHP() - o1.getHP();
                return o2.getSpeed() - o1.getSpeed();
            }
        });
        System.out.println("Список героев по убыванию СКОРОСТИ");
        listResult.forEach(n -> System.out.print(n.getInfo()+ " скорость " + n.getSpeed() + " здоровье " + n.getHP() + ", \n"));
    }
}
