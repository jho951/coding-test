import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 점수 변환 배열
        double[] gradeToScore = {0, 0.7, 1, 1.3, 1.7, 2, 2.3, 2.7, 3, 3.3, 3.7, 4, 4.3};
        Scanner sc = new Scanner(System.in);
        // 학기 수 
        int T = sc.nextInt();
        // 각 학기별로 계산
        for (int t = 0; t < T; t++) {
            // 과목 수
            int N = sc.nextInt();
            // 총 학점
            int totalCredits = 0;
            // 학점 * 성적의 합
            double weightedScoreSum = 0; 
            // 각 과목에 대해
            for (int i = 0; i < N; i++) {
                // 학점
                int C = sc.nextInt();  
                // 성적 
                double G = sc.nextDouble(); 
                // G 값에 맞는 인덱스
                int gradeIndex = getGradeIndex(G);
                // 학점 * 성적의 합산
                weightedScoreSum += C * gradeToScore[gradeIndex];
                totalCredits += C;
            }
            // GPA
            double GPA = weightedScoreSum / totalCredits;
            // 결과
            System.out.printf("%d %.1f\n", totalCredits, GPA);
        }
        sc.close();
    }
    // 성적 G에 맞는 인덱스를 반환하는 함수
    private static int getGradeIndex(double G) {
        if (G == 0) return 0;
        if (G == 0.7) return 1;
        if (G == 1) return 2;
        if (G == 1.3) return 3;
        if (G == 1.7) return 4;
        if (G == 2) return 5;
        if (G == 2.3) return 6;
        if (G == 2.7) return 7;
        if (G == 3) return 8;
        if (G == 3.3) return 9;
        if (G == 3.7) return 10;
        if (G == 4) return 11;
        if (G == 4.3) return 12;
        return -1;
    }
}

