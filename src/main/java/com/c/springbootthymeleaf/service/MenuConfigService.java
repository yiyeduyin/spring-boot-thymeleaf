package com.c.springbootthymeleaf.service;

import com.c.springbootthymeleaf.dto.MenuConfig.*;

public interface MenuConfigService {

    CampaignMenuConfigDto getCampaignMenuConfig();

    CollectionMenuConfigDto getCollectionMenuConfig();

    IndexMenuConfigDto getIndexMenuConfig();

    PressMenuConfigDto getPressMenuConfig();

    ProjectMenuConfigDto getProjectMenuConfig();

    ShopMenuConfigDto getEShopMenuConfig();

    void updateCampaignMenuConfig(CampaignMenuConfigDto configDto);

    void updateCollectionMenuConfig(CollectionMenuConfigDto configDto);

    void updateIndexMenuConfig(IndexMenuConfigDto configDto);

    void updatePressMenuConfig(PressMenuConfigDto configDto);

    void updateProjectMenuConfig(ProjectMenuConfigDto configDto);

    void updateEShopMenuConfig(ShopMenuConfigDto configDto);
}
