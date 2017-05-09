package main.java.gui;

import main.java.core.ReverseString;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 71903 on 2017/5/9.
 */
public class ReverseStringGui {
    private MyFrame frame;
    private MyLabel inputLabel;
    private MyLabel outputLabel;
    private MyTextField inputTextField;
    private MyTextField outputTextField;
    private MyButton button;


    private ReverseString sourceString;
    private String reverseString;

    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public void initReverseStringGui(){
        frame=new MyFrame(400,300,(int)(screenSize.width*0.3),(int)(screenSize.height*0.2));
        inputLabel=new MyLabel();
        outputLabel=new MyLabel();
        inputTextField=new MyTextField();
        outputTextField=new MyTextField();
        button=new MyButton();
        sourceString=new ReverseString();
        frame.setFrameTitle("字符串逆转");
        frame.setLayout(new GridLayout(3,3,3,3));
        inputLabel.setText("请输入字符串：");
        outputLabel.setText("逆转结果：");
        button.setText("字符串逆转");
    }

    public void eventReverseStringGui(){

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickEvent();
            }
        });


    }

    public void addReverseStringGui(){
        frame.add(inputLabel);
        frame.add(inputTextField);
        frame.add(outputLabel);
        frame.add(outputTextField);
        frame.add(button);
        frame.showFrame();
    }

    public void clickEvent(){
        sourceString.setSourceString(inputTextField.getText());
        reverseString=sourceString.getReverseString();
        outputTextField.setText(reverseString);
    }
}
