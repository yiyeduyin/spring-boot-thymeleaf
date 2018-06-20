package com.c.springbootthymeleaf.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.c.springbootthymeleaf.domain.base.DataDic;
import com.c.springbootthymeleaf.dto.MenuConfig.*;
import com.c.springbootthymeleaf.reposiritory.base.DataDicRepository;
import com.c.springbootthymeleaf.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class MenuConfigServiceImpl implements MenuConfigService {

    @Autowired
    private DataDicRepository dataDicRepository;


    @Override
    public CampaignMenuConfigDto getCampaignMenuConfig() {
        DataDic dataDic = dataDicRepository.findByDataCode(Constant.campaignCode);
        JSONObject object = JSON.parseObject(dataDic.getDataValue());
        String color = object.getString("color");
        String backgroupPicturesStr = object.getString("backgroupPictures");
        backgroupPicturesStr.split(",");
        List<String> pics = Arrays.asList(backgroupPicturesStr.split(","));

        CampaignMenuConfigDto configDto = new CampaignMenuConfigDto();
        configDto.setMenuFontColour(color);
        configDto.setBackgroupPictures(pics);

        return configDto;
    }

    @Override
    public CollectionMenuConfigDto getCollectionMenuConfig() {
        DataDic dataDic = dataDicRepository.findByDataCode(Constant.collectionCode);
        JSONObject object = JSON.parseObject(dataDic.getDataValue());
        String color = object.getString("color");
        String backgroupPicturesStr = object.getString("backgroupPictures");
        backgroupPicturesStr.split(",");
        List<String> pics = Arrays.asList(backgroupPicturesStr.split(","));

        CollectionMenuConfigDto configDto = new CollectionMenuConfigDto();
        configDto.setMenuFontColour(color);
        configDto.setBackgroupPictures(pics);

        return configDto;
    }

    @Override
    public IndexMenuConfigDto getIndexMenuConfig() {
        DataDic dataDic = dataDicRepository.findByDataCode(Constant.indexCode);
        JSONObject object = JSON.parseObject(dataDic.getDataValue());
        String color = object.getString("color");
        String backgroupPicturesStr = object.getString("backgroupPictures");
        backgroupPicturesStr.split(",");
        List<String> pics = Arrays.asList(backgroupPicturesStr.split(","));

        IndexMenuConfigDto configDto = new IndexMenuConfigDto();
        configDto.setMenuFontColour(color);
        configDto.setBackgroupPictures(pics);

        return configDto;
    }

    @Override
    public PressMenuConfigDto getPressMenuConfig() {
        DataDic dataDic = dataDicRepository.findByDataCode(Constant.pressCode);
        JSONObject object = JSON.parseObject(dataDic.getDataValue());
        String color = object.getString("color");
        String backgroupPicturesStr = object.getString("backgroupPictures");
        backgroupPicturesStr.split(",");
        List<String> pics = Arrays.asList(backgroupPicturesStr.split(","));

        PressMenuConfigDto configDto = new PressMenuConfigDto();
        configDto.setMenuFontColour(color);
        configDto.setBackgroupPictures(pics);

        return configDto;
    }

    @Override
    public ProjectMenuConfigDto getProjectMenuConfig() {
        DataDic dataDic = dataDicRepository.findByDataCode(Constant.projectCode);
        JSONObject object = JSON.parseObject(dataDic.getDataValue());
        String color = object.getString("color");
        String backgroupPicturesStr = object.getString("backgroupPictures");
        backgroupPicturesStr.split(",");
        List<String> pics = Arrays.asList(backgroupPicturesStr.split(","));

        ProjectMenuConfigDto configDto = new ProjectMenuConfigDto();
        configDto.setMenuFontColour(color);
        configDto.setBackgroupPictures(pics);

        return configDto;
    }

    @Override
    public ShopMenuConfigDto getEShopMenuConfig() {
        DataDic dataDic = dataDicRepository.findByDataCode(Constant.shopCode);
        JSONObject object = JSON.parseObject(dataDic.getDataValue());
        String color = object.getString("color");
        String backgroupPicturesStr = object.getString("backgroupPictures");
        backgroupPicturesStr.split(",");
        List<String> pics = Arrays.asList(backgroupPicturesStr.split(","));

        ShopMenuConfigDto configDto = new ShopMenuConfigDto();
        configDto.setMenuFontColour(color);
        configDto.setBackgroupPictures(pics);

        return configDto;
    }

    @Override
    public void updateCampaignMenuConfig(CampaignMenuConfigDto configDto) {
        DataDic dataDic = dataDicRepository.findByDataCode(Constant.campaignCode);
        if(dataDic == null){
            dataDic = new DataDic();
            dataDic.setDataCode(Constant.campaignCode);
            dataDic.setCreateTime(new Date());
        }
        List<String> list = configDto.getBackgroupPictures();
        String pics = StringUtils.collectionToDelimitedString(list, ",");
        JSONObject object = new JSONObject();
        object.put("color", configDto.getMenuFontColour());
        object.put("backgroupPictures",pics);
        dataDic.setDataValue(object.toJSONString());
        dataDicRepository.save(dataDic);
    }

    @Override
    public void updateCollectionMenuConfig(CollectionMenuConfigDto configDto) {
        DataDic dataDic = dataDicRepository.findByDataCode(Constant.collectionCode);
        if(dataDic == null){
            dataDic = new DataDic();
            dataDic.setDataCode(Constant.collectionCode);
            dataDic.setCreateTime(new Date());
        }
        List<String> list = configDto.getBackgroupPictures();
        String pics = StringUtils.collectionToDelimitedString(list, ",");
        JSONObject object = new JSONObject();
        object.put("color", configDto.getMenuFontColour());
        object.put("backgroupPictures",pics);
        dataDic.setDataValue(object.toJSONString());
        dataDicRepository.save(dataDic);
    }

    @Override
    public void updateIndexMenuConfig(IndexMenuConfigDto configDto) {
        DataDic dataDic = dataDicRepository.findByDataCode(Constant.indexCode);
        if(dataDic == null){
            dataDic = new DataDic();
            dataDic.setDataCode(Constant.indexCode);
            dataDic.setCreateTime(new Date());
        }
        List<String> list = configDto.getBackgroupPictures();
        String pics = StringUtils.collectionToDelimitedString(list, ",");
        JSONObject object = new JSONObject();
        object.put("color", configDto.getMenuFontColour());
        object.put("backgroupPictures",pics);
        dataDic.setDataValue(object.toJSONString());
        dataDicRepository.save(dataDic);
    }

    @Override
    public void updatePressMenuConfig(PressMenuConfigDto configDto) {
        DataDic dataDic = dataDicRepository.findByDataCode(Constant.pressCode);
        if(dataDic == null){
            dataDic = new DataDic();
            dataDic.setDataCode(Constant.pressCode);
            dataDic.setCreateTime(new Date());
        }
        List<String> list = configDto.getBackgroupPictures();
        String pics = StringUtils.collectionToDelimitedString(list, ",");
        JSONObject object = new JSONObject();
        object.put("color", configDto.getMenuFontColour());
        object.put("backgroupPictures",pics);
        dataDic.setDataValue(object.toJSONString());
        dataDicRepository.save(dataDic);
    }

    @Override
    public void updateProjectMenuConfig(ProjectMenuConfigDto configDto) {
        DataDic dataDic = dataDicRepository.findByDataCode(Constant.projectCode);
        if(dataDic == null){
            dataDic = new DataDic();
            dataDic.setDataCode(Constant.projectCode);
            dataDic.setCreateTime(new Date());
        }
        List<String> list = configDto.getBackgroupPictures();
        String pics = StringUtils.collectionToDelimitedString(list, ",");
        JSONObject object = new JSONObject();
        object.put("color", configDto.getMenuFontColour());
        object.put("backgroupPictures",pics);
        dataDic.setDataValue(object.toJSONString());
        dataDicRepository.save(dataDic);
    }

    @Override
    public void updateEShopMenuConfig(ShopMenuConfigDto configDto) {
        DataDic dataDic = dataDicRepository.findByDataCode(Constant.eShopCode);
        if(dataDic == null){
            dataDic = new DataDic();
            dataDic.setDataCode(Constant.eShopCode);
            dataDic.setCreateTime(new Date());
        }
        List<String> list = configDto.getBackgroupPictures();
        String pics = StringUtils.collectionToDelimitedString(list, ",");
        JSONObject object = new JSONObject();
        object.put("color", configDto.getMenuFontColour());
        object.put("backgroupPictures",pics);
        dataDic.setDataValue(object.toJSONString());
        dataDicRepository.save(dataDic);
    }


}
