public class FileDownloader extends Thread{
    private String fileName;

    public FileDownloader(String name) {
        setName("Dowloader-"+name);
    }

    @Override
    public void run() {
        System.out.println("El hilo "+getName()+" comenzo");
        for (int i = 0; i < 10; i++) {
            int num = i*10;
            System.out.println(num);
            if (isInterrupted()) {
                System.out.println("El hilo "+getName()+" fue interrumpido");
                return;
            }
        }
    }

    
}