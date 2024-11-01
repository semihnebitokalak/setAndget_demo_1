public class Main{
    public static void main(String[] args){
        // Araba nesnesi oluştur ve constructor ile değerleri ayarla
        Car car_1 = new Car("Toyota" , "Corolla" , 2023);
        // Bilgileri ekrana yazdır
        System.out.println(car_1.getMarka());
        System.out.println(car_1.getModel());
        System.out.println(car_1.getYil());

        // Yılı güncelle ve yeni değeri ekrana yazdır
        car_1.setYil(2024);
        System.out.println(car_1.getYil());


    }
}