package hw.hw2.server;

public interface ServerRepository {
    void saveInLog(String text);
    String readLog();
}