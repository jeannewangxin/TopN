import java.io.*;

public class test {

    public static void testUrl(String url,int n) throws IOException {
        File fout = new File("urls.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(fout, true));

        for (int i = 0; i < n; i++) {
            bw.write(url);
            bw.newLine();
        }
        bw.close();
    }
    public static void main(String arg[]) throws IOException {
        testUrl("www.baidu.com",1000);//2
        testUrl("www.google.com",980);
        testUrl("www.tencent.com",100);
        testUrl("www.taobao.com",1030);//1
        testUrl("www.yahu.com",987);//3
        testUrl("www.youku.com",887);
        testUrl("www.hen.com",556);
        testUrl("www.jdkcn.com",5);
        testUrl("www.kndowe.com",8);
        testUrl("www.kowe.com",4);
        testUrl("www.koejkncedfcecvfwe.com",99);

        Main m = new Main();
        m.sort();


    }
}
