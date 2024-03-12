public class StduyForA {
        public static void main(String[] args) {

            //배열 선언
            int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
            //2번째 배열의 길이는 첫번째 배열의 길이와 같다.
            int [] fr = new int [arr.length];
            //visited가 무엇인지는 잘 모르겠으나 방문과 관련된거 같다. 혹은 횟수?
            int visited = -1;
            //반복문의 시작
            for(int i = 0; i < arr.length; i++){
                int count = 1;

                //2중for문의 시작
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        //arr 배열의 값을 비교하고 있다. => 첫 번째 칸은 그 다음 칸과 비교하고 있으며 같을시
                        //카운트(횟수세는 변수)가 증가한다.
                        count++;
                        fr[j] = visited;
                    }
                }
                if(fr[i] != visited)
                    fr[i] = count;
                //fr배열의 i번째 값이 visted와 지 않으면 fr[i]번째에 count변수 값을 넣어라.
                //위 if문은 첫번째 포문에 속해있다.
            }

            for(int i = 0; i < fr.length; i++){
                if(fr[i] != visited)
                    System.out.println("    " + arr[i] + "    |    " + fr[i]);
            }
        }
    }
