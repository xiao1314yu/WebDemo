package cn.nc.web;

/**
 * Created by OuKyou on 2017/1/11.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping("/")
    String home(Model model) {
        logger.info("test");
        model.addAttribute("name","WebDemo");
        return "index";
    }

}