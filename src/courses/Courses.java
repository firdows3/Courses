
package courses;


public class Courses {
    protected int ects;
    protected String instructor;
    public Courses (int ch, String teacher)
    {
        ects = ch;
        instructor = teacher;
    }
    public void setEcts (int value)
    {
        ects = value;
    }
    public void setInstructor (String value)
    {
        instructor = value;
    }
    public static void main(String[] args) {
        Results res = new Results(5,"mr.Desalegn");

    }
}




class Results extends Courses//inheriting the class courses
{
    int gpa;

    public Results(int ch, String teacher) {
        super(ch, teacher);
        int gpa = 4;
        switch(gpa){
            case 4:
                gpa = 4*ch;
                System.out.println(gpa);
                System.out.println("4 = A");
                break;
            case 3:
                gpa = 3*ch;
                System.out.println(gpa);
                System.out.println("3 = B");
                break;
            case 2:
                gpa = 2*ch;
                System.out.println(gpa);
                System.out.println("2 = c");
                break;
            case 1:
                gpa = 1*ch;
                System.out.println(gpa);
                System.out.println("1 = D");
                break;
            case 0:
                System.out.println("0 = F");
                System.out.println("FAIL!!!");
                break;

            default:System.out.println("no such grade");

        }

    }
}

   

    
    

