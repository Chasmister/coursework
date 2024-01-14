
/**
 * Write a description of class Tutor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutor extends Teacher
{
    double salary;
    String specialization;
    String academicQualifications;
    int performanceIndex;
    boolean isCertified;
    
    public Tutor(int teacherID, String teacherName, String address, String workingType, String employment, int workingHours, double salary, String specialization, String academicQualifications, int performanceIndex)
    {
        super(teacherID, teacherName, address, workingType, employment);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
        super.setWorkingHours(workingHours);
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public String getSpecialization()
    {
        return specialization;
    }
    
    public String getAcademicQualifications()
    {
        return academicQualifications;
    }
    
    public int getPerformanceIndex()
    {
        return performanceIndex;
    }
    
    public boolean getIsCertified()
    {
        return isCertified;
    }
    
    public void setSalary(double newSalary, int newPerformanceIndex)
    {
        if (newPerformanceIndex >= 5 && getWorkingHours() > 20)
        {
            if (newPerformanceIndex <= 7)
            {
                newSalary = this.salary + (5/100)*this.salary;
            }
            else if (newPerformanceIndex <= 9)
            {
                newSalary = this.salary + (10/100)*this.salary;
            }
            else if (newPerformanceIndex == 10)
            {
                newSalary = this.salary + (20/100)*this.salary;
            }
            
            this.isCertified = true;
        }
    }
    
    public void removeTutor()
    {
        
    }
}
