/**
 * @author bvanchuhov
 */
public class VariableOperations {

    public static void main(String[] args) {
        int age = 25;
        age = age + 20; // 45
        age += 20; // 65

        age = age + 1; // 66
        age += 1; // 67
        age++; // 68
        ++age; // 69

        System.out.println(age);

        //---------------------

        int x = 10;
        x += x++ + ++x;
        System.out.println(x);
    }
}
