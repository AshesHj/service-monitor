package com.mapabc.monitor.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;


/**
 * @author yinguijin
 * @version 1.0
 * @Description: [执行Linux命令]
 * Created on 2019/4/9 14:37
 */
public class RuntimeUtils {

	/**
    * @Title: exec
    * @Description: 简化执行命令行
    * @param  command 命令行
    * @param  envp 环境变量
    * @param  dir  路径
    * @return Process    返回类型
    * @throws IOException
     */  
    public static Process exec(String command, String envp, String dir)  
            throws IOException {  
        String regex = "\\s+";  
        String args[] = null;  
        String envps[] = null;  
        if (!StringUtils.isEmpty(command)) {  
            args = command.split(regex);  
        }  
  
        if (!StringUtils.isEmpty(envp)) {  
            envps = envp.split(regex);  
        }  
  
        return Runtime.getRuntime().exec(args, envps, new File(dir));  
  
    }  
    
}
