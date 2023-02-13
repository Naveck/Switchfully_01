package basic.codelab01;

public class SportRepository {

    private final Sport[] sports = new Sport[] {
            new Sport("Football"),
            new Sport("Hockey"),
            new Sport("Tennis")
    };

    public Sport getByName(String name) {
        for(Sport sport: sports) {
            if(sport.getName().equals(name)) {
                return sport;
            }
        }
        return null;
    }
}
