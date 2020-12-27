package com.company;


import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;

import java.awt.*;
import java.io.IOException;



public class Main {

    public static void main(String[] args) throws AWTException, IOException {
        String ACCESS_TOKEN="8x1aELsYWrAAAAAAAAAAFK3Bh14KpSJ7AkEbfoAaSOxSSTLxToYQRpWQM1Yi66iT";
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        MyThread thread = new MyThread();
        thread.client=client;
        thread.start();

    }
}
