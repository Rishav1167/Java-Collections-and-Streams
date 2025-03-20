package Java_Generics.UniversityCourseManagement.course_types;

import Java_Generics.UniversityCourseManagement.evaluation_types.ExamBased;

public class ExamCourse extends CourseType<ExamBased> {
    public ExamCourse(ExamBased evaluationType) {
        super(evaluationType);
    }
}
