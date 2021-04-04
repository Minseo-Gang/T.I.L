package phonebook.ver2;

public class PhoneBook {
	PhoneInfo[] infos = new PhoneInfo[5];
	
	int index = 0;
	void insertData(PhoneInfo info) {
		infos[index] = info;
		index++;
		if(index >= infos.length) {
			// 용량 늘리기
			sizeUp();
		}
	}
	
	void sizeUp() {
		PhoneInfo[] newInfos = new PhoneInfo[infos.length*2];
		System.arraycopy(infos, 0, newInfos, 0, infos.length);
		infos = newInfos;
	}
	
	void searchByName(String name) {
		for(PhoneInfo info : infos) {
			if(info != null && info.name.contentEquals(name)) {
				info.showInfo();
				System.out.println("------ 조회 완료 ------");
				return;
			}
		}
		
		System.out.println(name + "님의 전화 번호 정보가 없습니다");
	}
	
	void showAll() {
		for(PhoneInfo info : infos) {
			if(info == null) {
				continue;
			}
			info.showInfo();
		}
	}
	
}
