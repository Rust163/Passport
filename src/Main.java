import java.util.*;


public class Main {
    public static void main(String[] args) {

        Passport passportSidor = new Passport(Collections.singleton("3607789654"),
                "Жуков",
                "Евгениевич",
                "Сергей",
                "06.08.1991");

        Passport passportBob = new Passport(Collections.singleton("3607632548"),
                "Торрето",
                "Доминикович",
                "Доминик",
                "24.06.1981");

        Passport passportJack = new Passport(Collections.singleton("3607854269"),
                "Бородач",
                "Семенович",
                "Николай",
                "02.11.1971");

        Set<Passport> passportNumbers = new HashSet<>();

        passportNumbers.add(passportSidor);
        passportNumbers.add(passportBob);
        passportNumbers.add(passportJack);
        passportNumbers.add(passportJack);

        for (Passport passportNumber : passportNumbers) {
            System.out.println(passportNumber);
        }

        System.out.println("Паспорт: " + Passport.findPassport(passportNumbers, "3607632548"));

    }
}