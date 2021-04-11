package phonebook.ver4;

public class PhoneBook {
	private PhoneInfo[] infos = new PhoneInfo[5];
	
	private int index = 0;
	public void insertData(PhoneInfo info) {
		infos[index] = info;
		index++;
		if(index >= infos.length) {
			// �뷮 �ø���
			sizeUp();
		}
	}
	
	public void sizeUp() {
		PhoneInfo[] newInfos = new PhoneInfo[infos.length*2];
		System.arraycopy(infos, 0, newInfos, 0, infos.length);
		infos = newInfos;
	}
	
	public void searchByName(String name) {
		for(PhoneInfo info : infos) {
			if(info != null && info.getName().equals(name)) {
				info.showInfo();
				System.out.println("------ ��ȸ �Ϸ� ------");
				return;
			}
		}
		
		System.out.println(name + "���� ��ȭ ��ȣ ������ �����ϴ�");
	}
	
	public void showAll() {
		for(PhoneInfo info : infos) {
			if(info == null) {
				continue;
			}
			info.showInfo();
		}
	}
	
}
