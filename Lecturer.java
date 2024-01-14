
/**
 * Write a description of class Lecturer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lecturer extends Teacher
{
    String department;
    int yearsOfExperience;
    int gradedScore;
    boolean hasGraded;
    
    
    //Constructor
    public Lecturer(int teacherID, String teacherName, String address, String workingType, String employment, String department, int yearsOfExperience, int workingHours){
        super(teacherID, teacherName, address, workingType, employment);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
        super.setWorkingHours(workingHours);
    }
    
    //Accessor methods (getter)
    
    public String getDepartment(){
        return department;
    }
    
    public int getYearsOfExperience(){
        return yearsOfExperience;
    }
    
    public int getGradedScore(){
        return gradedScore;
    }
    
    public boolean getHasGraded(){
        return hasGraded;
    }
    
    //mutator method
    public void setGradedScore(int gradedScore){
        this.gradedScore = gradedScore;
    }
    
    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience){
        
        String letterGrade;
        
        if (hasGraded == false)
        {
            if (yearsOfExperience >= 5 && department == this.department){
                if(gradedScore >= 70){
                    letterGrade = "A";
                }
                else if(gradedScore >= 60 && gradedScore < 70){
                    letterGrade = "B";
                }
                else if(gradedScore >= 50 && gradedScore < 60){
                    letterGrade = "C";
                }
                else if(gradedScore >= 40 && gradedScore < 50){
                    letterGrade = "D";
                }
                else {
                    letterGrade = "E";
                }
                
                hasGraded = true;
            }
            else
            {
                System.out.println("Experience requirements not met // department invalid");
            }
        }
        else
        {
            System.out.println("Teacher has already graded the assignments");
        }
      
    }
    
    public void displayInfo()
    {
        super.displayInfo(); //Calling display method of superclass
        System.out.println("something");
    }
    
}
