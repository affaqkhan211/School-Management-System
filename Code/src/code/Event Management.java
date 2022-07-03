
import java.awt.event.*;
        import javax.swing.*;
public class ButtonExample {
    public static void main(String[] args) {
        JFrame f=new JFrame("Button Example");
        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);
        JButton b=new JButton("Click Here");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome to Javatpoint.");
            }
        });
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

public class Button 1{
    ButtonExample(){
        JFrame f=new JFrame("Button 1 ");
        JButton b=new JButton(new ImageIcon("D:\\icon.png"));
        b.setBounds(100,100,100, 40);
        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new ButtonExample();
    }
}
public class Button 2{
        ButtonExample(){
        JFrame f=new JFrame("Button 2 ");
        JButton b=new JButton(new ImageIcon("D:\\icon.png"));
        b.setBounds(100,100,100, 40);
        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
public static void main(String[] args) {
        new ButtonExample();
        }
        }
public class Button 3{
        ButtonExample(){
        JFrame f=new JFrame("Button 3 ");
        JButton b=new JButton(new ImageIcon("D:\\icon.png"));
        b.setBounds(100,100,100, 40);
        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
public static void main(String[] args) {
        new ButtonExample();
        }
        }
public class Button 4{
        ButtonExample(){
        JFrame f=new JFrame("Button 4");
        JButton b=new JButton(new ImageIcon("D:\\icon.png"));
        b.setBounds(100,100,100, 40);
        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
public static void main(String[] args) {
        new ButtonExample();
        }
        }
public class Button 5{
        ButtonExample(){
        JFrame f=new JFrame("Button 5 ");
        JButton b=new JButton(new ImageIcon("D:\\icon.png"));
        b.setBounds(100,100,100, 40);
        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
public static void main(String[] args) {
        new ButtonExample();
        }
        }
public static void main(String[] args) {
        JFrame f=new JFrame("Spinner ");
        SpinnerModel value =
        new SpinnerNumberModel(5, //initial value
        0, //minimum value
        10, //maximum value
        1); //step
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(100,100,50,30);
        f.add(spinner);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        }
        {
public static void main(String args[])
        {
        JFrame f= new JFrame("    ");
        JTextField t1,t2;
        t1=new JTextField("    ");
        t1.setBounds(50,100, 200,30);
        t2=new JTextField("     ");
        t2.setBounds(50,150, 200,30);
        f.add(t1); f.add(t2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        }
        }
        {
        JFrame frameObj;

// constructor
        GridLayout()
        {
        frameObj = new JFrame();

// creating 9 buttons
        JButton btn1 = new JButton(" 1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");


// adding buttons to the frame
// since, we are using the parameterless constructor, therfore;
// the number of columns is equal to the number of buttons we
// are adding to the frame. The row count remains one.
        frameObj.add(btn1); frameObj.add(btn2); frameObj.add(btn3);
        frameObj.add(btn4); frameObj.add(btn5); 

// setting the grid layout using the parameterless constructor
        frameObj.setLayout(new GridLayout());


        frameObj.setSize(300, 300);
        frameObj.setVisible(true);
        }

// main method
public static void main(String argvs[])
        {
        new GridLayoutExample();
        }
        }
        import java.awt.Container;
        import javax.swing.JFrame;
        import javax.swing.JLabel;
        import javax.swing.JTextField;
        import javax.swing.SpringLayout;
public class MySpringDemo {
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Add Event ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);

        JLabel label = new JLabel("Label: ");
        JTextField textField = new JTextField("enter Event", 15);
        contentPane.add(label);
        contentPane.add(textField);

        layout.putConstraint(SpringLayout.WEST, label,6,SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, label,6,SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, textField,6,SpringLayout.EAST, label);
        layout.putConstraint(SpringLayout.NORTH, textField,6,SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.EAST, contentPane,6,SpringLayout.EAST, textField);
        layout.putConstraint(SpringLayout.SOUTH, contentPane,6,SpringLayout.SOUTH, textField);

        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
public class TextAreaExample implements ActionListener{
    JLabel l1,l2;
    JTextArea area;
    JButton b;
    TextAreaExample() {
        JFrame f= new JFrame();
        l1=new JLabel();
        l1.setBounds(50,25,100,30);
        l2=new JLabel();
        l2.setBounds(160,25,100,30);
        area=new JTextArea();
        area.setBounds(20,75,250,200);
        b=new JButton("Add");
        b.setBounds(100,300,120,30);
        b.addActionListener(this);
        f.add(l1);f.add(l2);f.add(area);f.add(b);
        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String text=area.getText();
        String words[]=text.split("\\s");
        l1.setText("Words: "+words.length);
        l2.setText("Characters: "+text.length());
    }
    public static void main(String[] args) {
        new TextAreaExample();
    }
}
    JFrame f;
    TableExample(){
        f=new JFrame();
        String data[][]={ {"101","Amit","sports"},
                {"102","Jai","cultural "},
                {"101","Sachin","national"}};
        String column[]={"ID","NAME","Event"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TableExample();
    }
}