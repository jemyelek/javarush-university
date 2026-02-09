package com.javarush.personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class ServerSocketDemo {
    public static void main(String[] args) throws IOException {
        // TCP
        ServerSocket server = new ServerSocket(4848);
        Socket socketOutput = new Socket("localhost", 4848);

        PrintWriter writer = new PrintWriter(socketOutput.getOutputStream(), true);
        writer.println("Hey there!");

        Socket socketInput = server.accept();
        BufferedReader reader = new BufferedReader(new InputStreamReader(socketInput.getInputStream()));

        String message = reader.readLine();
        System.out.println("From client: " + message);

        InetAddress address = InetAddress.getByName("google.com");
        System.out.println(address.getHostAddress());
        System.out.println('\n');

        // UDP
        DatagramSocket serverSocketUDP = new DatagramSocket(5050);
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        serverSocketUDP.receive(packet);

        String messageUDP = new String(packet.getData(), 0, packet.getLength());
        System.out.println("From UDP Client: " + messageUDP);



    }
}
