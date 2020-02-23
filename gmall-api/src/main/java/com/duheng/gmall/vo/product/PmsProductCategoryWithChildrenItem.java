package com.duheng.gmall.vo.product;


import com.duheng.gmall.pms.entity.ProductCategory;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 单表的自查询
 */
@Data
public class PmsProductCategoryWithChildrenItem extends ProductCategory  implements Serializable {


    /**
     * 目录的子集
     */
    private List<ProductCategory> children;

}
