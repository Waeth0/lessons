package novicePack;

    public class OfficeSupplies {
        public String name;
        public int count;


        public OfficeSupplies(String name, int count) {
            this.name = name;
            this.count = count;
        }
        @Override
        public String toString() {
            return "OfficeSupplies{" +
                    "name='" + name + '\'' +
                    ", count=" + count +
                    '}';
        }
    }






