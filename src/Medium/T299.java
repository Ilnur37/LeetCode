package Medium;

public class T299 {
    public String getHint(String secret, String guess) {
        int[] digit = new int[10];
        int countCow = 0;
        int countBull = 0;
        for(int i = 0; i < secret.length(); i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if(s == g){
                countBull ++;
            }else{
                if(digit[ s -'0'] < 0){
                    countCow ++;
                }
                if(digit[g - '0'] > 0){
                    countCow++;
                }
                digit[s-'0'] ++;
                digit[g-'0'] --;
            }
        }
        return countBull + "A" + countCow + "B";
    }
}
