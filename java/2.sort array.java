//array can't change size 
//array는 사이즈를 바꿀 수 없다 
//ArrayList can change size dynamically
//ArrayList는 동적으로 사이즈를 바꿀 수 있다.

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[20];
        int position;
        
        //have to sort numbers
        //bubble sort   
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length-i-1; j++){
             	if(numbers[j] > numbers[j+1]){
                    position = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = position; 
                }   
            }
        }
        
        //for(int i = 0; i < numbers.length; i++){
        //    System.out.println(numbers[i]);
        //}
        
        
        //plus each element of array 배열의 각 요소를 모두 더하기
        //if sum of value is similar with other sum of value, make it as single sum of value. 중복되는 부분 해결하기
        
        //NxN matrix
        //we just need upper triangular matrix.
        //NxN의 행렬로 생각하기. 행렬의 반 쪽 삼각형만 구하면 답을 구하게 된다.
        ArrayList<Integer> save = new ArrayList<Integer>();
        for(int i = 1; i < numbers.length; i++){
            for(int j = 0; j < i; j++){
				save.add(numbers[i] + numbers[j]);
            }
        }
        
        //delete ovelapped answer
        //답에서 중복을 없애면 된다.
        
        for(int i : save){
            for(int j = 1 + i; j < save.size(); j++){
                if(save[i] == save[j]){
                    break;
            	}   
                else{
                    answer[count] = save[j];
                    System.out.println(save[j]);
                }
            }
        }
            
        return answer;
    }
}
