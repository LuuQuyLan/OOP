public class StudentManagement {
    Student[] students; 
    int studentCount;

    /**
     * Constructor to assign varibale.
     * @author QuyLan
     * @since 9/24/2023
     * @version 2.0
     */
    public StudentManagement() {
        students = new Student[100];
        studentCount = 0;
    }

    /**
     * The function is help compair two student.
     * @author QuyLan
     * @since 9/24/2023
     * @version 2.0
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * The function is help to add students in list.
     * @author QuyLan
     * @since 9/24/2023
     * @version 2.0
     */
    public void addStudent(Student newStudent) {
        if (studentCount < 100) {
            students[studentCount] = newStudent;
            studentCount++;
        }
    }

    /**
     * The function is help to group students in list.
     * @author QuyLan
     * @since 9/24/2023
     * @version 2.0
     */
    public String studentsByGroup() {
        StringBuilder result = new StringBuilder();

        String[] uniqueGroups = new String[100];
        int uniqueGroupCount = 0;

        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            String group = student.getGroup();
            boolean groupExists = false;
            for (int j = 0; j < uniqueGroupCount; j++) {
                if (uniqueGroups[j].equals(group)) {
                    groupExists = true;
                    break;
                }
            }
            if (!groupExists) {
                uniqueGroups[uniqueGroupCount] = group;
                uniqueGroupCount++;
                result.append(group).append("\n");
                for (int k = 0; k < studentCount; k++) {
                    if (student.getGroup().equals(students[k].getGroup())) {
                        result.append(students[k].getInfo()).append("\n");
                    }
                }
            }
        }

        return result.toString();
    }

    /**
     * The function is help to remove students in list.
     * @author QuyLan
     * @since 9/124/2023
     * @version 2.0
     */
    public void removeStudent(String id) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                studentCount--;
                students[studentCount] = null;
                return;
            }
        }
    }

    /**
     * Hàm main.
     * @author QuyLan
     * @since 9/24/2023
     * @version 2.0
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Nguyen Van An");
        s1.setId("17020001");
        s1.setGroup("K62CC");
        s1.setEmail("17020001@vnu.edu.vn");

        Student s2 = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        s2.setGroup("K62CC");

        Student s3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");

        Student s4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");

        Student s5 = new Student(s1);

        StudentManagement list = new StudentManagement();

        list.addStudent(s1);
        list.addStudent(s2);
        list.addStudent(s3);
        list.addStudent(s4);
        list.addStudent(s5);
        list.removeStudent("17020002");

        System.out.println(list.studentsByGroup());
    }
}