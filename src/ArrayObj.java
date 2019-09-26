
public class ArrayObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         stud s2=new stud();
         teach t2=new teach();
         Object obj[]= {s2,t2};
         for(Object obj1 : obj)
         {
        	 System.out.println(obj1);
         }
	}

}
class stud{
	int id=2;
	String name="abc";
	public String toString()
	{
		return "Student id"+id+"Name="+name;
	}
	
}
class teach extends stud{
	
	int age=56;
	String name="pkl";
	public String tostring()
	{
		return "Teacher Age="+age+"Name="+name;
	}
}