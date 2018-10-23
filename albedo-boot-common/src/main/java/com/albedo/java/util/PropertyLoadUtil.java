package com.albedo.java.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * 资源文件读取，可以扫描jar
 * @author lijie
 */
public class PropertyLoadUtil {

    protected static Logger logger = LoggerFactory.getLogger(PropertyLoadUtil.class);
    private static PathMatchingResourcePatternResolver resourceLoader = new PathMatchingResourcePatternResolver();


    /**
     * 读取Property
     * @param pathName
     * @return
     * @throws IOException
     */
    public static Properties loadPropertiesFile(String pathName){
        return loadPropertiesFile(pathName, "utf-8");
    }

    /**
     * 读取Property
     * @param pathName
     * @return
     * @throws IOException
     */
    public static Properties loadPropertiesFile(String pathName, String charsetName){
        Properties prop = new Properties();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        try {
            inputStream = PropertyLoadUtil.loadInputStreamFile(pathName);
            if(inputStream!=null) {
                prop.load(new InputStreamReader(inputStream, charsetName));
            }
        } catch (IOException e) {
            logger.error("error convert: {}", e);
        } finally {
            if (inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    logger.error("error close: {}",e);
                }
            }
            if (inputStreamReader!=null){
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    logger.error("error close: {}",e);
                }
            }
        }
        return prop;

    }

    /**
     * 读取文件流
     * @param pathName
     * @return
     * @throws IOException
     */
    public static InputStream loadInputStreamFile(String pathName) throws IOException {
        String classPath = PublicUtil.toAppendStr("classpath*:/", pathName);
        Resource[] resources = resourceLoader.getResources(classPath);
        if(PublicUtil.isNotEmpty(resources)){
            return resources[0].getInputStream();
        }
        return null;
    }

}
