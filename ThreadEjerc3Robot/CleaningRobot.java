public class CleaningRobot extends Thread{

    public CleaningRobot(String name) {
        setName(name);
    }

    @Override
    public void run() {
        try {
            System.out.println("El robot "+getName()+" inicio a limpiar");
            sleep(1000);
            System.out.println("El robot "+getName()+" ha terminado");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    
}