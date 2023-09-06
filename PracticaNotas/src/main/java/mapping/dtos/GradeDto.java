package mapping.dtos;

import domain.models.Grade;
import domain.models.Student;
import domain.models.Subject;

import java.util.List;

public record GradeDto(int id,
                       Student student,
                       Subject subject,
                       List<Grade> grades) {
}
