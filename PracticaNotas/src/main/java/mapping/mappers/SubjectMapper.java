package mapping.mappers;

import domain.models.Grade;
import domain.models.Subject;
import mapping.dtos.GradeDto;
import mapping.dtos.SubjectDto;

import java.util.List;
import java.util.stream.Collectors;

public class SubjectMapper {
    public static SubjectDto mapFrom(Subject source){
        return new SubjectDto(source.getId(),
                source.getName(),
                source.getTeacher(),
                source.getSemester());
    }
    public static Subject mapFrom(SubjectDto source){
        return new Subject(source.id(),
                source.name(),
                source.teacher(),
                source.semester());
    }
    public static List<SubjectDto> mapFrom(List<Subject> source){
        return source.stream().map(SubjectMapper::mapFrom).collect(Collectors.toList());
    }
}
