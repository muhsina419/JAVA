import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        double [][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        Scanner in = new Scanner(System.in);
        for(int k =0 ; k<NUMBER_OF_DAYS*NUMBER_OF_HOURS;k++){
            System.out.println("Enter days :");
            int day = in.nextInt();
            System.out.println("Enter hours :");
            int hour = in.nextInt();
            System.out.println("Enter average temparature:");
            double temp =in.nextDouble();
            System.out.println("Enter humidity :");
            double humidity = in.nextDouble();
            data[day-1][hour-1][0] = temp;
            data[day-1][hour-1][1] = humidity;
        }

        for(int i = 0 ;i<NUMBER_OF_DAYS;i++){
            double dailyTempTotal = 0 ,dailyHumidTotal =0;
            for(int j = 0; j<NUMBER_OF_HOURS ;j++){
                dailyHumidTotal+=data[i][j][1];
                dailyTempTotal+=data[i][j][0];
            }

            System.out.println("Day "+i+"'s average temparature is "+dailyTempTotal/NUMBER_OF_HOURS);
            System.out.println("Day "+i+"'s average humidity is :"+dailyHumidTotal/NUMBER_OF_HOURS);
        }
    }
}
