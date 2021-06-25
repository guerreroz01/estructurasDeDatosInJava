package queue;

public class QueueApp {
    public static void main(String[] args)
    {
        QueueList queue;
        queue = new QueueList();
        String text = "hola mundo";

        for(int i=0; i<text.length(); i++)
        {
            queue.insert(text.charAt(i));
        }

        for(int j=0; j<text.length(); j++)
        {
            System.out.print(queue.pop() + " ");
        }
    }
}
