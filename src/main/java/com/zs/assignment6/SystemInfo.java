package com.zs.assignment6;

import java.io.File;
import java.lang.management.ManagementFactory;

public class SystemInfo {
    public static void main(String[] args){
        String userName = userName();
        System.out.println("username: " + userName);
        String homeDirectory = homeDirectory();
        System.out.println("home directory: " + homeDirectory);
        int memory = memory();
        System.out.println("Total memory: " + memory +"GB");
        int core = core();
        System.out.println("core: " + core);
        String diskSize = diskSize();
        System.out.println("disk size: " + diskSize);
        diskSize();
        String osBuild = osBuild();
        System.out.println("os build: " + osBuild);
        String osVersion = osVersion();
        System.out.println("os version: " + osVersion);
    }

    /**
     * returning string data which will be user name of the system.
     */
    public static String userName() {
        String username = System.getProperty("user.name");
        return username;
    }

    /**
     * it will return a string which will be the home directory of a system.
     */
    public static String homeDirectory() {
        String homeDirectory = System.getProperty("user.home");
        return homeDirectory;
    }

    /**
     * it will return a string which will be the os name of a system
     */
    public static String osBuild() {
        String osBuild = System.getProperty("os.name");
        return osBuild;
    }

    /**
     * it will return a string which will be the os version of a system.
     */
    public static String osVersion() {
        String osVersion = System.getProperty("os.version");
        return osVersion;
    }

    /**
     * it will return a int which will the core of a system
     */
    public static int core() {
        int core = Runtime.getRuntime().availableProcessors();
        return core;
    }

    /**
     * it will return the memory of a sytem and it will return the result in long data type.
     */
    public static int memory() {
        com.sun.management.OperatingSystemMXBean mxbean = (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        int memory= (int) (mxbean.getTotalMemorySize()/(1024*1024*1024));
        return memory;
    }

    /**
     *
     * it will return the result as string which will contain the information of disk available, total, used space.
     */
    public static String diskSize() {
        long totalSpace = new File("/").getTotalSpace();
        long usableSpace = new File("/").getUsableSpace();
        long total = totalSpace / 1024 / 1024 / 1024;
        long usable = usableSpace / 1024 / 1024 / 1024;
        long usedSpace = total - usable;
        String diskSize = (("total disk space: " + total + "GB" + " usable space: " + usable + "GB" + " used space: " + usedSpace + "GB"));
        return diskSize;
    }
}
