package com.c.springbootthymeleaf.controller.front;

import com.c.springbootthymeleaf.dto.DTO;
import com.c.springbootthymeleaf.service.MenuConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/admin/rest/menu/config")
public class MenuConfigController {

    @Autowired
    private MenuConfigService menuConfigService;

    @GetMapping(value = "/campaign",  produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody String list() {
        DTO dto = DTO.newDTO();
        try {
            dto.data = menuConfigService.getCampaignMenuConfig();
            return dto.toJson();
        } catch (Exception e) {
            e.printStackTrace();
            dto.errMsg = "error";
            dto.errCode = -1;
            return dto.toJson();
        }
    }

}
