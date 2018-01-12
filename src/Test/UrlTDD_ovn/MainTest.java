package UrlTDD_ovn;

import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import static org.junit.Assert.*;

public class MainTest {


    @Test
    public void ConnectToYahoo() throws IOException {

        URL yahoo = new URL("http://www.yahoo.com/");

        //URLConnection yc = yahoo.openConnection();


    }

    @Test
    public void showAllJavaJobsInUS1() {
    }
}