package application;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import entities.Alunos;
public class Program {
    public static void main(String[] args) {

        List<Alunos> list = new ArrayList<>();

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String path = "C:\\Windows\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Alunos(Integer.parseInt(fields[0]), fields[1], sdf.parse(fields[2]), Integer.parseInt(fields[3])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Alunos alunos : list) {
                System.out.println(alunos.getId() + ", " + alunos.getName() + ", " + sdf.format(alunos.getNascimento()) + ", " + alunos.getNota() );
            }
        } catch (IOException | ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
