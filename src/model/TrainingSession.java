package ua.model;

import java.time.LocalDateTime;

public class TrainingSession {
    private LocalDateTime sessionDateTime;
    private int duration;
    protected Team team; // protected — можна показати доступ у спадкоємцях

    public TrainingSession(LocalDateTime sessionDateTime, int duration, Team team) {
        this.sessionDateTime = sessionDateTime;
        this.duration = duration;
        this.team = team;
    }

    public static TrainingSession of(LocalDateTime sessionDateTime, int duration, Team team) {
        return new TrainingSession(sessionDateTime, duration, team);
    }

    @Override
    public String toString() {
        return String.format("Training on %s (%d min) for %s", sessionDateTime, duration, team.name());
    }
}
