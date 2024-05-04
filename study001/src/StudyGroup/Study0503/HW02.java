package StudyGroup.Study0503;
/*
문제2.  각 반에 ‘김’씨 성을 가진 학생이 몇명인지를 구하시오.
A반 학생
[김개똥,이무기,이짱구,김맹구,신형만, 이진철, 김사랑, 신양철]
B반 학생
[이맹지, 김망중, 이배철, 신하람,신해성,민지성,이인아]
C반 학생
[홍익사,이안경,안철구,김민주,신이삼,김아경,민진아,이알구]
 */
public class HW02 {
    public static void main(String[] args) {
        String [] aClass = {"김개똥","이무기","이짱구","김맹구","신형만","이진철","김사랑","신양철"};
        String [] bClass = {"이맹지","김망중","이배철","신하람","신해성","민지성","이인아"};
        String [] cClass = {"홍익사","이안경","안철구","김민주","신이삼","김아경","민진아","이알구"};
        int count = 0;
        for (int i = 0; i < aClass.length; i++) {
            if(aClass[i].contains("김")) {count++;}
        }System.out.println( "A반 학생들 중 '김'씨성은 " + count + " 명입니다");
        count = 0;

        for (int i = 0; i < bClass.length; i++) {
            if(bClass[i].contains("김")) {count++;}
        }System.out.println( "B반 학생들 중 '김'씨성은 " + count + " 명입니다");
        count = 0;

        for (int i = 0; i < cClass.length; i++) {
            if(cClass[i].contains("김")) {count++;}
        }System.out.println( "C반 학생들 중 '김'씨성은 " + count + " 명입니다");
    }
}
