package demo01;


//�γ���course(ѧ�ڣ��γ̱��룬�γ����ƣ��ον�ʦteacher���ɼ��ȼ�������)�����ļ�
public class course extends student{

	private int semester;
	private int Ccode;
	private int Cname;
	private String CTeacher;
	private int score;
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getCcode() {
		return Ccode;
	}
	public void setCcode(int ccode) {
		Ccode = ccode;
	}
	public int getCname() {
		return Cname;
	}
	public void setCname(int cname) {
		Cname = cname;
	}
	public String getCTeacher() {
		return CTeacher;
	}
	public void setCTeacher(String cTeacher) {
		CTeacher = cTeacher;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public course(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	

}