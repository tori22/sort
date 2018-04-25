package Utils;

import java.util.Random;
import java.util.stream.IntStream;

public class DataPreparationUtil {


    public static Integer[] getPreparationData(int nums,int range) {
        Random random = new Random();
        return IntStream.rangeClosed(0,nums)
                .boxed()
                .map(index->random.nextInt(range))
                .toArray(Integer[]::new);
    }
}
