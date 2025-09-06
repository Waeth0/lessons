package notepad;

public interface Notepad {
    String save(String record);
    String delete(int index);
    String update(int index, String newRecord);
    void showAll();
}
