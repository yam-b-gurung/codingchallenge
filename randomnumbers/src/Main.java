import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.generateRandomNumbers(10);
    }

    void generateRandomNumbers(Integer n){

        List<Integer> nos = new ArrayList<>();
        while(true){

            int randNum = (int) (Math.random() * n) + 1;

            if(!nos.contains(randNum)){
                nos.add(randNum);
                System.out.println(randNum);
            }

            if(nos.size()==n){
                break;
            }

        }

    }

}
