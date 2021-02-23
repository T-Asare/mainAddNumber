import java.util.*;
    class Output {
        public static void addNumbers(List<? super Integer> list) {
            for (int i = 1; i <= 10; i++) {
                list.add(i);
            }
        }

        public static void main(String[] args) {
            List<Integer> ld = new ArrayList<>(Arrays.asList() )  ;//Instructions of line one;
            addNumbers(ld);//Instructions of line two;
            System.out.println(ld);//Instructions for  line three;
        }
    }
