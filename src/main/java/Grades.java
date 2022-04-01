import java.util.ArrayList;

public class Grades {
    ArrayList<String[]> grades = new ArrayList<>();

    public void addSubject(String subject) {
        String[] sub = {subject, " "};
        grades.add(sub);
    }

    public void dropSubject(String name) {
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i)[0].equals(name)) {
                grades.remove(i);
            }
        }
    }

    public String getGrades() {

        String result = "";
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i)[1].equals(" ")) {
                if (grades.size() == 1) {
                    result += grades.get(i)[0] + grades.get(i)[1] + "-";
                } else if (i == grades.size() - 1) {
                    result += grades.get(i)[0] + grades.get(i)[1] + "-";
                } else {
                    result += grades.get(i)[0] + grades.get(i)[1] + "-\r\n";
                }
            }else{
                if (grades.size() == 1) {
                    result += grades.get(i)[0] +" "+ grades.get(i)[1];
                } else if (i == grades.size() - 1) {
                    result += grades.get(i)[0] +" "+ grades.get(i)[1];
                } else {
                    result += grades.get(i)[0] +" "+ grades.get(i)[1]+"\r\n";
                }
            }

        }
        return result;
    }
}
