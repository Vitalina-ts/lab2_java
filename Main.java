package ua;

import ua.model.*;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Успішне створення об’єктів
            Player p1 = Player.of("Andriy", "Shevchenko", PlayerPosition.FORWARD, 7);
            Player p2 = Player.of("Oleh", "Luzhny", PlayerPosition.DEFENDER, 2);
            Coach coach = Coach.of("Valeriy", "Lobanovskyi", CoachRole.HEAD_COACH);
            Team dynamo = Team.of("Dynamo Kyiv", "Football", List.of(p1, p2));

            Match match = Match.of(dynamo, dynamo, LocalDateTime.now(), "0:0");
            TrainingSession training = TrainingSession.of(LocalDateTime.now().plusDays(1), 90, dynamo);

            System.out.println(p1);
            System.out.println(coach);
            System.out.println(dynamo);
            System.out.println(match);
            System.out.println(training);

            //  Невдала валідація
            Player bad = Player.of("123", "Ivanov", PlayerPosition.MIDFIELDER, 10);

        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
