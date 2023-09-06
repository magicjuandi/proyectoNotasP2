package mapping.mappers;

import domain.models.Grade;
import domain.models.Student;
import mapping.dtos.GradeDto;
import mapping.dtos.StudentDto;

import java.util.List;
import java.util.stream.Collectors;

public class StudentMapper {
    public static StudentDto mapFrom(Student source){
        return new StudentDto(source.getId(),
                source.getName(),
                source.getEmail(),
                source.getSemester());
    }
    public static Student mapFrom(StudentDto source){
        return new Student(source.id(),
                source.name(),
                source.email(),
                source.semester());
    }
    public static List<StudentDto> mapFrom(List<Student> source){
        return source.stream().map(StudentMapper::mapFrom).collect(Collectors.toList());
    }
}
