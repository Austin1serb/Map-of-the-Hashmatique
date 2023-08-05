import java.util.Set;
import java.util.HashMap;
public class HashMapFun {
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("give me that", "girl please give me that");
        trackList.put("Started","this what we really call started from the bottom");
        trackList.put("Yes", "this is the end of the world");
        trackList.put("Yeah","Yeah, Yeah, Yeah, Yeah, Yeah, Yeah");
        
            System.out.println(trackList.get("Started"));
            System.out.println("********************************");
            Set<String> keySet = trackList.keySet();
            for(String key : keySet){
                System.out.println(key+":"+trackList.get(key)+"\n");
            }

    }
}
