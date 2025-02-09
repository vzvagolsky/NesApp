package group40.newsapp.DTO.errorDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FieldErrorDto {
    private String field;
    private String message;
    private Object rejectedValue;
}
