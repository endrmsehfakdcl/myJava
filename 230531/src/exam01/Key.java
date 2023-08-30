package exam01;

public class Key {
	public int number;

	Key(int number) {
		this.number = number;
	}

	@Override // 값이 동리
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;

	}

	@Override // 해시코드 재정의
	public int hashCode() {
		return number;
	}

	@Override
	public String toString() {
		return "Key [number=" + number + "]";
	}

}
