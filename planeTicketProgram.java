package PlaneTicket;

import java.util.Scanner;

//Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

//Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
//Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
//Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
//Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
//Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.



public class planeTicketProgram {
    public static void main(String[] args) {
        int age,distance,travelType;
        double price;

        

        Scanner inp = new Scanner(System.in);



        System.out.print("Yolculuk Türünüz Nedir ? 'Tek-Yön için '1' Gidiş-Dönüş için '2'' : ");
        travelType = inp.nextInt();
        if(travelType == 1){
            System.out.println("Yolculuk Türünüz Tek-Yön!");

        }else if(travelType == 2){
            System.out.println("Yolculuk Türünüz Gidiş-Dönüş!");

        }else{
            System.out.println("Hatalı Giriş Yaptınız!");
        }
        

        System.out.print("Yolculuk Edilecek Mesafe : ");
        distance = inp.nextInt();
        if(distance<=0){
            System.out.println("Hatalı Giriş Yaptınız!");

        }
        System.out.print("Yaş:");
        age = inp.nextInt();
        if(age<=0){
            System.out.println("Hatalı Giriş Yaptınız!");

        }

        price = distance * 0.10;

        if(age < 12 && age > 0){
            if(travelType == 1){
                System.out.println("Ücret :" + (price - (price*0.5)));

            }
            if(travelType == 2){
                System.out.println("Ücret :" + (price - (price*0.5))*0.2);
            }

        }else if(age>=12 && age<=24){
            if(travelType == 1){
                System.out.println("Ücret :" + (price - (price*0.1)));

            }
            if(travelType == 2){
                System.out.println("Ücret :" + (price - (price*0.1))*0.2);
            }

        }else if(age>=65){
            if(travelType == 1){
                System.out.println("Ücret :" + (price - (price*0.3)));

            }
            if(travelType == 2){
                System.out.println("Ücret :" + (price - (price*0.3))*0.2);
            }

        }else{
            if(travelType == 1){
                System.out.println("Ücret :" + price);

            }
            if(travelType == 2){
                System.out.println("Ücret :" + price*0.2);
            }
        }

        if(travelType !=1 && travelType !=2){
            System.out.println("Hatalı Giriş! Tekrar Deneyiniz!!");

        }
    }

    
}
