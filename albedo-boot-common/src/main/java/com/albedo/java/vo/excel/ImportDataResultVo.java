package com.albedo.java.vo.excel;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author ZhengChao
 * @Title: ImportDataResultVo
 * @ProjectName UALoan
 * @Description: TODO 导入excel数据返回结果vo
 * @date 2018/9/9
 */
@Data
public class ImportDataResultVo implements Serializable {

    /*
    当前数据行数
     */
    private int rowNum;
    /*
    缺失字段名
     */
    private List<String> colName;
}
