import java.util.*;

public class Arifmetic {
//    public String NotEven (List<Integer> names) {
    public List<Integer> notEven(List<Integer> names) {
        List <Integer> notEven = new ArrayList<>();
        for (Integer name : names) {
            if (name % 2 != 0) {
                notEven.add(name);
            }
        }
//        for (int i = 0; i < names.size(); i++) {
//            if (names.get(i) % 2 == 0) {
//                notEven = notEven + names.get(i) + " ";
//            }
//        }
//        return notEven.toString();
        return notEven;
    }

//    public String even (List<Integer> names) {
    public List<Integer> even(List<Integer> names) {
        List<Integer> dublicat = new ArrayList<>();
        for (Integer name : names) {
            if (name % 2 == 0) {
                dublicat.add(name);
            }
        }
//        Collections.sort(dublicat);
        Set<Integer> set = new HashSet<>(dublicat);
        dublicat = new ArrayList<>(set);
//        set.addAll(dublicat);
//        for (Integer integer : dublicat) {
//            set.add(integer);
//        }
//        names.forEach(n -> {
//            if (!set.add(n)) {
//                dublicat.add(n);
//            }
//        });
//        Collections.sort(dublicat);
//        return dublicat.toString();
        return dublicat;
//        return set.toString();
    }
//    public String even (List<Integer> names) {
//        String even = " ";
//        for (Integer name : names) {
//            if (name % 2 != 0) {
//                even = even + name + " ";
//            }
//        }
//        return even;
//    }
}
