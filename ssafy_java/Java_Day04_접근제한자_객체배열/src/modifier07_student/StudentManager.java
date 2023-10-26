package modifier07_student;

public class StudentManager {
    // 학생 객체를 배열로 관리하기 위해 매니저는 싱글턴패턴으로 하여 계속 생성되는걸 막음
    private Student[] students = new Student[100];
    private int size = 0;

    private static StudentManager manager = new StudentManager();

    private StudentManager() {
    }

    public static StudentManager getManager() {
        return manager;
    }

    public void addStudent(Student st) {
        if (size < students.length)
            students[size++] = st;
        else
            System.out.println("정원 초과");

    }

    public Student getStudent(String name) {
        for (int i = 0; i < size; i++) {
            if (name.equals(students[i].getName())) {
                return students[i];
            }
        }
        return null;
    }

    public void changeMajor(String name, String major) {
        Student st = getStudent(name);
        if (st != null) {
            st.setMajor(major);
        } else {
            System.out.println("없는 이름");
        }

    }
}
