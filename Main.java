public class Main {
    public static void main(String[] args) {
        Count cnt = new Count();
        try {
            while(cnt.getMyThread().isAlive()){
                System.out.println("Main thread still live until the death of its child!! ");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted!");
        }
        System.out.println("Main thread is over!");
    }
}
