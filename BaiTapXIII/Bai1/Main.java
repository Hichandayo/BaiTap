package BaiTapXIII.Bai1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5,2,3,1,5,2,1};
    Map<Integer, Integer> countMap = new HashMap<>();
    for(int num : elements) {
        if (countMap.containsKey(num)){// Nếu phần tử đã có trong HashMap, tăng số lần xuất hiện lên 1
            countMap.put(num, countMap.get(num)+1);
        }else {// Nếu phần tử chưa có trong HashMap, thêm mới với số lần xuất hiện là 1
            countMap.put(num, 1);
        }
    }
        System.out.println("Số lần xuất hiện của từng phần tử:");
    for (int key : countMap.keySet() ){
        System.out.println(key + " xuất hiện " + countMap.get(key) +" lần");
    }
    }
}
