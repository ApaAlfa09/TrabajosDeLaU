public class ComputerFacade {
    private CPU cpu;
    private HardDrive hardDrive;
    private Memory memory;

    public void star(){
        System.out.println("System is staring");
        cpu.execute();
        cpu.freeze();
        cpu.jump();

        hardDrive.read();

        memory.load();
    }
    
}