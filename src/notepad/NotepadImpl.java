package notepad;


public class NotepadImpl implements Notepad {

    private String[] records;

    public NotepadImpl(int recordslenght) {
        this.records = new String[recordslenght];
    }

    @Override
    public String save(String record) {
        for (int i = 0; i < records.length; i++) {
            if (records[i] == null) {
                records[i] = record;
                break;
            }
        }
        return record;
    }

    @Override
    public String delete(int index) {
        String temp = records[index];
        records[index] = null;
        return temp;
    }

    @Override
    public String update(int index, String newRecord) {
        records[index] = newRecord;
        return newRecord;
    }

    @Override
    public void showAll() {
        for (int i = 0; i < records.length; i++) {
            System.out.println(records[i] + " ");
        }
        System.out.println();
    }
}
