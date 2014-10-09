import java.awt.*;
import javax.swing.*;

public class CalcFrame extends JFrame{

	public GridBagConstraints c = new GridBagConstraints();
	public JPanel panel = new JPanel();
	
	public JTextField visor = new JTextField();

	public JLabel base = new JLabel("Base: 10");
	public JButton bin = new JButton("Bin");
	public JButton hex = new JButton("Hexa");
	public JButton oct = new JButton("Oct");
	public JButton radians = new JButton("Radiano");
	public JButton sec = new JButton("Sec x");
	public JButton cossec = new JButton("Cossec x");
	public JButton cotg = new JButton("Cotg x");
	public JButton degrees = new JButton("Degrees");
	public JButton sin = new JButton("Sen x");
	public JButton cos = new JButton("Cos x");
	public JButton tg = new JButton("Tg x");
	public JButton module = new JButton("|x|");
	public JButton fat = new JButton("x!");
	public JButton logdez = new JButton("Log(10) x");
	public JButton log = new JButton("Log(n) x");
	public JButton pow2 = new JButton("x²");
	public JButton pow3 = new JButton("x³");
	public JButton pown = new JButton("x^n");
	public JButton back = new JButton("←");
	public JButton sqrt2 = new JButton("(2)√x");
	public JButton sqrt3 = new JButton("(3)√x");
	public JButton sqrtn = new JButton("(n)√x");
	public JButton clear = new JButton("C");
	public JButton zero = new JButton("0");
	public JButton one = new JButton("1");
	public JButton two = new JButton("2");
	public JButton tree = new JButton("3");
	public JButton four = new JButton("4");
	public JButton five = new JButton("5");
	public JButton six = new JButton("6");
	public JButton seven = new JButton("7");
	public JButton eight = new JButton("8");
	public JButton nine = new JButton("9");
	public JButton dot = new JButton(".");
	public JButton equal = new JButton("=");
	public JButton soma = new JButton("+");
	public JButton sub = new JButton("-");
	public JButton mult = new JButton("*");
	public JButton div = new JButton("/");

	/**
	*
	* CalcFrame Constructor 
	*/
	public CalcFrame(){
		this.initComponents();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	public void initComponents(){
		this.c.ipady = 20;
		this.c.weightx = 0.5;
		this.c.insets = new Insets(5, 5, 5, 5);

		this.getContentPane().add(this.panel);
		this.addLayoutToPane(this.panel, this.c);

		this.initVisor();
		this.initKeyboard();
	}

	public void initVisor(){
		this.visor.setHorizontalAlignment(JTextField.RIGHT);
		this.c.gridwidth = 10;
		this.c.fill = GridBagConstraints.HORIZONTAL;
		this.c.weightx = 0.5;
		this.c.gridx = 0;
		this.c.gridy = 0;
		this.panel.add(this.visor, this.c);
	}

	public void initKeyboard(){
		this.c.gridwidth = 1;
		this.c.fill = GridBagConstraints.HORIZONTAL;

		this.initBase();
		this.initTrigonometry();
		this.initAlgebra();
		this.initNumeric();
		this.initArit();
	}

	public void initBase(){
		this.c.gridx = 0;
		this.c.gridy = 1;
		this.panel.add(this.base, this.c);

		this.c.gridx = 0;
		this.c.gridy = 2;
		this.panel.add(this.bin, this.c);

		this.c.gridx = 0;
		this.c.gridy = 3;
		this.panel.add(this.hex, this.c);

		this.c.gridx = 0;
		this.c.gridy = 4;
		this.panel.add(this.oct, this.c);
	}

	public void initTrigonometry(){
		this.c.fill = GridBagConstraints.HORIZONTAL;

		this.c.gridx = 1;
		this.c.gridy = 1;
		this.panel.add(this.radians, this.c);

		this.c.gridx = 1;
		this.c.gridy = 2;
		this.panel.add(this.sec, this.c);

		this.c.gridx = 1;
		this.c.gridy = 3;
		this.panel.add(this.cossec, this.c);

		this.c.gridx = 1;
		this.c.gridy = 4;
		this.panel.add(this.cotg, this.c);

		this.c.gridx = 2;
		this.c.gridy = 1;
		this.panel.add(this.degrees, this.c);

		this.c.gridx = 2;
		this.c.gridy = 2;
		this.panel.add(this.sin, this.c);

		this.c.gridx = 2;
		this.c.gridy = 3;
		this.panel.add(this.cos, this.c);

		this.c.gridx = 2;
		this.c.gridy = 4;
		this.panel.add(this.tg, this.c);
	}

	public void initAlgebra(){
		this.c.gridx = 3;
		this.c.gridy = 1;
		this.panel.add(this.module, this.c);

		this.c.gridx = 3;
		this.c.gridy = 2;
		this.panel.add(this.fat, this.c);

		this.c.gridx = 3;
		this.c.gridy = 3;
		this.panel.add(this.logdez, this.c);

		this.c.gridx = 3;
		this.c.gridy = 4;
		this.panel.add(this.log, this.c);

		this.c.gridx = 4;
		this.c.gridy = 1;
		this.panel.add(this.pow2, this.c);

		this.c.gridx = 4;
		this.c.gridy = 2;
		this.panel.add(this.pow3, this.c);

		this.c.gridx = 4;
		this.c.gridy = 3;
		this.panel.add(this.pown, this.c);

		this.c.gridx = 4;
		this.c.gridy = 4;
		this.panel.add(this.back, this.c);

		this.c.gridx = 5;
		this.c.gridy = 1;
		this.panel.add(this.sqrt2, this.c);

		this.c.gridx = 5;
		this.c.gridy = 2;
		this.panel.add(this.sqrt3, this.c);

		this.c.gridx = 5;
		this.c.gridy = 3;
		this.panel.add(this.sqrtn, this.c);

		this.c.gridx = 5;
		this.c.gridy = 4;
		this.panel.add(this.clear, this.c);
	}

	public void initNumeric(){
		this.c.gridx = 6;
		this.c.gridy = 1;
		this.panel.add(this.seven, this.c);

		this.c.gridx = 6;
		this.c.gridy = 2;
		this.panel.add(this.four, this.c);

		this.c.gridx = 6;
		this.c.gridy = 3;
		this.panel.add(this.one, this.c);

		this.c.gridx = 6;
		this.c.gridy = 4;
		this.panel.add(this.zero, this.c);

		this.c.gridx = 7;
		this.c.gridy = 1;
		this.panel.add(this.eight, this.c);

		this.c.gridx = 7;
		this.c.gridy = 2;
		this.panel.add(this.five, this.c);

		this.c.gridx = 7;
		this.c.gridy = 3;
		this.panel.add(this.two, this.c);

		this.c.gridx = 7;
		this.c.gridy = 4;
		this.panel.add(this.dot, this.c);

		this.c.gridx = 8;
		this.c.gridy = 1;
		this.panel.add(this.nine, this.c);

		this.c.gridx = 8;
		this.c.gridy = 2;
		this.panel.add(this.six, this.c);

		this.c.gridx = 8;
		this.c.gridy = 3;
		this.panel.add(this.tree, this.c);

		this.c.gridx = 8;
		this.c.gridy = 4;
		this.panel.add(this.equal, this.c);
	}

	public void initArit(){
		this.c.gridx = 9;
		this.c.gridy = 1;
		this.panel.add(this.soma, this.c);

		this.c.gridx = 9;
		this.c.gridy = 2;
		this.panel.add(this.sub, this.c);

		this.c.gridx = 9;
		this.c.gridy = 3;
		this.panel.add(this.mult, this.c);

		this.c.gridx = 9;
		this.c.gridy = 4;
		this.panel.add(this.div, this.c);
	}

	public void addLayoutToPane(Container pane, GridBagConstraints c){
		pane.setLayout(new GridBagLayout());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
	}

	public static void main(String[] args){
		CalcFrame cf = new CalcFrame();
	}

}