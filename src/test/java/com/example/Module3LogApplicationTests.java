package com.example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@Slf4j
@SpringBootTest
class Module3LogApplicationTests {

    @Test
    void contextLoads() {
        int[][] source = new int[][]{{1 ,20, 30, 40}, {2 ,22, 30, 40}, {4 ,20, 33, 40},{5 ,23, 30, 40}};
        int[][] target = sortArrayByTotalScore(source);
        System.out.println(Arrays.deepToString(target));
    }

    public int[][] sortArrayByTotalScore(int[][] arr) {
        int[][] result = new int[arr.length][5];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 1; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            result[i][0] = arr[i][0];
            result[i][1] = arr[i][1];
            result[i][2] = arr[i][2];
            result[i][3] = arr[i][3];
            result[i][4] = sum;
        }
        Arrays.sort(result, (a, b) -> b[4] - a[4]);
        return result;
    }

}
