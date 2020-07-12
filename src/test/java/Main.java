import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;

import java.util.Random;

import static java.lang.Thread.sleep;
@Log4j
public class Main {
    public static void main(String[] args) throws InterruptedException {
        BasicConfigurator.configure();
        float sandu = 0;
        float dodon = 0;
        float probForSandu = 0;
        float probForDodon = 0;
        float prob = 0;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            sandu = sandu +random.nextInt(100);
            dodon = dodon +random.nextInt(100);

           // sandu = 1548;
          //  dodon = 733;

            probForSandu =sandu*100/(sandu+dodon);
            probForDodon =dodon*100/(sandu+dodon);

            sleep(1000);
            if(probForSandu>probForDodon)
            {
                prob = probForSandu-probForDodon;
                System.out.println("Maia winning " + prob + " %");
            } else if(probForDodon>probForSandu){
                prob = probForDodon-probForSandu;
                System.out.println("Dodon winnig" + prob + " %");
            }
            else {
                System.out.println("equal");
            }

        }
        System.out.println("Sandu total: " + sandu);
        System.out.println("Dodon total " + dodon);

    }
}


