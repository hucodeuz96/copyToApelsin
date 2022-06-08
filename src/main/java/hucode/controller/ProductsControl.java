package hucode.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static hucode.config.WebMvcConfig.jdbcTemplate;

@Controller
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductsControl {
    @GetMapping("readAll")
    public ModelAndView readProduct(ModelAndView mv){
        return null;
    }

}
