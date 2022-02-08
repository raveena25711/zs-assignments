package com.raveena.systeminfo;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;

public class SystemInfo{
    public static void main(String[] args) throws IOException {
        String userName= userName();
        System.out.println("username: "+userName);
        String homeDirectory= homeDirectory();
        System.out.println("home directory: "+homeDirectory);
        long memory= memory();
        System.out.println("Total memory (bytes): "+memory);
        int core= core();
        System.out.println("core: "+core);
        String diskSize= diskSize();;
        System.out.println("disk size: "+diskSize);
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
        long memory = Runtime.getRuntime().totalMemory();
        return memory;
    }

    public static String diskSize() throws IOException {
        String Space ="";
        NumberFormat nf = NumberFormat.getNumberInstance();
        for (Path root : FileSystems.getDefault().getRootDirectories()) {
                    FileStore store = Files.getFileStore(root);
                    String usableSpace=nf.format(store.getUsableSpace());
                    String totalSpace= nf.format(store.getTotalSpace());
                    Space=("available: "+ usableSpace+" "+ "total: "+totalSpace);
                    return Space;
        }
        return Space;
    }

}
