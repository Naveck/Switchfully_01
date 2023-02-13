package basic.codelab01;

public class SportService {

    private SportRepository sportRepository;

    public SportService(SportRepository sportRepository) {
        this.sportRepository = sportRepository;
    }

    public Sport getSportByName(String name) {
        return sportRepository.getByName(name);
    }
}
