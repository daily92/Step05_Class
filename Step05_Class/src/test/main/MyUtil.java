package test.main;

//MyUtill 이라는 class 는 두 개의 static member method 를 갖고 있다.
//이 method 를 호출하고 나서 들어오는 값은 없다 (void)
public class MyUtil {
	// static 멤버 필드 정의하기
	public static String version= "v2.0";
	
	public static void sendMessage() {
		System.out.println("메세지를 전송합니다.");
	}
	
	public static void screenCapture() {
		System.out.println("화면을 캡쳐합니다.");
	}

}
