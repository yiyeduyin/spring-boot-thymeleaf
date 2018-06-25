package com.c.springbootthymeleaf.controller.front;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.c.springbootthymeleaf.dto.DTO;
import com.c.springbootthymeleaf.dto.MenuConfig.*;
import com.c.springbootthymeleaf.service.MenuConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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

    @PostMapping(value = "/campaign")
    public @ResponseBody String createCampaign(@RequestBody CampaignMenuConfigDto configDto) {
        DTO dto = DTO.newDTO();
        try {
            menuConfigService.updateCampaignMenuConfig(configDto);
            return dto.toJson();
        } catch (Exception e) {
            e.printStackTrace();
            dto.errMsg = "error";
            dto.errCode = -1;
            return dto.toJson();
        }
    }

    @GetMapping(value = "/collection",  produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody String collectionList() {
        DTO dto = DTO.newDTO();
        try {
            dto.data = menuConfigService.getCollectionMenuConfig();
            return dto.toJson();
        } catch (Exception e) {
            e.printStackTrace();
            dto.errMsg = "error";
            dto.errCode = -1;
            return dto.toJson();
        }
    }

    @PostMapping(value = "/collection")
    public @ResponseBody String createCollection(@RequestBody CollectionMenuConfigDto configDto) {
        DTO dto = DTO.newDTO();
        try {
            menuConfigService.updateCollectionMenuConfig(configDto);
            return dto.toJson();
        } catch (Exception e) {
            e.printStackTrace();
            dto.errMsg = "error";
            dto.errCode = -1;
            return dto.toJson();
        }
    }

    @GetMapping(value = "/project",  produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody String getProject() {
        DTO dto = DTO.newDTO();
        try {
            dto.data = menuConfigService.getProjectMenuConfig();
            return dto.toJson();
        } catch (Exception e) {
            e.printStackTrace();
            dto.errMsg = "error";
            dto.errCode = -1;
            return dto.toJson();
        }
    }

    @PostMapping(value = "/project")
    public @ResponseBody String createProject(@RequestBody ProjectMenuConfigDto configDto) {
        DTO dto = DTO.newDTO();
        try {
            menuConfigService.updateProjectMenuConfig(configDto);
            return dto.toJson();
        } catch (Exception e) {
            e.printStackTrace();
            dto.errMsg = "error";
            dto.errCode = -1;
            return dto.toJson();
        }
    }

    @GetMapping(value = "/shop",  produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody String getShop() {
        DTO dto = DTO.newDTO();
        try {
            dto.data = menuConfigService.getShopMenuConfig();
            return dto.toJson();
        } catch (Exception e) {
            e.printStackTrace();
            dto.errMsg = "error";
            dto.errCode = -1;
            return dto.toJson();
        }
    }

    @PostMapping(value = "/shop")
    public @ResponseBody String createShop(@RequestBody ShopMenuConfigDto configDto) {
        DTO dto = DTO.newDTO();
        try {
            menuConfigService.updateShopMenuConfig(configDto);
            return dto.toJson();
        } catch (Exception e) {
            e.printStackTrace();
            dto.errMsg = "error";
            dto.errCode = -1;
            return dto.toJson();
        }
    }

    @GetMapping(value = "/eShop",  produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody String getEShop() {
        DTO dto = DTO.newDTO();
        try {
            dto.data = menuConfigService.getEShopMenuConfig();
            return dto.toJson();
        } catch (Exception e) {
            e.printStackTrace();
            dto.errMsg = "error";
            dto.errCode = -1;
            return dto.toJson();
        }
    }

    @PostMapping(value = "/eShop")
    public @ResponseBody String creatEShop(@RequestBody EShopMenuConfigDto configDto) {
        DTO dto = DTO.newDTO();
        try {
            menuConfigService.updateEShopMenuConfig(configDto);
            return dto.toJson();
        } catch (Exception e) {
            e.printStackTrace();
            dto.errMsg = "error";
            dto.errCode = -1;
            return dto.toJson();
        }
    }

    @GetMapping(value = "/moreinfo",  produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody String getMoreinfo() {
        DTO dto = DTO.newDTO();
        try {
            dto.data = menuConfigService.getMoreinfoMenuConfig();
            return dto.toJson();
        } catch (Exception e) {
            e.printStackTrace();
            dto.errMsg = "error";
            dto.errCode = -1;
            return dto.toJson();
        }
    }

    @PostMapping(value = "/moreinfo")
    public @ResponseBody String createMoreinfo(@RequestBody MoreinfoConfigDto configDto) {
        DTO dto = DTO.newDTO();
        try {
            menuConfigService.updateMoreinfoConfig(configDto);
            return dto.toJson();
        } catch (Exception e) {
            e.printStackTrace();
            dto.errMsg = "error";
            dto.errCode = -1;
            return dto.toJson();
        }
    }

    @GetMapping(value = "/index",  produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody String getIndex() {
        DTO dto = DTO.newDTO();
        try {
            dto.data = menuConfigService.getIndexMenuConfig();
            return dto.toJson();
        } catch (Exception e) {
            e.printStackTrace();
            dto.errMsg = "error";
            dto.errCode = -1;
            return dto.toJson();
        }
    }

    @PostMapping(value = "/index")
    public @ResponseBody String createIndexo(@RequestBody IndexMenuConfigDto configDto) {
        DTO dto = DTO.newDTO();
        try {
            menuConfigService.updateIndexMenuConfig(configDto);
            return dto.toJson();
        } catch (Exception e) {
            e.printStackTrace();
            dto.errMsg = "error";
            dto.errCode = -1;
            return dto.toJson();
        }
    }

    @GetMapping(value = "/press",  produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody String getPressx() {
        DTO dto = DTO.newDTO();
        try {
            dto.data = menuConfigService.getPressMenuConfig();
            return dto.toJson();
        } catch (Exception e) {
            e.printStackTrace();
            dto.errMsg = "error";
            dto.errCode = -1;
            return dto.toJson();
        }
    }

    @PostMapping(value = "/press")
    public @ResponseBody String createIndexo(@RequestBody PressMenuConfigDto configDto) {
        DTO dto = DTO.newDTO();
        try {
            menuConfigService.updatePressMenuConfig(configDto);
            return dto.toJson();
        } catch (Exception e) {
            e.printStackTrace();
            dto.errMsg = "error";
            dto.errCode = -1;
            return dto.toJson();
        }
    }

}
