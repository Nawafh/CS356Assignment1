/* Author Nawaf Alsufiani 10/12/2016
 this is a class Student which is used to store and display information about the student.
 Note that it is implemets the interface Person.
 */

public class Student implements Person
{
	

	private String name="";
	private int id = 0;
	
	
	public Student(String name, int id){
		this.name =name;
		
		this.id = id;
		
	}
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
	    this.name = name;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id=id;
		
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
    
	
	


	

	

	

}
