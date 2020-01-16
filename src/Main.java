import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    static HashMap<String,Integer> url = new  HashMap<String,Integer>();

    public static void sort(){
        String fileName = "./urls.txt";

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(
                    s->{
                        if(!url.containsKey(s)) url.put(s,1); //put url into hashmap, and count it!
                        else url.put(s,url.get(s)+1);
                    }
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(url.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() { //sort the url by their number count
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue() - o1.getValue());
            }
        });

        for(int i=0;i<3;i++){
            System.out.println(list.get(i).getKey()+":"+list.get(i).getValue());
        }

    }
}


