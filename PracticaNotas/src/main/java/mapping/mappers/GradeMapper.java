package mapping.mappers;

import domain.models.Grade;
import mapping.dtos.GradeDto;

import java.util.List;
import java.util.stream.Collectors;

public class GradeMapper {
    public static GradeDto mapFrom(Grade source){
        return new GradeDto(source.getId(),
                source.getStudent(),
                source.getSubject(),
                source.getGrades());
    }
    public static Grade mapFrom(GradeDto source){
       return new Grade(source.id(),
               source.student(),
               source.subject(),
               source.grades());
    }
    public static List<GradeDto> mapFrom(List<Grade> source){
        return source.stream().map(GradeMapper::mapFrom).collect(Collectors.toList());
    }

}
