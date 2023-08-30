package java_exam_05;

public class Hotel {
	class Room {
		String[] list = new String[10];
	}

	Room room = new Room();
	// field

	// construct
	Hotel() {
	}

	// method
	public void add(int roomNum, String name) {
		room.list[roomNum - 1] = name;
	}

	public void show() {
		for (int i = 0; i < room.list.length; i++) {
			if (room.list[i] != null) {
				System.out.println(i + 1 + "번 방을 " + room.list[i] + "가 예약했습니다.");
			}
		}
	}
}
//System.out.println(roomNum + "번 방을 " + name + "가 예약했습니다. ");