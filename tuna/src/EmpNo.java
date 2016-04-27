
class EmpNo {
	public static void main(String args[]) {
		EmpNo b1 = new EmpNo();
		b1.input(101, "ABC");
		EmpNo b2 = new EmpNo();
		b2.input(102, "XYZ", 2000);
		EmpNo b3 = new EmpNo();
		b3.input("Ashrith");
		EmpNo b4 = new EmpNo();
		b4.input("Reddy", 3000);
		b1.show();
		b3.show();
		b4.show();
	}

	private int no;
	private String name;
	private double sal;
	private double comm;

	void input(int x, String y, double z) {
		no = x;
		name = y;
		sal = z;
		setComm(sal * 0.1);
	}

	void input(int x, String y) {
		no = x;
		name = y;
		sal = 0;
		setComm(0);
	}

	void input(String x) {
		no = 0;
		name = x;
		sal = 0;
		setComm(0);
	}

	void input(String x, double y) {
		no = 0;
		name = x;
		sal = y;
		setComm(sal*0.1);
	}

	void show() {
		System.out.println("Empno = " + no);
		System.out.println("Ename = " + name);
		System.out.println("Esal = " + sal);
		System.out.println("Ecomm = " + no);
		System.out.println("-------------");
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}
}
		
