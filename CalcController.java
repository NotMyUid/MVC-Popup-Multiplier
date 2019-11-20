import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class CalcController {
	 //============================================================= Constants
     private static final String INITIAL_VALUE = "1";
     
	 private CalcModel m_logic;
	 private CalcView view;
	 
	 public CalcController(CalcModel m, CalcView v) {
	  m_logic = m;
	  view = v;
	  initView();
	 }
	 
	 
	 public void initView() {
	    m_logic.setValue(INITIAL_VALUE);
	     //... Initialize components
        view.getM_totalTf().setText(m_logic.getValue());
        view.getM_totalTf().setEditable(false);
        
     
	 }
	 
	 public void initController() {
		//... Add button listeners.
        view.getM_multiplyBtn().addActionListener(new MultiplyListener());
        view.getM_clearBtn().addActionListener(new ClearListener());
	 }
	 
	//////////////////////////////////////////inner class MultiplyListener
	/** When a multiplication is requested.
	*  1. Get the user input number.
	*  2. Call the model to mulitply by this number.
	*  3. Get the result from the Model.
	*  4. Set the Total textfield to this result.
	* If there was an error, display it in a JOptionPane.
	*/
	class MultiplyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		String userInput = "";
		try {
			userInput = view.getM_userInputTf().getText();
			m_logic.multiplyBy(userInput);
			view.getM_totalTf().setText(m_logic.getValue());
		} catch (NumberFormatException nfex) {
			JOptionPane.showMessageDialog(view, 
			    "Bad input: '" + userInput + "'");
			}
		}
	}//end inner class MultiplyListener
	
	
	//////////////////////////////////////////// inner class ClearListener
	/**  1. Reset model.
	*   2. Put model's value into Total textfield.
	*/    
	class ClearListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		m_logic.reset();
		view.getM_totalTf().setText(m_logic.getValue());
		}
	}

}
