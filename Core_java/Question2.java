package Core_java;
class Bind {
	
	private String name;
	private int id;
	private int deptId;

	public String getName() {
         return name; 
    }

	public int getId() { 
        return id; 
    }

    public int getDeptId() { 
        return deptId; 
    }

    public void setName(String empName){
		name = empName;
	}

	
	public void setDeptId(int empId) {
         id = empId; 
    }

    public void setId(int empDeptId) {
        deptId = empDeptId; 
   }

}

public class Question2 {
	public static void main(String[] args)
	{
		Bind e = new Bind();

		e.setName("Manas Maheshwari");
		e.setId(01);
		e.setDeptId(101);

		System.out.println("Name: " + e.getName());
		System.out.println("ID: " + e.getId());
		System.out.println("Dept ID: " + e.getDeptId());

		
	}
}
