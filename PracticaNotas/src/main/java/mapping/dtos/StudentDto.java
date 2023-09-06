package mapping.dtos;

import domain.enums.Semester;

public record StudentDto(int id,
                         String name,
                         String email,
                         Semester semester) {
}
