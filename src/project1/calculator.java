package project1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class calculator implements ActionListener {
	boolean isOperatorClicked=false;
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton threeButton;
	JButton twoButton;
	JButton oneButton;
	JButton zeroButton;
	JButton dotButton;
	JButton mButton;
	JButton pButton;
	JButton xButton;
	JButton eqButton;
	JButton divButton;
	JButton clearButton;
    String oldValue;
	private String operator;

	public calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(460, 600);
		jf.setLocation(300, 150);
	    displayLabel=new JLabel("");
		displayLabel.setBounds(30, 50, 300, 60);
		displayLabel.setBackground(Color.gray);
		displayLabel.setFont(new Font("Arial", Font.BOLD, 40));
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(sevenButton);
		eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.addActionListener(this);
		eightButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(eightButton);
	    nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.addActionListener(this);
	    nineButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(fourButton);
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(fiveButton);
		sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(sixButton);
		oneButton=new JButton("1");
		oneButton.setBounds(230, 330, 80, 80);
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(oneButton);
		twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(twoButton);
		threeButton=new JButton("3");
		threeButton.setBounds(30, 330, 80, 80);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(threeButton);
	
		dotButton=new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(dotButton);
		zeroButton=new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(zeroButton);
		eqButton=new JButton("=");
		eqButton.setBounds(230, 430, 80, 80);
		eqButton.addActionListener(this);
		eqButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(eqButton);
		
		divButton=new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.addActionListener(this);
		divButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(divButton);
		xButton=new JButton("x");
		xButton.setBounds(330, 230, 80, 80);
		xButton.addActionListener(this);
		xButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(xButton);
		mButton=new JButton("-");
		mButton.setBounds(330, 330, 80, 80);
		mButton.addActionListener(this);
		mButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(mButton);
		pButton=new JButton("+");
		pButton.setBounds(330, 430, 80, 80);
		pButton.addActionListener(this);
		pButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(pButton);
		clearButton=new JButton("C");
		clearButton.setBounds(330, 50, 80, 60);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(clearButton);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
public static void main(String[] args) {
	new calculator();
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==nineButton) {
		if(isOperatorClicked) {
			displayLabel.setText("9");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"9");
		}
		
	}else if (e.getSource()==eightButton) {
		if(isOperatorClicked) {
			displayLabel.setText("8");
			isOperatorClicked=false;
		}else{
			displayLabel.setText(displayLabel.getText()+"8");
		}
		
	}
	else if (e.getSource()==sevenButton) {
		if(isOperatorClicked) {
			displayLabel.setText("7");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"7");
		}
		
	}else if (e.getSource()==fourButton) {
		if(isOperatorClicked) {
			displayLabel.setText("4");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"4");
		}
		
	}else if (e.getSource()==fiveButton) {
		if(isOperatorClicked) {
			displayLabel.setText("5");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"5");
		}
		
	}else if (e.getSource()==sixButton) {
		if(isOperatorClicked) {
			displayLabel.setText("6");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"6");
		}
		
	}else if (e.getSource()==oneButton) {
		if(isOperatorClicked) {
			displayLabel.setText("1");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"1");
		}
		
	}else if (e.getSource()==twoButton) {
		if(isOperatorClicked) {
			displayLabel.setText("2");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"2");
		}
		
	}else if (e.getSource()==threeButton) {
		if(isOperatorClicked) {
			displayLabel.setText("3");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"3");
		}
		
	}else if (e.getSource()==zeroButton) {
		if(isOperatorClicked) {
			displayLabel.setText("0");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+"0");
		}
		
	}else if (e.getSource()==dotButton) {
		if(isOperatorClicked) {
			displayLabel.setText(".");
			isOperatorClicked=false;
		}else {
			displayLabel.setText(displayLabel.getText()+".");
		}
		
	}else if (e.getSource()==eqButton) {
		String newValue=displayLabel.getText();
		float oldValueF=Float.parseFloat(oldValue);
		float newValueF=Float.parseFloat(newValue);
		switch (operator) {
		case "+":
			float result=oldValueF+newValueF;
			displayLabel.setText(result+"");
			break;
		case "-":
			float result1=oldValueF-newValueF;
			displayLabel.setText(result1+"");
			break;
		case "*":
			float result2=oldValueF*newValueF;
			displayLabel.setText(result2+"");
			break;
		case "/":
			float result3=oldValueF/newValueF;
			displayLabel.setText(result3+"");
			break;		
	    }
		
		
		
	}else if (e.getSource()==mButton) {
		operator="-";
		isOperatorClicked=true;
		oldValue=displayLabel.getText();
		
	}else if (e.getSource()==pButton) {
		operator="+";
		isOperatorClicked=true;
		oldValue=displayLabel.getText();
		
	}else if (e.getSource()==xButton) {
		operator="*";
		isOperatorClicked=true;
		oldValue=displayLabel.getText();
		
	}else if (e.getSource()==divButton) {
		
		operator="/";
		isOperatorClicked=true;
		oldValue=displayLabel.getText();
	}else if (e.getSource()==clearButton) {
		displayLabel.setText("");
		
		
	}
	
}
}
