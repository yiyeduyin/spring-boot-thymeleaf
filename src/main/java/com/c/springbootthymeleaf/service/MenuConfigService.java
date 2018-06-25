package com.c.springbootthymeleaf.service;

import com.c.springbootthymeleaf.dto.MenuConfig.*;

public interface MenuConfigService {

    CampaignMenuConfigDto getCampaignMenuConfig();

    CollectionMenuConfigDto getCollectionMenuConfig();

    IndexMenuConfigDto getIndexMenuConfig();

    PressMenuConfigDto getPressMenuConfig();

    ProjectMenuConfigDto getProjectMenuConfig();

    EShopMenuConfigDto getEShopMenuConfig();

    ShopMenuConfigDto getShopMenuConfig();

    MoreinfoConfigDto getMoreinfoMenuConfig();

    void updateCampaignMenuConfig(CampaignMenuConfigDto configDto);

    void updateCollectionMenuConfig(CollectionMenuConfigDto configDto);

    void updateIndexMenuConfig(IndexMenuConfigDto configDto);

    void updatePressMenuConfig(PressMenuConfigDto configDto);

    void updateProjectMenuConfig(ProjectMenuConfigDto configDto);

    void updateEShopMenuConfig(EShopMenuConfigDto configDto);

    void updateShopMenuConfig(ShopMenuConfigDto configDto);

    void updateMoreinfoConfig(MoreinfoConfigDto configDto);
}
