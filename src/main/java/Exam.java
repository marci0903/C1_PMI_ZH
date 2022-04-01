public class Exam extends Grades{
    public void registGradeToSubject(String subject,int grade){
        for(int i=0; i< grades.size(); i++){
            if(grades.get(i)[0].equals(subject)){
                String gra=""+grade;
                String[] rg={subject,gra};
                grades.set(i,rg);
            }
        }
    }
}
