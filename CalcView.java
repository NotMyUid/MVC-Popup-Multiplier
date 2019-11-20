// structure/presentation-model/CalcViewController.java
// Fred Swartz - December 2004.

// GUI Organization - GUI independent of model.
// 
//     GUI subclasses JFrame and builds it in the constructor.
//
//     The GUI creates a calculator model object, but knows nothing 
//     about the internal implementation of the calculator.

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class CalcView extends JFrame {
    
    
    //========================================================= instance vars

    
    //... Components
    JPanel content = new JPanel();
    private JTextField m_userInputTf = new JTextField(5);
	private JTextField m_totalTf     = new JTextField(20);
    private JButton    m_multiplyBtn = new JButton("Multiply");
    private JButton    m_clearBtn    = new JButton("Clear");
    
    //=========================================================== constructor
    /** Constructor */
    CalcView() {
        
        //... Layout the components.        
        //JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Input"));
        content.add(m_userInputTf);
        content.add(m_multiplyBtn);
        content.add(new JLabel("Total"));
        content.add(m_totalTf);
        content.add(m_clearBtn);
        
        
        
        //... finalize layout and set window parameters.
        this.setContentPane(content);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Simple Calc - Presentation-Model");
    }//end constructor
    
    //...getters and setters
    
	public JTextField getM_userInputTf() {
		return m_userInputTf;
	}

	public void setM_userInputTf(JTextField m_userInputTf) {
		this.m_userInputTf = m_userInputTf;
	}

	public JTextField getM_totalTf() {
		return m_totalTf;
	}

	public void setM_totalTf(JTextField m_totalTf) {
		this.m_totalTf = m_totalTf;
	}

	public JButton getM_multiplyBtn() {
		return m_multiplyBtn;
	}

	public void setM_multiplyBtn(JButton m_multiplyBtn) {
		this.m_multiplyBtn = m_multiplyBtn;
	}

	public JButton getM_clearBtn() {
		return m_clearBtn;
	}

	public void setM_clearBtn(JButton m_clearBtn) {
		this.m_clearBtn = m_clearBtn;
	}
    
}