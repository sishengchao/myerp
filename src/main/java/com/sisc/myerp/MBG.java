package com.sisc.myerp;

import org.mybatis.generator.api.ShellRunner;

public class MBG {
    //该配置文件放在src\\main\\resources\\该路径下即可
    public static void main(String[] args) {
        args = new String[] { "-configfile", "src\\main\\resources\\mybatis\\mybatis-generator.xml", "-overwrite" };
        ShellRunner.main(args);
        
    }
}
