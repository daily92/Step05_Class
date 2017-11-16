package test.mypac;

public class YourUtil {
	// static 멤버 필드 정의하기  (Car.java 와 비교!)
	public static String version= "v1.0";	//YourUtil.version
	
	// static 멤버 메소드 정의하기
	public static void fileDown() {
		System.out.println("파일을 다운로드 해요~~!");		//YourUtil.fileDown
	}
	
	public static void fileUp() {
		System.out.println("파일을 업로드 해요!");	//YourUtil.fileUp
	}
}
// static 붙으면 클래스명에 .
// static 이 안 붙으면 참조값에 .