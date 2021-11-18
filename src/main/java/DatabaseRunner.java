public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDB();

        database.save();
    }
}
