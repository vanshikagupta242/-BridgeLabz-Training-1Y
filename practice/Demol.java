class Demol{
	public static void main(String[]args){
		
		String str = "java is easy";
		
		StringTokenizer st = new StreamTokenizer(str);
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken()) ;
		}
	}
}