package notepad;


public class NotepadImpl implements Notepad {

    private String[] records;

    public NotepadImpl(int recordsLength) {
        this.records = new String[recordsLength];
    }

    @Override
    public String save(String record) {
        for (int i = 0; i < records.length; i++) {
            String currentRecord = records[i];
            if (currentRecord == null) {
                currentRecord = record;
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
            String record = records[i];
            if (record != null) {
                System.out.println(record + " ");
            }
        }
        System.out.println();
    }
}
