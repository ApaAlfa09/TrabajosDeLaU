public class Main {
    public static void main(String[] args) {
        CleaningRobot robot1 = new CleaningRobot("Optimus");
        CleaningRobot robot2 = new CleaningRobot("Megatron");
        CleaningRobot robot3 = new CleaningRobot("Bombolbee");

        robot1.start();
        robot2.start();
        robot3.start();
    }
}
