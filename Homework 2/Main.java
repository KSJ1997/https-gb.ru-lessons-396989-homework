public class Main {
    public static void main(String[] args) {
        String tableName = "Animals";
        String idToDelete = "123";

        String deleteQuery = QueryBuilder.buildDeleteQuery(tableName, idToDelete);
        System.out.println("Delete Query: " + deleteQuery);
    }
}
