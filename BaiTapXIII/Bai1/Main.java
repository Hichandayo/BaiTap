package BaiTapXIII.Bai1;

import java.util.HashMap;
import java.util.Map;

public class Main {
         //tạo 1 array để chưa dữ liệu
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5,2,3,1,5,2,1};
        //sử dụng hashMap để lưu trữ tần số xuất hiện của phần tử
    Map<Integer, Integer> countMap = new HashMap<>();
    //sử dụng vòng lặp for để truy tìm tần suất xuất hiện của phần tử trong mảng
    for(int num : elements) {
        if (countMap.containsKey(num)){// Nếu phần tử đã có trong HashMap, tăng số lần xuất hiện lên 1
            countMap.put(num, countMap.get(num)+1);
        }else {// Nếu phần tử chưa có trong HashMap, thêm mới với số lần xuất hiện là 1
            countMap.put(num, 1);
        }
    }
    //in ra
        System.out.println("Số lần xuất hiện của từng phần tử:");
    for (int key : countMap.keySet() ){
        System.out.println(key + " xuất hiện " + countMap.get(key) +" lần");
    }
    }
}
