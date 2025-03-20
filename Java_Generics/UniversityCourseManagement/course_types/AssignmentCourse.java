package Java_Generics.UniversityCourseManagement.course_types;

import Java_Generics.UniversityCourseManagement.evaluation_types.AssignmentBased;

public class AssignmentCourse extends CourseType<AssignmentBased> {
    public AssignmentCourse(AssignmentBased evaluationType) {
        super(evaluationType);
    }
}
