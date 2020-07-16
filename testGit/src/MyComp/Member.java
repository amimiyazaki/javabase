package MyComp;

public class Member {
	private int id;			// 会員番号
	private String name;	// 氏名

	// コンストラクタ
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "会員番号:"+id+"、氏名:"+name;
	}

	// setter/getter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
