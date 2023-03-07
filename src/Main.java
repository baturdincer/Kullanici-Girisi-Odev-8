import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, currentUsername="patika", currentPassword="java101";
        Scanner scanner= new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        username= scanner.next();
        System.out.print("Şifrenizi girin: ");
        password= scanner.next();
        if (username.equals(currentUsername)&&password.equals(currentPassword)){
            System.out.println("giriş başarılı");
        }
        else{
            System.out.println("Hatalı bilgi girdiniz");
            System.out.println("1 - Şifremi değiştirmek istiyorum\n2 - Şifremi değiştirmek istemiyorum");
            int karar = scanner.nextInt();
            if (karar==1){
                System.out.print("Yeni şifrenizi girin: ");
                String newPassword= scanner.next();
                if (newPassword.equals(currentPassword)){
                    System.out.println("Yeni girdiğiniz şifre eskisiyle aynı olamaz");
                }
                else {
                    currentPassword= newPassword;
                    System.out.println("Şifre başarıyla değiştirildi");
                }
            }
            else if (karar==2){
                System.out.println("program kapatılıyor...");
            }

        }
    }
}