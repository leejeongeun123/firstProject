package com.yedam.lambda;

import java.util.Random;

public class Ballgame {
    static int ball = 0;
    static int strike = 0;
    static int num1;                                                            
    static int num2;
    static int num3;
    
    
   public void setNum() {                                                        
        
        boolean stop = false;
        Random random = new Random();
            
        while(!stop) {
            num1 = random.nextInt(10);
            num2 = random.nextInt(10);
            num3 = random.nextInt(10);
            
            if((num2==num1) || (num2==num3)) {                        //     같은 숫자가 있을 경우 재설정
                num2 = random.nextInt(10);
            }else if((num3==num1) || (num3==num2)) {
                num3 = random.nextInt(10);
            }else {
                stop = true;
            }
        }
        System.out.println("******** 숫자 야구게임을 시작합니다! ********"); 
        System.out.println("( 0 ~ 9사이의 숫자 3개를 입력해주세요. )");
        
    }
}
