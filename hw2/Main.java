package hw.hw2;

import hw.hw2.client.ClientController;
import hw.hw2.client.ClientGUI;
import hw.hw2.server.FileStorage;
import hw.hw2.server.ServerController;
import hw.hw2.server.ServerWindow;

public class Main {
    public static void main(String[] args) {

        ServerController serverController = new ServerController(new ServerWindow(), new FileStorage());
        new ClientController(new ClientGUI(), serverController);
        new ClientController(new ClientGUI(), serverController);
    }
}