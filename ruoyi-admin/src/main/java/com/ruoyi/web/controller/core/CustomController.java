package com.ruoyi.web.controller.core;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.core.entity.vo.CustomListVO;
import com.ruoyi.core.service.CustomService;
import com.ruoyi.web.controller.common.CommonController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangYu
 */
@RestController
@RequestMapping("/core/custom")
public class CustomController extends BaseController {
    private static final Logger log = LoggerFactory.getLogger(CommonController.class);

    private final CustomService customService;
    public CustomController(CustomService customService){
        this.customService = customService;
    }
    @PreAuthorize("@ss.hasPermi('core:custom:list')")
    @GetMapping("/list")
    public TableDataInfo getCustomList(CustomListVO customListVO) {
        startPage();
        List<CustomListVO> result = customService.getCustomList(customListVO);
        return getDataTable(result);
    }
}
