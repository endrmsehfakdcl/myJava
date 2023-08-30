package java_exam_05;

public class HotelTest {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.add(5, "호돌이");
		hotel.add(7, "길동이");
		hotel.show();
//		5번 방을 호돌이가 예약했습니다.
//      7번 방을 길동이가 예약했습니다.
	}
}