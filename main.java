/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            String inp = new String(Files.readAllBytes(Paths.get("YOUR_FILE_PATH")));
            
            int[] nums = Arrays.stream(inp.trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                                  
            System.out.println("Считали файл! Искомые значения:");
            System.out.println("Минимальное:");
            System.out.println(_min(nums))
            System.out.println("Максимальное:");
            System.out.println( _max(nums))
            System.out.println("Сумма:");
            System.out.println(_sum(nums))
            System.out.println("Произведение: ");
            System.out.println(_mult(nums))

        } catch (IOException e) {
            System.out.println("Ошибка при поптыке обработать числа из файла, попробуйте снова!");
        }
    }
    
    
    public static long _sum(int[] nums) {
        return Arrays.stream(nums).sum();
    }
    
    
    public static int _max(int[] nums) {
        return Arrays.stream(nums).max().orElseThrow();
    }


    public static int _min(int[] nums) {
        return Arrays.stream(nums).min().orElseThrow();
    }

    
    public static long _mult(int[] nums) {
        return Arrays.stream(nums).asLongStream().reduce(1, (a, b) -> a * b);
    }
}
