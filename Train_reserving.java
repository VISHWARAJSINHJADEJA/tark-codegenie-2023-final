import java.util.Scanner;
// import java.time.LocalDate;
// import java.util.Date;
public class Train_reserving{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    String [] firstStation = new String[t];
    String [] lastStation = new String[t];
    Integer [] startingDistance = new Integer[t];
    Integer [] destitionDistance = new Integer[t];
    String [] coaches =  new String[5];
    String [] coachesNumber = new String[5];
    String [] number = new String[t];
    String [] coachType = new String[100];


    while(t-- > 0 ){
        int tn = sc.nextInt();
    // }

    // String firstStation = sc.next();
    // String lastStation = sc.next();
    // int startingDistance = 0;
    // int destitionDistance = sc.nextInt();

    // String [] coaches = {"S1","S2","B1","A1","H1"};
     String trainList = sc.nextLine();
     String coachConfig = sc.nextLine();

    String [] s = trainList.split(" ");
    String [] s1 = coachConfig.split(" ");

    number[t] = s[0];
    firstStation[t] = s[1];
    lastStation[t]= s[2];

    String [] s2 = firstStation[t].split("-");
    String [] s3 = lastStation[t].split("-");

    startingDistance[t] = Integer.parseInt(s2[1]);
    destitionDistance[t] = Integer.parseInt(s3[1]);

    for(int i=0;i<s1.length-1;i++){
        coaches[i] = s1[i+1];
    }
    Integer [] seats = new Integer[5];
    String [] s5 = new String[s1.length];


// for(int i=1;i<s1.length;i++){
//  s5[i] = s1[i].split("-");
// }
// for(int i=1;i<s1.length-1;i+=2){
//    seats = 
// }

    for(int i=0;i<coaches.length;i++){
       if(coaches[i].charAt(0)=='S'){
        coachType[i] = "SL";
       }
       else if(coaches[i].charAt(0)=='B'){
        coachType[i] ="3A";
       }
       else if(coaches[i].charAt(0) ==  'A'){
        coachType[i] = "2A";
       }
       else if(coaches[i].charAt(0)== 'H' ){
        coachType[i] = "1A";
       }
    }

    // while(t-- > 0){
// for(int i=0;i<coaches.length;i++){
//     coaches[i] +=  " - " + sc.next();
// }
    }
    // }
    // LocalDate ld = LocalDate.of( 20 , 1 , 23 );
    int z = 1;
    int fair = 0;
    int PNR = 100000001;

    String [] sCity = new String[100];
    String [] dCity = new String[100];
    String [] date = new String[100];
    Integer [] passenger = new Integer[100];
    String [] ct = new String[100];


    while(z++ >0){
    //     String sCity = sc.next();
    //     String dCity = sc.next();
    //     String yearInput = sc.next();
    // String monthInput = sc.next();
    // String dayInput = sc.next();
    // int y = Integer.parseInt( yearInput );
    // int m = Integer.parseInt( monthInput );  // 1-12 for January-December.
    // int d = Integer.parseInt( dayInput );
    
    // LocalDate ld = LocalDate.of( y , m , d );

    String userInput = sc.nextLine();
    String [] s1 =userInput.split(" ");
    sCity[0] = s1[0];
    dCity[0] = s1[1];
    date[0] = s1[2];
    ct[0] = s1[3];
    passenger[0] = Integer.parseInt(s1[4]);

    // int passenger = sc.nextInt();

    for(int i =0;i<coachType.length;i+=2){
        if(ct[i]== "SL"){
            fair += 1*destitionDistance[i]*passenger[i];
        }
        else if(ct[i] == "3A"){
            fair +=2*destitionDistance[i]*passenger[i];
        }
        else if(ct[i] == "2A"){
            fair += 3*destitionDistance[i] * passenger[i]; 
        }
        else if(ct[i] == "1A"){
            fair += 4*destitionDistance[i] * passenger[i];
        }
    }


    for(int j=0;j<coachType.length;j++){
for(int k =0;k<ct.length;k++){


    
    if(ct[k]== coachType[j]){
       for(int i=0;i<coaches.length;i++){
        if(Integer.parseInt(coaches[i].substring(3, 5))<passenger[i]){
            System.out.println("No trains available");
        }
        else{
            System.out.println(PNR + " " + fair);
            PNR++;

        }
    }
       }
    }
    }
    }

    // }

}
}