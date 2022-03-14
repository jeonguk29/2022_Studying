public class conditional_repetitive2 {
    public static void main(String[] args) {
        int i = 0, sum = 0; // 이렇게 하면 한번에 2개 변수 초기화 가능 

        while(i <= 1000)
        {
            sum += i++;
        }
        System.out.println("1부터 1000까지의 합은" + sum + "입니다.");
    }
}
