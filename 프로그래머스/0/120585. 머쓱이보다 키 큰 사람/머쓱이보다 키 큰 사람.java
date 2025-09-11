class Solution {
    public int solution(int[] array, int height) {
      // array 키가 담긴 배열
      // height 머쓱이 키(기준값)
      // result 나보다 큰 사람
      int result = 0;
      for(int a : array){
          if(a >height){
              result++;
          }
      }
      return result;
    }
}