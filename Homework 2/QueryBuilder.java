class QueryBuilder {
    public static String buildDeleteQuery(String tableName, String id) {
        return "DELETE FROM " + tableName + " WHERE ID = '" + id + "'";
    }
}
