package BaiTapXIII.Bai3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,Integer>hashMap = new HashMap<>();
        hashMap.put(1,2);
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());
    }
}
