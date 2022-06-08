package hucode.entity;

import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
@ToString
@Builder
public class Products {
    private int id;
    private String name;
    private int category_id;
    private String description;
    private Double price;
    private String photo;
}
