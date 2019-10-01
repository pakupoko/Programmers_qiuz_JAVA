package lavel1;
import java.util.*;
/*
Programmers Level1 문제 완주하지 못한 선수
*/

public class Donot_Complete_Athlete {
	public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for(i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
	}
}
