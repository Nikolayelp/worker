public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener error = (i) -> System.out.println("Ошибка при выполнении задачи " + i);

        Worker worker = new Worker(listener, error);
        worker.start();
    }
}
