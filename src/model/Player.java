package ua.model;

import ua.util.Utils;
import java.util.Objects;

public class Player {
    private String firstName;
    private String lastName;
    private PlayerPosition position;
    private int number;

    // Конструктор
    public Player(String firstName, String lastName, PlayerPosition position, int number) {
        setFirstName(firstName);
        setLastName(lastName);
        setPosition(position);
        setNumber(number);
    }

    // Factory-метод
    public static Player of(String firstName, String lastName, PlayerPosition position, int number) {
        return new Player(firstName, lastName, position, number);
    }

    // Getters/Setters з валідацією
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) {
        if (!Utils.isValidName(firstName)) {
            throw new IllegalArgumentException("Некоректне ім’я гравця!");
        }
        this.firstName = firstName;
    }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) {
        if (!Utils.isValidName(lastName)) {
            throw new IllegalArgumentException("Некоректне прізвище гравця!");
        }
        this.lastName = lastName;
    }

    public PlayerPosition getPosition() { return position; }
    public void setPosition(PlayerPosition position) {
        if (position == null) {
            throw new IllegalArgumentException("Позиція не може бути null!");
        }
        this.position = position;
    }

    public int getNumber() { return number; }
    public void setNumber(int number) {
        if (number <= 0) throw new IllegalArgumentException("Номер має бути позитивним!");
        this.number = number;
    }

    // Методи Object
    @Override
    public String toString() {
        return String.format("%s %s (#%d, %s)", firstName, lastName, number, position);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player player)) return false;
        return number == player.number &&
                Objects.equals(firstName, player.firstName) &&
                Objects.equals(lastName, player.lastName) &&
                position == player.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, position, number);
    }
}
