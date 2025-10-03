package ua.model;

import java.util.List;

public record Team(String name, String sport, List<Player> players) {
    public Team {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Назва команди не може бути порожньою");
        if (sport == null || sport.isBlank())
            throw new IllegalArgumentException("Вид спорту має бути визначений");
        if (players == null || players.isEmpty())
            throw new IllegalArgumentException("Команда має містити хоча б одного гравця");
    }

    public static Team of(String name, String sport, List<Player> players) {
        return new Team(name, sport, players);
    }
}
