import java.time.LocalDate;

enum LifeEventType {
    BIRTH("Naissance"),
    MARRIAGE("Mariage"),
    GRADUATION("Diplôme"),
    NEW_JOB("Nouveau travail"),
    HOUSE_PURCHASE("Achat d'une maison"),
    RETIREMENT("Retraite"),
    DEATH("Décès");

    private final String description;

    LifeEventType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

class LifeEvent {
    private LifeEventType type;
    private LocalDate date;
    private String details;

    public LifeEvent(LifeEventType type, LocalDate date, String details) {
        this.type = type;
        this.date = date;
        this.details = details;
    }

    public LifeEventType getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Événement : " + type.getDescription() +
               ", Date : " + date +
               ", Détails : " + details;
    }
}

public class LifeEventManager {
    public static void main(String[] args) {
        // Exemple d'utilisation
        LifeEvent birth = new LifeEvent(LifeEventType.BIRTH, LocalDate.of(1990, 5, 20), "Lieu : Paris");
        LifeEvent graduation = new LifeEvent(LifeEventType.GRADUATION, LocalDate.of(2012, 6, 30), "Diplôme en informatique");

        System.out.println(birth);
        System.out.println(graduation);
    }
}
