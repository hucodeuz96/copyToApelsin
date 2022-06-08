package hucode.entity;

import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
@ToString
@Builder
public class Categories {
    private  int id;
    private String cat_name;
}
