// structure/presentation-model/CalcV3.java 
//   Calculator with separation of presentation and model.
// Fred Swartz -- December 2004

// Program Organization: Separate View+Controller and Model


public class CalcV3 {
    public static void main(String[] args) {     
        
        CalcModel m = new CalcModel();
        CalcView v = new CalcView();
        v.setVisible(true);
        CalcController c = new CalcController(m, v);
        c.initController();
    }
}