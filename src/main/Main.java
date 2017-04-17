package main;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m"; // "\033[32"
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLUE_BOLD_UNDERLINE = "\u001B[34;1;4;3m";

    public static final String ANSI_BACKGROUD_BLUE = "\u001B[46m";



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        String Name = "";

        /*Pipe pipe = null;
        try {
            pipe = Pipe.open();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert pipe != null;
        Pipe.SourceChannel sourceChannel = pipe.source();
        ByteBuffer buf = ByteBuffer.allocate(48);

        try {
            int bytesRead = sourceChannel.read(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String v = new String(buf.array());

        System.out.println("Hello : " + v);*/

        //BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        //String Name = f.lines().parallel().collect(Collectors.joining("\n"));

        do {
            Name = scanner.next();
            System.out.println(new StringBuilder().append(ANSI_GREEN)
                    .append("Hello ")
                    .append(ANSI_BLUE_BOLD_UNDERLINE)
                    .append(Name)
                    .append(ANSI_RESET)
                    .toString());
        } while (scanner.hasNext());
    }
}
