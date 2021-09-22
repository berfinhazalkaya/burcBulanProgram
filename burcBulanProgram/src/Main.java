import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int day;
        String month;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz : ");
        month = input.nextLine();

        System.out.print("Doğduğunuz günü giriniz : ");
        day = input.nextInt();

        if(month.equals("Ocak")){
            if(day <= 21){
                System.out.println("Oğlak Burcusunuz.");
            }
            else{
                System.out.println("Kova Burcusunuz.");
            }
        }
        if(month.equals("Şubat")){
            if(day <= 19){
                System.out.println("Kova Burcusunuz.");
            }
            else{
                System.out.println("Balık Burcusunuz.");
            }
        }
        if(month.equals("Mart")){
            if(day <= 20){
                System.out.println("Balık Burcusunuz.");
            }
            else{
                System.out.println("Koç Burcusunuz.");
            }
        }
        if(month.equals("Nisan")){
            if(day <= 20){
                System.out.println("Koç Burcusunuz.");
            }
            else{
                System.out.println("Boğa Burcusunuz.");
            }
        }
        if(month.equals("Mayıs")){
            if(day <= 21){
                System.out.println("Boğa Burcusunuz.");
            }
            else{
                System.out.println("İkizler Burcusunuz.");
            }
        }
        if(month.equals("Haziran")){
            if(day <= 22){
                System.out.println("İkizler Burcusunuz.");
            }
            else{
                System.out.println("Yengeç Burcusunuz.");
            }
        }
        if(month.equals("Temmuz")){
            if(day <= 22){
                System.out.println("Yengeç Burcusunuz.");
            }
            else{
                System.out.println("Aslan Burcusunuz.");
            }
        }
        if(month.equals("Ağustos")){
            if(day <= 22){
                System.out.println("Aslan Burcusunuz.");
            }
            else{
                System.out.println("Başak Burcusunuz.");
            }
        }
        if(month.equals("Eylül")){
            if(day <= 22){
                System.out.println("Başak Burcusunuz.");
            }
            else{
                System.out.println("Terazi Burcusunuz.");
            }
        }
        if(month.equals("Ekim")){
            if(day <= 22){
                System.out.println("Terazi Burcusunuz.");
            }
            else{
                System.out.println("AkrepBurcusunuz.");
            }
        }
        if(month.equals("Kasım")){
            if(day <= 21){
                System.out.println("Akrep Burcusunuz.");
            }
            else{
                System.out.println("Yay Burcusunuz.");
            }
        }
        if(month.equals("Aralık")){
            if(day <= 21){
                System.out.println("Yay Burcusunuz.");
            }
            else{
                System.out.println("Oğlak Burcusunuz.");
            }
        }


    }
}
