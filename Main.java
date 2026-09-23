import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] prints = {"IMP-01", "IMP-02", "IMP-03"};
        int[] status = {1, 0, 1};
        List<String> erros = new ArrayList<>();
        for (int i = 0; i < prints.length; i++) {
            if (status[i] == 0) {
                erros.add(prints[i]);
            }
        }
        if (erros.isEmpty()) {
            System.out.println("Nenhum erro encontrado");
        } else {
            for (String p : erros) {
                System.out.println(p);
            }
        }
    }
}