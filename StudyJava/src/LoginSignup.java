
//[ 기존회원 명단 ]
//id : alex || pw : a123
//id : ben || pw : benKing00
//id : tom || pw : 9999to99m

import JavaInterface.A;

import java.util.ArrayList;
import java.util.Scanner;

class LoginSignup {

    ArrayList<String> id = new ArrayList<>();
    ArrayList<String> pw = new ArrayList<>();

    public ArrayList<String> createUserInfoId() {
        id.add("alex");
        id.add("ben");
        id.add("tom");
        return id;
    }

    public ArrayList<String> createUserInfoPw() {
        pw.add("a123");
        pw.add("benKing00");
        pw.add("999to99m");
        return pw;
    }

    public String choose(ArrayList<String> id, ArrayList<String> pw) {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        String userinput = scanner.nextLine();
        if (userinput.equalsIgnoreCase("로그인")) {
            System.out.println("id를 입력하시오");
            String inputId = scanner.nextLine();
            System.out.println("pw를 입력하시오");
            String inputPw = scanner.nextLine();

            for (int i = 0; i < id.size(); i++) {
                if (id.get(i).equals(inputId) && pw.get(i).equals(inputPw)) {
                    result = "어서오세요 " + inputId + "님";
                    break;
                } else {
                    result = "입력하신 정보가 잘못되었습니다. 다시 진행해주세요.";
                }
            }
        } else if (userinput.equalsIgnoreCase("회원가입")) {
            System.out.println("회원가입을 진행하겠습니다.");
            System.out.println("사용하실 id를 입력하시오");
            String inputId = scanner.nextLine();
            System.out.println("사용하실 pw를 입력하시오");
            String inputPw = scanner.nextLine();

            id.add(inputId);
            pw.add(inputPw);
            result = "회원가입이 완료되었습니다.";
        }
//        System.out.println("id를 입력하시오");
//        String inputId = scanner.nextLine();
//        System.out.println("pw를 입력하시오");
//        String inputPw = scanner.nextLine();
//
//        for (int i = 0; i < id.size(); i++) {
//            if (id.get(i).equals(inputId) && pw.get(i).equals(inputPw)) {
//                result = "어서오세요 " + inputId + "님";
//                break;
//            } else {
//                result = "입력하신 정보가 잘못되었습니다. 다시 진행해주세요.";
//            }
//        }
        return result;
    }
}
