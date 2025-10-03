package ua.model;

public record Coach(String firstName, String lastName, CoachRole role) {
    public Coach {
        if (firstName == null || firstName.isBlank())
            throw new IllegalArgumentException("Ім’я тренера не може бути порожнім");
        if (lastName == null || lastName.isBlank())
            throw new IllegalArgumentException("Прізвище тренера не може бути порожнім");
        if (role == null)
            throw new IllegalArgumentException("Роль тренера має бути визначена");
    }

    public static Coach of(String firstName, String lastName, CoachRole role) {
        return new Coach(firstName, lastName, role);
    }
}
