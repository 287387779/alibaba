package com.example.classloader;

import sun.misc.Launcher;

import java.net.URL;

public class TestClassLoader {

    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(com.sun.crypto.provider.DESKeyFactory.class.getClassLoader());
        System.out.println(TestClassLoader.class.getClassLoader());

        System.out.println();

        ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader extClassloader = appClassLoader.getParent();
        ClassLoader bootstrapLoader = extClassloader.getParent();
        System.out.println("bootstrapLoader: " + bootstrapLoader);
        System.out.println("extClassloader: " + extClassloader);
        System.out.println("appClassLoader: " + appClassLoader);

        System.out.println();

        System.out.println(sun.misc.Launcher.class.getClassLoader());
        System.out.println(sun.misc.Launcher.getLauncher());

        System.out.println();

        System.out.println(sun.misc.Launcher.getBootstrapClassPath().getURLs());
        System.out.println("bootstrapLoader加载以下文件：");
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL item: urLs){
            System.out.println(item);
        }

        System.out.println();

    }

}
