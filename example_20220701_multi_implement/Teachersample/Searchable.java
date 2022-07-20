package example_20220701_multi_implement.Teachersample;


public interface Searchable {
	// 가까운 번호 채널 변경 시스템
	default void search(String url) {

	int ch = Integer.parseInt(url);
		if(ch<15) {
			ch=10;
		} else if(ch<22) {
			ch=20;
		} else if(ch<50) {
			ch=25;
		} else if(ch<200) {
			ch=120;
		} else {System.out.println("채널을 찾을 수 없습니다.");}

	url = Integer.toString(ch);	
	}



}

