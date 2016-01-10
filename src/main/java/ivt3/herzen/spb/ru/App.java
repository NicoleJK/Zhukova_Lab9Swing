package ivt3.herzen.spb.ru;
//Выполнила Жукова Николь
import javax.swing.*;
import java.awt.*;
public class App extends JFrame {
                JTextArea display= new JTextArea("Результат");
                JPanel buttonPanel = new JPanel(new GridLayout(5,4));
                JButton button0 = new JButton("0");
                JButton button1 = new JButton("1");
                JButton button2 = new JButton("2");
                JButton button3 = new JButton("3");
                JButton button4 = new JButton("4");
                JButton button5 = new JButton("5");
                JButton button6 = new JButton("6");
                JButton button7 = new JButton("7");
                JButton button8 = new JButton("8");
                JButton button9 = new JButton("9");
                JButton buttonAdd = new JButton("+");
                JButton buttonDot = new JButton(".");
                JButton buttonDiv = new JButton("/");
                JButton buttonSub = new JButton("-");
                JButton buttonMult = new JButton("*");
                JButton buttonEq = new JButton("=");
                JButton buttonPlMn = new JButton("+/-");
                JButton buttonPr = new JButton("%");
                JButton buttonDel = new JButton("C");
                JButton buttonErase = new JButton("CE");

        public App(){
                setLayout(new BorderLayout());
                add(display, BorderLayout.NORTH);
                display.setEditable(false);
                add(buttonPanel, BorderLayout.CENTER);
                buttonPanel.add(button9);
                buttonPanel.add(button8);
                buttonPanel.add(button7);
                buttonPanel.add(buttonAdd);
                buttonPanel.add(button4);
                buttonPanel.add(button5);
                buttonPanel.add(button6);
                buttonPanel.add(buttonSub);
                buttonPanel.add(button1);
                buttonPanel.add(button2);
                buttonPanel.add(button3);
                buttonPanel.add(buttonMult);
                buttonPanel.add(buttonPlMn);
                buttonPanel.add(button0);
                buttonPanel.add(buttonDot);
                buttonPanel.add(buttonDiv);
                buttonPanel.add(buttonDel);
                buttonPanel.add(buttonErase);
                buttonPanel.add(buttonPr);
                buttonPanel.add(buttonEq);
            setSize(400, 400);
            setResizable(false);
            setTitle("Swing");
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);

    }
    public static void main( String[] args )
    {
        new App() ;
    }
}


