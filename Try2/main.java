public class main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println(String.format("Argument %d: %s", i, args[i]));
    }
}

