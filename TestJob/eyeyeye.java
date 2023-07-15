import java.util.List;

public class eyeyeye {
    public static void main(String[] args){
        String[] array = new String[]{"Java", "Python", "C#"};
        List<String> list = List.of(array);
        array[0] = "С++";
        System.out.println(list.get(0));
    }
}
