package example_20220720_API_hash_deepclone.exam06_finalize;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "¹ø °´Ã¼ÀÇ finalize()°¡ ½ÇÇàµÊ");
	}
}
