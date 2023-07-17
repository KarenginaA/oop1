import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Human David = new Human("David", Gender.Male, LocalDate.of(1914, 12, 21), LocalDate.of(2000, 1, 1));
        Human Mary = new Human("Mary", Gender.Female, LocalDate.of(1920, 11, 12), LocalDate.of(2003, 2, 2));
        Human Monya = new Human("Monya", Gender.Female, LocalDate.of(1935, 9, 2), LocalDate.of(2010, 1, 1), Mary, David);
        Human Sara = new Human("Sara", Gender.Female, LocalDate.of(1934, 10, 2), LocalDate.of(2000, 1, 1), Mary, David);
        Human Fima = new Human("Fima", Gender.Male, LocalDate.of(1930, 5, 8), LocalDate.of(2001, 5, 13));
        Human Izzya = new Human("Izzya", Gender.Male, LocalDate.of(1964, 4, 13), LocalDate.of(2000, 1, 1), Sara, Fima);

        FamilyTree tree = new FamilyTree();
        tree.Add(David);
        tree.Add(Mary);
        tree.Add(Monya);
        tree.Add(Sara);
        tree.Add(Fima);
        tree.Add(Izzya);
        tree.Remove(Mary);

        David.PrintAllChildrens();





    }
}