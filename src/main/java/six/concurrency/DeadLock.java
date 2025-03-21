package six.concurrency;

public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        Friend faruk = new Friend("Faruk");
        Friend tarik = new Friend("Tarik");

        new Thread(() -> faruk.naklon(tarik)).start();
        new Thread(() -> tarik.naklon(faruk)).start();
        Thread.sleep(1000);
        System.out.println("TEST");
    }

    static class Friend{
        private final String name;

        public Friend(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

        private synchronized void naklon(Friend friend){
            System.out.printf("%s: %s se naklonio meni! %n", name, friend.getName());
        }
        private synchronized void uzvratiNaklon (Friend friend){
            System.out.printf("%s: %s se uzvratio naklon! %n", name, friend.getName());
            friend.naklon(this);
        }
    }
}
