package pojo1;


	public class PojoRun {

		public static void main(String[] args) {
			
			
			Student s = new Student();
			
			s.setName("akhila");
			String name = s.getName();
			System.out.println(name);
			
			Student s1 = new Student("sai",8,20);
			String name1 = s1.getName();
			System.out.println(name1);
		}
}
