package matrix_operations;

public class main {

	public static void main(String[] args) {
		Operations m = new Operations(2, 2);
		Operations s = new Operations(2, 2);
		Operations a = new Operations(2, 2);
		m.addNumber(0, 0, 5);
		m.addNumber(1, 1, 5);
		m.addNumber(0, 1, 2);
		m.addNumber(1, 0, 3);
		s.addNumber(0, 0, 5);
		s.addNumber(1, 1, 5);
		s.addNumber(0, 1, 2);
		s.addNumber(1, 0, 3);
		a.add(m.passMatrix(), s.passMatrix());
		a.print();
		a.transpose();
		a.print();
		
	}

}
