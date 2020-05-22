package com.funprogramming;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // sample
        String appdir = System.getProperty("user.dir") + File.separator;

        // encode image to base64 and save in a file example
        BaseUtil.encodeImage(appdir + "sample.jpg", appdir + "sample_encoded_image.txt");

        // decode base64 string from a text file and save as image on disk sample
        BaseUtil.encodeImage(appdir + "sample_encoded_image.txt",
                appdir + "new_image.jpg");
    }
}
