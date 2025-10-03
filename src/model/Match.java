package ua.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Match {
    private Team homeTeam;
    private Team awayTeam;
    private LocalDateTime matchDateTime;
    private String score;

    public Match(Team homeTeam, Team awayTeam, LocalDateTime matchDateTime, String score) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.matchDateTime = matchDateTime;
        this.score = score;
    }

    public static Match of(Team homeTeam, Team awayTeam, LocalDateTime matchDateTime, String score) {
        return new Match(homeTeam, awayTeam, matchDateTime, score);
    }

    @Override
    public String toString() {
        return String.format("%s vs %s, %s, Score: %s",
                homeTeam.name(), awayTeam.name(), matchDateTime, score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Match match)) return false;
        return Objects.equals(homeTeam, match.homeTeam) &&
                Objects.equals(awayTeam, match.awayTeam) &&
                Objects.equals(matchDateTime, match.matchDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeTeam, awayTeam, matchDateTime);
    }
}
