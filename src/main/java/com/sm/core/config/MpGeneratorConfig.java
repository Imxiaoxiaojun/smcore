package com.sm.core.config;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * @ClassName MpGeneratorConfig
 * @Description Mybatis-plus 代码自动生成配置
 * @Author 'zhuyajun@maoyan.com
 * @Date 2018/4/12 上午11:20
 * @Version 1.0
 **/
public class MpGeneratorConfig extends AbstractGeneratorConfig {
    private String[] tableName;
    private String programName;

    private String outDir;

    public void setTableName(String... tableName) {
        this.tableName = tableName;
    }

    public void setProgramName(String programName){
        this.programName = programName;
        this.outDir = System.getProperty("user.dir") + "/" + programName + "/src/main/java/";
    }

    public MpGeneratorConfig(){
        super.controllerSwitch = true;
        super.daoSwitch = true;
        super.serviceSwitch = true;
        super.entitySwitch = true;
    }
    public MpGeneratorConfig(Boolean controllerSwitch, Boolean daoSwitch, Boolean serviceSwitch, Boolean entitySwitch) {
        super.controllerSwitch = controllerSwitch;
        super.daoSwitch = daoSwitch;
        super.serviceSwitch = serviceSwitch;
        super.entitySwitch = entitySwitch;
    }

    public void setOutDir(String outDir) {
        this.outDir = outDir;
    }

    protected void dataSourceConfig() {
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        dataSourceConfig.setUsername("manage");
        dataSourceConfig.setPassword("spdb1234");
        dataSourceConfig.setUrl("jdbc:mysql://www.strawman.xin:3306/myblog?characterEncoding=utf8");
    }

    protected void globalConfig() {
        globalConfig.setOutputDir(outDir);
        globalConfig.setFileOverride(true);
        globalConfig.setEnableCache(false);
        globalConfig.setBaseResultMap(true);
        globalConfig.setBaseColumnList(true);
        globalConfig.setOpen(false);
        globalConfig.setAuthor("'zhuyajun@maoyan.com");
    }

    protected void strategyConfig() {
//        strategyConfig.setTablePrefix(new String[]{"sys_"});
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        if (null != tableName && tableName.length > 0){
            strategyConfig.setInclude(tableName);
        }
    }

    protected void packageConfig() {
        packageConfig.setParent(null);
        packageConfig.setController("com.sm.blog.controller");
        packageConfig.setEntity("com.sm.blog.model");
        packageConfig.setMapper("com.sm.blog.dao");
        packageConfig.setXml("com.sm.blog.dao.mapping");
        packageConfig.setService("com.sm.blog.service");
        packageConfig.setServiceImpl("com.sm.blog.service.impl");
    }

    @Override
    protected void config() {
        globalConfig();
        dataSourceConfig();
        strategyConfig();
        packageConfig();
//        contextConfig();
    }
}
