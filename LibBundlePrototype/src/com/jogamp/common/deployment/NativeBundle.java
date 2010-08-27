package com.jogamp.common.deployment;

import java.io.File;

/**
 *
 * @author mbien
 */
public abstract class NativeBundle {

    private static final char NAME_DELIMITER = '_';

    private final String arch;
    private final String os;

    private String location;
    private String path;

    public NativeBundle() {
        String name = getClass().getName();
        name = name.substring(name.indexOf(NAME_DELIMITER)+1);

        os = name.substring(0, name.indexOf(NAME_DELIMITER)).toLowerCase();
        arch = name.substring(os.length()+1).toLowerCase();
    }


    public String findLib(String libname) {

        System.out.println("jar location -> "+location);
        System.out.println("relative path -> "+path);

        return "something";

    }

    public String getLocation() {
        if(location == null) {
            location = getClass().getProtectionDomain().getCodeSource().getLocation().toString();
        }
        return location;
    }

    public String getPath() {
        if(path == null) {
            path = getClass().getPackage().getName().replace('.', File.separatorChar);
        }
        return path;
    }

    public String getOs() {
        return os;
    }

    public String getArch() {
        return arch;
    }

}
