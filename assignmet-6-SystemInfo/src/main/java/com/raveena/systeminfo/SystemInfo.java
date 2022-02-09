package com.raveena.systeminfo;

import java.io.File;
import java.io.IOException;

public class SystemInfo{
    public static void main(String[] args) throws IOException {
        String userName= userName();
        System.out.println("username: "+userName);
        String homeDirectory= homeDirectory();
        System.out.println("home directory: "+homeDirectory);
        long memory= memory();
        System.out.println("Total memory: "+memory+"GB");
        int core= core();
        System.out.println("core: "+core);
        String diskSize= diskSize();;
        System.out.println("disk size: "+diskSize);
        diskSize();
        String osBuild= osBuild();
        System.out.println("os build: "+osBuild);
        String osVersion= osVersion();
        System.out.println("os version: "+osVersion);
    }
    public static String userName(){
        String username= System.getProperty("user.name");
        return username;
    }

    public static String homeDirectory(){
        String homeDirectory= System.getProperty("user.home");
        return homeDirectory;
    }

    public static String osBuild(){
        String osBuild= System.getProperty("os.name");
        return osBuild;
    }

    public static String osVersion(){
        String osVersion= System.getProperty("os.version");
        return osVersion;
    }

    public static int core(){
        int core = Runtime.getRuntime().availableProcessors();
        return core;
    }

    public static long memory(){
        long totalMemory = Runtime.getRuntime().totalMemory();
        long memoryInGb=totalMemory/1024/1024;
        return memoryInGb;
    }

    public static String diskSize(){
        long totalSpace=new File("/").getTotalSpace();
        long usableSpace=new File("/").getUsableSpace();
        long total=totalSpace/1024/1024/1024;
        long usable=usableSpace/1024/1024/1024;
        long usedSpace=total-usable;
        String diskSize= (("total disk space: "+total +"GB"+  " usable space: "+ usable+"GB"+" used space: "+usedSpace+"GB"));
        return diskSize;
    }

}
