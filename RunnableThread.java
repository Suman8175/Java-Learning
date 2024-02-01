

class ThreadOne implements  Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("I'm Cooking food now");
        }
    }
}

    class ThreadTwo implements Runnable {

        @Override
        public void run() {
            while (true) {
                System.out.println("I'm chatting with friend now");
            }
        }
    }


    public class RunnableThread {
        public static void main(String[] args) {
            ThreadOne bulletone = new ThreadOne();
            Thread gun1 = new Thread(bulletone);
            ThreadTwo bullettwo = new ThreadTwo();
            Thread gun2 = new Thread(bullettwo);

            gun1.start();
            gun2.start();
        }

    }
