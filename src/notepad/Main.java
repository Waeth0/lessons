package notepad;

/**
 * Спроектировать и разработать классы "Запись в блокноте" и "Блокнот"(записи блокнота хранятся в массиве). Добавлять запись, удалять запись, обновлять запись, посмотреть все записи
 */
public class Main {
    public static void main(String[] args) {
        Notepad notepad = new NotepadImpl(10);
        notepad.save("Мы пытаемся трениться");
        notepad.save("в джаве");
        String str = notepad.delete(0);
        notepad.save("Вроде получается");
        notepad.update(0, "я");
        notepad.showAll();
        System.out.println(str);
    }
}

