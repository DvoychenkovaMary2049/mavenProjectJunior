package generics;

import generics.BackEndDeveloper;
import generics.Employee;

import java.util.Random;

public class Game {
    public static <T extends Employee> void defineTeam(Team<T> team, Team<T> team2){
        Random random = new Random();
        int i = random.nextInt(3);
        if (i == 1) System.out.println("Winner team " + team.getName());
        else System.out.println("Winner team " + team2.getName());
    }

    public static void main(String[] args) {
        BackEndDeveloper backEndDeveloper = new BackEndDeveloper("Sergey", "43");
        BackEndDeveloper backEndDeveloper2 = new BackEndDeveloper("Olga", "26");
        Team<BackEndDeveloper> team = new Team("Appolo");

        BackEndDeveloper backEndDeveloper4 = new BackEndDeveloper("Sergey", "43");
        BackEndDeveloper backEndDeveloper5 = new BackEndDeveloper("Olga", "26");
        Team<BackEndDeveloper> team3 = new Team("Afrodita");

        team3.addEmployeeToTeam(backEndDeveloper4);
        team3.addEmployeeToTeam(backEndDeveloper5);

        team.addEmployeeToTeam(backEndDeveloper);
        team.addEmployeeToTeam(backEndDeveloper2);

        TesterMen testerMen = new TesterMen("Andrey", "39");
        TesterMen testerMen2 = new TesterMen("Maksim", "32");
        Team<TesterMen> team2 = new Team("Ares");


        defineTeam(team, team3);
    }
}
