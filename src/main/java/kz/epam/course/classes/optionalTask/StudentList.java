package kz.epam.course.classes.optionalTask;

import kz.epam.course.classes.optionalTask.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Timur
 * @version 1.0
 * @since 26.05.2019
 */
public class StudentList {
    private List<Student> studentsList = new ArrayList<>();

    public void addStudent(Student a) {
        studentsList.add(a);
    }

    public void facultyPrint(String faculty) {
        Main.logger.info("Список студентов факультета " + faculty);
        for (Student st : studentsList) {
            if (st.getFaculty().equals(faculty)) {
                Main.logger.info(st.toString());
            }
        }
    }

    public void groupPrint(String group) {
        Main.logger.info("Список студентов группы " + group);
        for (Student st : studentsList) {
            if (st.getGroup().equals(group)) {
                Main.logger.info(st.toString());
            }
        }
    }

    public void yearOfBirthPrint(String year) {
        Main.logger.info("Список студентов, родившихся после " + year + " года");
        for (Student st : studentsList) {
            if (parseYear(st.getDateOfBirth().substring(6)) > parseYear(year)) {
                Main.logger.info(st.toString());
            }
        }
    }

    public void yearOfBirthPrint() {
        Main.logger.info("Список студентов, независимо от года рождения");
        for (Student st : studentsList) {
            Main.logger.info(st.toString());
        }
    }

    public void facultyCoursePrint(String faculty, String course) {
        Main.logger.info("Список студентов факультета " + faculty + " курса " + course);
        for (Student st : studentsList) {
            if (st.getFaculty().equals(faculty) & st.getCourse().equals(course)) {
                Main.logger.info(st.toString());
            }
        }
    }

    public void facultyCoursePrint(String faculty) {
        Main.logger.info("Список студентов факультета " + faculty + "всех курсов ");
        for (Student st : studentsList) {
            if (st.getFaculty().equals(faculty)) {
                Main.logger.info(st.toString());
            }
        }
    }

    public void facultyCoursePrint(int course) {
        Main.logger.info("Список студентов всех факультетов, курса " + course);
        for (Student st : studentsList) {
            if (Integer.parseInt(st.getCourse()) == course) {
                Main.logger.info(st.toString());
            }
        }
    }

    public int parseYear(String years) {
        return Integer.parseInt(years);
    }

}
