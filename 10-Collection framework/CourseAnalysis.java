import java.util.*;

public class CourseAnalysis {

    public static Set<Integer> commonStudents(
            Set<Integer> set1,
            Set<Integer> set2) {

        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static Set<Integer> allStudents(
            Set<Integer> set1,
            Set<Integer> set2) {

        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<Integer> onlyJava(
            Set<Integer> set1,
            Set<Integer> set2) {

        Set<Integer> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(101);
        set1.add(102);
        set1.add(103);
        set1.add(104);

        set2.add(103);
        set2.add(104);
        set2.add(105);
        set2.add(106);

        System.out.println("Students in both: "
                + commonStudents(set1, set2));

        System.out.println("Students in either: "
                + allStudents(set1, set2));

        System.out.println("Students only in Java: "
                + onlyJava(set1, set2));
    }
}