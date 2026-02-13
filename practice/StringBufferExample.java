class Stringbuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append("k");
        System.out.println(sb);

        // insert() adds text at a specified index
        sb.insert(5, "halo");
        System.out.println("insert: " + sb);

        sb.replace(6, 11, "Java");
        System.out.println("replace: " + sb);

        sb.delete(5, 6);
        System.out.println("delete: " + sb);
    }
}
		
		