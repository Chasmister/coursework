

public class Teacher
{
    
    //DONT FORGET TO WRITE COMMENTS 
    int teacherID;
    String teacherName;
    String address;
    String workingType;
    String employment;
    private int workingHours;

    public Teacher(int teacherID, String teacherName, String address, String workingType, String employment)
    {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employment = employment;
    }
    
    //Accessor methods for each attribute
    
    public int getTeacherID() 
    {
        return this.teacherID;
    }
    
    public String getTeacherName() 
    {
        return this.teacherName;
    }
    
    public String getAddress() 
    {
        return this.address;
    }
    
    public String getWorkingType() 
    {
        return this.workingType;
    }
    
    public String getEmployment() 
    {
        return this.employment;
    }
    
    public int getWorkingHours() 
    {
        return this.workingHours;
    }
    
    //Set Working Hours
    
    public void setWorkingHours(int workingHours)
    {
        this.workingHours = workingHours; //assigns parameter WorkingHours to instance variable WorkingHours present outside the method.
    }
    
    public void displayInfo()
    {
        //Suitable annotation required. redo code below.
        System.out.println("Teacher ID : " + getTeacherID());
        System.out.println("Name : " + getTeacherName());
        System.out.println("address : " + getAddress());
        System.out.println("Working Type : " + getWorkingType());
        System.out.println("Employment status : " + getTeacherName());
        if(workingHours == 0)
        {
            System.out.println("Working Hours: has not been assigned");
        }
        else
        {
            System.out.println("Working Hours : " + getWorkingHours());
        }
    }
    
} 
