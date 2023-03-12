import java.util.Scanner;
import java.time.LocalDate;
import java.util.Date;
public class Train_reserving{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    String [] firstStation = new String[t];
    String [] lastStation = new String[t];
    String [] startingDistance = new String[t];
    String [] destitionDistance = new String[t];
    String [] coaches =  new String[5];
    String [] coachesNumber = new String[5];

    


    while(t-- > 0 ){
        int tn = sc.nextInt();
    // }

    String firstStation = sc.next();
    String lastStation = sc.next();
    int startingDistance = 0;
    int destitionDistance = sc.nextInt();

    String [] coaches = {"S1","S2","B1","A1","H1"};
     
    String coachType = "";
    for(int i=0;i<coaches.length;i++){
       if(coaches[i].charAt(0)=='S'){
        coachType += "SL";
       }
       else if(coaches[i].charAt(0)=='B'){
        coachType +="3A";
       }
       else if(coaches[i].charAt(0) ==  'A'){
        coachType += "2A";
       }
       else if(coaches[i].charAt(0)== 'H' ){
        coachType += "1A";
       }
    }

    // while(t-- > 0){
for(int i=0;i<coaches.length;i++){
    coaches[i] +=  " - " + sc.next();
}
    }
    // }
    // LocalDate ld = LocalDate.of( 20 , 1 , 23 );
    int z = 1;
    while(z>0){
        String sCity = sc.next();
        String dCity = sc.next();
        String yearInput = sc.next();
    String monthInput = sc.next();
    String dayInput = sc.next();
    int y = Integer.parseInt( yearInput );
    int m = Integer.parseInt( monthInput );  // 1-12 for January-December.
    int d = Integer.parseInt( dayInput );
    
    LocalDate ld = LocalDate.of( y , m , d );

    int PNR = 100000000 ;

    int fair = 0;



    String ct = sc.next();


    int passenger = sc.nextInt();

    for(int i =0;i<coachType.length();i+=2){
        if(coachType.charAt(i)== 'S'){
            fair += 1*destitionDistance*passenger;
        }
        else if(coachType.charAt(i) == '3'){
            fair +=2*destitionDistance*passenger;
        }
        else if(coachType.charAt(i) == '2'){
            fair += 3*destitionDistance * passenger; 
        }
        else if(coachType.charAt(i) == '1'){
            fair += 4*destitionDistance * passenger;
        }
    }

    if(ct == coachType){
       for(int i=0;i<coaches.length;i++){
        if(Integer.parseInt(coaches[i].substring(5, 7))>24){
            System.out.println("No trains available");
        }
        else{

            
        }
       }
    }

    }

    // }

}
}