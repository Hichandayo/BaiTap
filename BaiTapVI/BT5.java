//package BaiTap.BaiTapVI;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeParseException;
//import java.util.Scanner;
//import java.util.regex.Pattern;
//
//public class BT5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String productId, productName,catalogName, description, productStatusDisplay=null;
//        float price;
//        LocalDate createdDate;
//        int productStatus;
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        // Validate Product ID
//        while(true) {
//            System.out.print("nhap ID san pham(dang: C001, S123, A333): ");
//            productId = sc.nextLine().trim();
//            if (Pattern.matches("^[CSA][0-9]{3}$", productId)) break;
//            else System.err.println("ID san pham khong hop le. vui long nhap lai. ");
//        }
//        // Validate Product Name
//        while(true){
//            System.out.println("nhap ten san pham (tu 10 den 50 ky tu):");
//            productName = sc.nextLine().trim();
//            if (Pattern.matches("^[\\p{L}\\d\\s'&-]{10,50}$", productName))break;
//            else System.err.println("Ten san pham khong hop le. vui long nhap lai.");
//
//        }
//        // Validate Product Price
//        while(true){
//            System.out.println("nhap gia san pham:");
//            price= Float.parseFloat(sc.nextLine().trim());
//            if (price>0)break;
//            else System.err.println("gia san pham co gia tri lon hon 0.");
//        }
//        System.out.println("nhap mo ta san pham:");
//        description= sc.nextLine().trim();
//        //Validate created date:
//        while(true){
//            System.out.println("nhap ngay nhap san pham:");
//            String createdDateInput = sc.nextLine().trim();
//            try{
//                createdDate= LocalDate.parse(createdDateInput, formatter);
//                break;
//            }catch(DateTimeParseException e){
//                System.err.println("Ngay nhap san pham co dinh dang khong hop le");
//            }
//        }
//        System.out.println("nhap ten catalog cua san pham:");
//        catalogName = sc.nextLine().trim();
//        //Validate productStatus:
//        while(true){
//            System.out.println("nhap trang thai san pham (0: dang ban, 1: het hang, 2: khong ban):");
//            String productStatusInput = sc.nextLine();
//            if (Pattern.matches("[012]",productStatusInput)){
//                productStatus = Integer.parseInt(productStatusInput);
//                break;
//            }else System.err.println("trang thai san pham, chi nhan 1 trong cac trang thai nhu sau (0: dang ban, 1: het hang, 2: khong ban)");
//        }
//        //trang thai san pham chi nhan 1 trong 3 gia tri Dang Ban, Het Hang, Khong Ban
//        switch(productStatus){
//            case 0 -> productStatusDisplay = "Dang Ban";
//            case 1 -> productStatusDisplay = "Het Hang";
//            case 2 -> productStatusDisplay = "Khong Ban";
//            default -> productStatusDisplay = "Invalid choice";
//        }
//        System.out.println(createdDate);
//        System.out.printf("%s %s %s %.2f %s %d %s%n", productId, productName, description, price, catalogName, productStatus, productStatusDisplay);
//
//    }
//}
