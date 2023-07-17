import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    List<Human> list;

    FamilyTree() {
        list = new ArrayList<>();
    }

    public void Add(Human human) {
        list.add(human);
    }

    public void Remove(Human human) {
        list.remove(human);
    }

    public static void PrintAllChildrens(Human human) {
        System.out.print(human.name + " { ");
        for (Human hm : human.children) {
            System.out.print(hm.name + " ");
        }
        System.out.println("}");
    }

}