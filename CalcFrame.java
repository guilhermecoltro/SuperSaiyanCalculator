import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcFrame extends JFrame{

	public GridBagConstraints c = new GridBagConstraints();
	public JPanel panel = new JPanel();
	
	final static JTextField visor = new JTextField();
	final static double mem = 0;

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
		this.requestFocus();

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

		this.initBListeners();
		this.initKeyListeners();

		this.initVisor();
		this.initKeyboard();
	}

	public void initVisor(){
		this.visor.setEditable(false);
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
	/* ##$ FIM MONTAGEM INTERFÁCE GRÁFICA $## */

	/* ##$ INÍCIO INTERFÁCE LISTENERS $## */
		/* Actions */
			/* Numbers */
	public Action input_zero = new AbstractAction("input_zero"){
		public void actionPerformed(ActionEvent e){
			CalcFrame.visor.setText(CalcFrame.visor.getText()+"0");
		}
	};
	public Action input_one = new AbstractAction("input_one"){
		public void actionPerformed(ActionEvent e){
			CalcFrame.visor.setText(CalcFrame.visor.getText()+"1");
		}
	};
	public Action input_two = new AbstractAction("input_two"){
		public void actionPerformed(ActionEvent e){
			CalcFrame.visor.setText(CalcFrame.visor.getText()+"2");
		}
	};
	public Action input_tree = new AbstractAction("input_tree"){
		public void actionPerformed(ActionEvent e){
			CalcFrame.visor.setText(CalcFrame.visor.getText()+"3");
		}
	};
	public Action input_four = new AbstractAction("input_four"){
		public void actionPerformed(ActionEvent e){
			CalcFrame.visor.setText(CalcFrame.visor.getText()+"4");
		}
	};
	public Action input_five = new AbstractAction("input_five"){
		public void actionPerformed(ActionEvent e){
			CalcFrame.visor.setText(CalcFrame.visor.getText()+"5");
		}
	};
	public Action input_six = new AbstractAction("input_six"){
		public void actionPerformed(ActionEvent e){
			CalcFrame.visor.setText(CalcFrame.visor.getText()+"6");
		}
	};
	public Action input_seven = new AbstractAction("input_seven"){
		public void actionPerformed(ActionEvent e){
			CalcFrame.visor.setText(CalcFrame.visor.getText()+"7");
		}
	};
	public Action input_eight = new AbstractAction("input_eight"){
		public void actionPerformed(ActionEvent e){
			CalcFrame.visor.setText(CalcFrame.visor.getText()+"8");
		}
	};
	public Action input_nine = new AbstractAction("input_nine"){
		public void actionPerformed(ActionEvent e){
			CalcFrame.visor.setText(CalcFrame.visor.getText()+"9");
		}
	};
			/* Aritméticas */
	public Action input_soma = new AbstractAction("input_soma"){
		public void actionPerformed(ActionEvent e){
			CalcFrame.visor.setText(CalcFrame.visor.getText()+" + ");
		}
	};
	public Action input_sub = new AbstractAction("input_sub"){
		public void actionPerformed(ActionEvent e){
			CalcFrame.visor.setText(CalcFrame.visor.getText()+" - ");
		}
	};
	public Action input_mult = new AbstractAction("input_mult"){
		public void actionPerformed(ActionEvent e){
			CalcFrame.visor.setText(CalcFrame.visor.getText()+"*");
		}
	};
	public Action input_div = new AbstractAction("input_div"){
		public void actionPerformed(ActionEvent e){
			CalcFrame.visor.setText(CalcFrame.visor.getText()+"/");
		}
	};
	public Action input_dot = new AbstractAction("input_dot"){
		public void actionPerformed(ActionEvent e){
			CalcFrame.visor.setText(CalcFrame.visor.getText()+".");
		}
	};

	/* JButtons Listener */
	public void initBListeners(){
		/* Numbers */
		zero.addActionListener(this.input_zero);
		one.addActionListener(this.input_one);
		two.addActionListener(this.input_two);
		tree.addActionListener(this.input_tree);
		four.addActionListener(this.input_four);
		five.addActionListener(this.input_five);
		six.addActionListener(this.input_six);
		seven.addActionListener(this.input_seven);
		eight.addActionListener(this.input_eight);
		nine.addActionListener(this.input_nine);

		/* Aritméticas */
		soma.addActionListener(this.input_soma);
		sub.addActionListener(this.input_sub);
		mult.addActionListener(this.input_mult);
		div.addActionListener(this.input_div);
	}

	/* Interface KeyListener */
		/* Numbers */
	public KeyStroke ks_zero = KeyStroke.getKeyStroke(KeyEvent.VK_0, 0);
	public KeyStroke ks_one = KeyStroke.getKeyStroke(KeyEvent.VK_1, 0);
	public KeyStroke ks_two = KeyStroke.getKeyStroke(KeyEvent.VK_2, 0);
	public KeyStroke ks_tree = KeyStroke.getKeyStroke(KeyEvent.VK_3, 0);
	public KeyStroke ks_four = KeyStroke.getKeyStroke(KeyEvent.VK_4, 0);
	public KeyStroke ks_five = KeyStroke.getKeyStroke(KeyEvent.VK_5, 0);
	public KeyStroke ks_six = KeyStroke.getKeyStroke(KeyEvent.VK_6, 0);
	public KeyStroke ks_seven = KeyStroke.getKeyStroke(KeyEvent.VK_7, 0);
	public KeyStroke ks_eight = KeyStroke.getKeyStroke(KeyEvent.VK_8, 0);
	public KeyStroke ks_nine = KeyStroke.getKeyStroke(KeyEvent.VK_9, 0);

		/* Aritmeticas */
	public KeyStroke ks_soma = KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, KeyEvent.SHIFT_DOWN_MASK);
	public KeyStroke ks_sub = KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, 0);
	public KeyStroke ks_mult = KeyStroke.getKeyStroke(KeyEvent.VK_8, KeyEvent.SHIFT_DOWN_MASK);
	public KeyStroke ks_div = KeyStroke.getKeyStroke(KeyEvent.VK_SLASH, 0);
	public KeyStroke ks_dot = KeyStroke.getKeyStroke(KeyEvent.VK_PERIOD, 0);
	public KeyStroke ks_comma = KeyStroke.getKeyStroke(KeyEvent.VK_COMMA, 0);

	/* Numeric Keyboard */
	public KeyStroke ksnp_zero = KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD0, 0);
	public KeyStroke ksnp_one = KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1, 0);
	public KeyStroke ksnp_two = KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2, 0);
	public KeyStroke ksnp_tree = KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3, 0);
	public KeyStroke ksnp_four = KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4, 0);
	public KeyStroke ksnp_five = KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5, 0);
	public KeyStroke ksnp_six = KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6, 0);
	public KeyStroke ksnp_seven = KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7, 0);
	public KeyStroke ksnp_eight = KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8, 0);
	public KeyStroke ksnp_nine = KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9, 0);
	public KeyStroke ksnp_soma = KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0);
	public KeyStroke ksnp_sub = KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0);
	public KeyStroke ksnp_mult = KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0);
	public KeyStroke ksnp_div = KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0);
	public KeyStroke ksnp_dot = KeyStroke.getKeyStroke(KeyEvent.VK_DECIMAL, 0);
	public KeyStroke ksnp_comma = KeyStroke.getKeyStroke(KeyEvent.VK_SEPARATOR, 0);

	public void initKeyListeners(){
		this.generateActionMap();
		this.generateInputMap();
	}

	public void generateActionMap(){
		/* Numbers */
		this.panel.getActionMap().put("input_zero", this.input_zero);
		this.panel.getActionMap().put("input_one", this.input_one);
		this.panel.getActionMap().put("input_two", this.input_two);
		this.panel.getActionMap().put("input_tree", this.input_tree);
		this.panel.getActionMap().put("input_four", this.input_four);
		this.panel.getActionMap().put("input_five", this.input_five);
		this.panel.getActionMap().put("input_six", this.input_six);
		this.panel.getActionMap().put("input_seven", this.input_seven);
		this.panel.getActionMap().put("input_eight", this.input_eight);
		this.panel.getActionMap().put("input_nine", this.input_nine);

		this.panel.getActionMap().put("input_soma", this.input_soma);
		this.panel.getActionMap().put("input_sub", this.input_sub);
		this.panel.getActionMap().put("input_mult", this.input_mult);
		this.panel.getActionMap().put("input_div", this.input_div);
		this.panel.getActionMap().put("input_dot", this.input_dot);
	}

	public void generateInputMap(){
		/* Numbers */
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ks_zero, "input_zero");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ks_one, "input_one");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ks_two, "input_two");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ks_tree, "input_tree");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ks_four, "input_four");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ks_five, "input_five");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ks_six, "input_six");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ks_seven, "input_seven");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ks_eight, "input_eight");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ks_nine, "input_nine");

		/* Aritmeticas */
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ks_soma, "input_soma");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ks_sub, "input_sub");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ks_mult, "input_mult");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ks_div, "input_div");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ks_dot, "input_dot");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ks_comma, "input_dot");

		/* Numeric KeyBoard */
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ksnp_zero, "input_zero");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ksnp_one, "input_one");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ksnp_two, "input_two");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ksnp_tree, "input_tree");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ksnp_four, "input_four");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ksnp_five, "input_five");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ksnp_six, "input_six");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ksnp_seven, "input_seven");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ksnp_eight, "input_eight");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ksnp_nine, "input_nine");

		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ksnp_soma, "input_soma");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ksnp_sub, "input_sub");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ksnp_mult, "input_mult");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ksnp_div, "input_div");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ksnp_dot, "input_dot");
		this.panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(this.ksnp_comma, "input_dot");
	}

	/* Teste */
	public static void main(String[] args){
		CalcFrame cf = new CalcFrame();
	}

}

/*
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
*/