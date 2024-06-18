import java.util.Scanner;

//public class BaiTapII {
    //Bài tập 1 (chuyển đổi số thành chữ)
    // public static void main(String[] args) {
    //     Scanner inputScanner = new Scanner(System.in);
    //     System.out.println("enter a number to 0 from 9:");
    //     int number = inputScanner.nextInt();
    //     switch (number) {
    //         case 0:
    //             System.out.println("số không");
                
    //         break;
    //         case 1:
                
    //             break;
    //             case 2:
    //             System.out.println("số hai");
                
    //             break;
    //              case 3:
    //              System.out.println("số ba");
                
    //             break;
    //              case 4:
    //              System.out.println("số bốn");
                
    //             break; 
    //             case 5:
    //             System.out.println("số năm");
                
    //             break;
    //             case 6:
    //             System.out.println("số sáu");
                
    //             break;
    //             case 7:
    //             System.out.println("số bảy");
                
    //             break;
    //             case 8:
    //             System.out.println("số tám");
                
    //             break; 
    //             case 9:
    //             System.out.println("số chín");
                
    //             break;
    //         default:
    //         System.out.println("số bạn nhập phải là từ 0 đến 9");
    //     }
    // }
    // //Bài Tập 2(Kiểm tra 1 số có chia hết cho 3 và 5)
    // public static void main(String[] args) {
    //     int number;
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("nhập 1 số ngẫu nhiên mà bạn cho là nó chia hết cho 3 và 5:");
    //     number = scanner.nextInt();
    //     if (number%3==0&&number%5==0) {
    //         System.out.println(number+"chia hết cho cả 3 và 5");
    //     }else if (number %3==0) {
    //         System.out.println(number+"chỉ chia hết cho 3");
    //     }else if (number %5==0) {
    //         System.out.println(number+"chỉ chia hết cho 5");
    //     }else  {
    //         System.out.println(number+"không chia hết cho 3 cũng không chia hết cho 5");
    //     }
    // }
//     //Bài tập 3 (ứng dụng đọc số thành chữ tiếng anh)
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int number = Integer.parseInt(sc.nextLine());
//     String result = ""; 
//     // từ 1 đến 12
//     if ((number<=12&&number>0)) {
//         System.out.println(readNumber(number,true));
//     }
//     //từ 13 đến 19
//     else if (number>=13&&number<=19) {
//         int donvi = number%10;
//         System.out.println(readNumber(donvi,false)+"teen");
//     }
//     //từ 20 dến 99
//     else if (number<100) {
//         int chuc =number/10;
//         if (number%10==0) {
//             System.out.println(readNumber(chuc,false)+"ty");
//         }else{
//         int donvi =number%10;
//             System.out.println(readNumber(chuc,false)+"ty"+readNumber(donvi, true));
//         }
//     }else if (number<1000) {
//         int tram=number/100;
//         int chucdonvi =number%100;
//         String text = readNumber(tram, true)+"hundred";
//         //nếu Number không chia hết cho 100 thì nối thêm phàn chục và đơn vị
//         if (number%100!=0) {
//             text +="and";
//             if ((chucdonvi<=12&&chucdonvi>0)) {
//                 text+=readNumber(chucdonvi,true);
//             }
//         //từ 13 đến 19
//             else if (chucdonvi>=13&&chucdonvi<=19) {
//                 int donvi = chucdonvi%10;
//                 text +=readNumber(donvi,false)+"teen";
//             }
//             else   {
//                 int chuc =chucdonvi/10;
//                 if (chucdonvi%10==0) {
//                 text +=readNumber(chuc,false)+"ty";
//                 }
//                 else{
//                 int donvi =chucdonvi%10;
//             text += readNumber(chuc,false)+"ty"+readNumber(donvi, true);
//                 }
//             }   
//         }
// System.out.println(text);
//     } 
//     else {System.out.println("so qua lon, khong doc duoc");}
// }
// public static String readNumber(int num, boolean check){
// switch (num) {
//     case 1:
//         return "One";
        
//     case 2:
//     return check?"two":"twen";
        
//     case 3:
//     return check?"three":"thir";
        
//     case 4:
//     return "four";
        
//     case 5:
//     return check?"five":"fif";
        
//     case 6:
//     return "six";
        
//     case 7:
//     return "seven";
        
//     case 8:
//     return "eight";
        
//     case 9:
//     return "nine";
        
//     case 10:
        
//     return "ten";

//     case 11:
//     return "elevent";
    
//     case 12:
        
//     return "twelve";
        
   
//     default:
//         return"";
// }
// }
    //Bài tập 4 (tính điểm trung bình các môn học)
    // public static void main(String[] args) {
    //     float toan;
    //     float ly;
    //     float hoa;
    //     float van;
    //     float tienganh;
    //     Scanner scanner=new Scanner(System.in);
    //     System.out.println("nhập điểm Toán của bạn:"); 
    //     toan = scanner.nextFloat();
    //     System.out.println("nhập điểm Lý của bạn:"); 
    //     ly = scanner.nextFloat();
    //     System.out.println("nhập điểm Hóa của bạn:"); 
    //     hoa = scanner.nextFloat();
    //     System.out.println("nhập điểm Văn của bạn:"); 
    //     van = scanner.nextFloat();
    //     System.out.println("nhập điểm Anh của bạn:"); 
    //     tienganh = scanner.nextFloat();
    //     float arithmetic = (toan+ly+hoa+van+tienganh)/5;
    //     if (arithmetic<=0&&arithmetic<5) {
    //         System.out.println("yếu");
    //     }else if (arithmetic<=5&&arithmetic<6.5) {
    //         System.out.println("trung bình");
    //     }else if (arithmetic<=6.5&&arithmetic<8) {
    //         System.out.println("khá");
    //     }else if (arithmetic<=8&&arithmetic<9) {
    //         System.out.println("giỏi");
    //     }else{
    //         System.out.println("xuất sắc");
    //     }
    // }

    //Bài tập 5 (Tính tổng các số chẵn trong khoảng cho trước)
//     public static void main(String[] args) {
//         int a;
//         int b;
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter number a:");
//         a = scanner.nextInt();
//         System.out.println("Enter number b:");
//         b = scanner.nextInt();
//         int sum =0;
//         for(int i=a;i<=b;i++){
//     if(i%2==0){
//         sum+=i;
//     }
// }
// System.out.println("tong cac so chan trong khoan" + a +"den" + b +"la"+sum);
//     }


    // Bài tập 6 (Tìm số nguyên dương nhỏ nhất chia hết cho 5,7 và 11)
//     public static void main(String[] args) {
//         int number =1;
// while (!(number%5==0&&number%7==0&&number%11==0)) {
//    number++;
// }       
// System.out.println(number); 
//     }
// }

//Bài Tập 7 (Hiển thị 20 số nguyên tố đầu tiên)
// public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("Enter number :");
//     int count=0;
//     int i =2;
//     while (count<20) {
//         if (isPrime(i)) {
//             System.out.println(i);
//         count++;
//         }
//         i++;
//     }
// }
// public static boolean isPrime(int number){
// if(number<=1) return false;
// for(int i=2;i<=Math.sqrt(number);i++){
//     if (number%i==0) return false;
// }
// return true;
//     }
//Bài tập 8 (Tạo menu chức năng)
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int choice = 0;

//     while(true){
//        System.out.println("Menu:"); 
//        System.out.println("1. Kiểm tra chẳn lẻ");
//        System.out.println("2. Kiểm tra số nguyên tố");
//        System.out.println("3. Kiểm tra số có chia hết cho 3");
//        System.out.println("4. Thoát");
//        System.out.print("Mời bạn chọn chức năng: ");
//        choice = sc.nextInt();

//        switch (choice) {
//         case 1:
//             System.out.print("Mời bạn nhập số cần kiểm tra: ");
//             int n = sc.nextInt();
//             if(n % 2 == 0){
//                 System.out.println("Đây là số chẵn");
//             } else {
//                 System.out.println("Đây là số lẻ");
//             }
//             break;
//         case 2:
//             System.out.print("Mời bạn nhập số cần kiểm tra: ");
//             int m  = sc.nextInt();
//             if(m < 2){
//                 System.out.println("Đây không phải số nguyên tố");
//             } else {
//                 boolean isPrime = true;
//                 for(int i = 2; i <= Math.sqrt(m); i++){
//                     if(m % i == 0){
//                         isPrime = false;
//                         break;
//                     }
//                 }
//                 if(isPrime){
//                     System.out.println("Đây là số nguyên tố");
//                 } else {
//                     System.out.println("Đây không phải số nguyên tố");
//                 }
//             }
//             break;
//         case 3:
//             System.out.print("Mời bạn nhập số cần kiểm tra: ");
//             int k = sc.nextInt();
//             if(k % 3 == 0){
//                 System.out.println("Đây là số chia hết cho 3");
//             } else {
//                 System.out.println("Không chia hết cho 3");
//             }
//             break;
//         case 4:
//             System.out.println("Thoát");
//             sc.close();
//             System.exit(0);
//             break;
//         default:
//             System.out.println("Nhập sai, mời bạn nhập lại");
//             break;
//        }
//     }
// }
//Bài Tập 9(  tính chu vi và diện tích hình chữ nhật
    // tính chu vi và diện tích hình tròn
    // tính chu vi và diện tích tam giác)
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int choice = 0;
//      while(true){
//        System.out.println("Menu:"); 
//        System.out.println("1.Tính chu vi và diện tích hình chữ nhật");
//        System.out.println("2. Tính chu vi và diện tích hình tròn");
//        System.out.println("3. Tính chu vi và diện tích tam giác");
//        System.out.println("4. Thoát");
//        System.out.print("Mời bạn chọn chức năng: ");
//        choice = sc.nextInt();
//        switch (choice) {
//         case 1:
//             System.out.print("Mời bạn nhập chiều dài: ");
//             float d = sc.nextFloat();
//             System.out.print("Mời bạn nhập chiều rộng: ");
//             float r = sc.nextFloat();
//             float chuvi = (d + r) * 2;
//             float dientich = d * r;
//             System.out.println("Chu vi hình chữ nhật là: " + chuvi);
//             System.out.println("Diện tích hình chữ nhật là: " + dientich);
//             break;
//         case 2:
//             float pi = 3.14f;
//             System.out.print("Mời bạn nhập bán kính: ");
//             int x  = sc.nextInt();
//             float chuvi1 = 2 * pi * x;
//             float dientich1 = pi * x * x;
//             System.out.println("Chu vi hình tròn là: " + chuvi1);
//             System.out.println("Diện tích hình tròn là: " + dientich1);
//             break;
//         case 3:
//             System.out.print("Nhập cạnh a: ");
//             int a = sc.nextInt();
//             System.out.print("Nhập cạnh b: ");
//             int b = sc.nextInt();
//             System.out.print("Nhập cạnh c: ");
//             int c = sc.nextInt();
//             if(a + b > c && a + c > b && b + c > a){
//                 float chuvi2 = a + b + c;
//                 float p = chuvi2 / 2;
//                 float dientich2 = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
//                 System.out.println("Chu vi tam giác là: " + chuvi2);
//                 System.out.println("Diện tích tam giác là: " + dientich2);
//             } else {
//                 System.out.println("Đây không phải tam giác");
//             }
//             break;
//         case 4:
//             System.out.println("Thoát");
//             sc.close();
//             System.exit(0);
//             break;
//         default:
//             System.out.println("Nhập sai, mời bạn nhập lại");
//             break;
//        }
//     }
// }
//Bài Tập 10(Xác thực dữ liệu vòng lặp
    //tính chu vi và diện tích hình tam giác
    //kiểm tra điều kiện có phải tam giác không)
// public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     while (true) {
//          System.out.print("Nhập cạnh a: ");
//             int a = sc.nextInt();
//             System.out.print("Nhập cạnh b: ");
//             int b = sc.nextInt();
//             System.out.print("Nhập cạnh c: ");
//             int c = sc.nextInt();
//             if(a + b > c && a + c > b && b + c > a){
//                 float chuvi2 = a + b + c;
//                 float p = chuvi2 / 2;
//                 float dientich2 = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
//                 System.out.println("Chu vi tam giác là: " + chuvi2);
//                 System.out.println("Diện tích tam giác là: " + dientich2);
//             } else {
//                 System.out.println("Đây không phải tam giác");
//             }
//     }
// }

//}