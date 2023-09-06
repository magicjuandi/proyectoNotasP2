package mapping.dtos;

import domain.enums.Semester;
import domain.models.Teacher;

public record SubjectDto(int id,
                         String name,
                         Teacher teacher,
                         Semester semester) {
}
