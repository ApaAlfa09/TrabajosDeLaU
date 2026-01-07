import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        FileDownloader file1 = new FileDownloader("Fort");
        FileDownloader file2 = new FileDownloader("GTAVI");
        FileDownloader file3 = new FileDownloader("COD");

        file1.start();
        file2.start();
        file3.start();

        file2.interrupt();

        List<FileDownloader> listaFiles = new ArrayList<>();
        listaFiles.add(file1);
        listaFiles.add(file2);
        listaFiles.add(file3);

        for (int i = 0; i < listaFiles.size(); i++) {
            if (listaFiles.get(i).isAlive()) {
                System.out.println("El hilo "+listaFiles.get(i).getName()+" esta vivo");
            }else{
                System.out.println("El hilo "+listaFiles.get(i).getName()+" esta muerto");
            }
        }

        try {
            file1.join();
            file2.join();
            file3.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("fin.");
    }
}