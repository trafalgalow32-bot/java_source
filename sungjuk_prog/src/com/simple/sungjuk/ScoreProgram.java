package com.simple.sungjuk;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

class Student {
    private String name;
    private int kor, eng, math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("이름을 입력하세요.");
        this.name = name;
    }

    public void setKor(int kor) {
        if (kor < 0 || kor > 100)
            throw new IllegalArgumentException("점수 범위가 맞지 않습니다.");
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }

    public Object[] toRow() {
        return new Object[]{
                name, kor, eng, math,
                getTotal(), String.format("%.2f", getAverage()), getGrade()
        };
    }

    public class ScoreProgram extends JFrame {
        private JTextField nameField, korField, engField, mathField;
        private JTable table;
        private DefaultTableModel model;

        private ArrayList<Student> students = new ArrayList<>();

        public ScoreProgram() throws HeadlessException {
            setTitle("성적 처리 프로그램");
            setSize(700, 400);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            // 입력 패널
            JPanel inputPanel = new JPanel(new GridLayout(4, 2));
            inputPanel.add(new JLabel("이름 :"));
            nameField = new JTextField(5);
            inputPanel.add(nameField);

            inputPanel.add(new JLabel("국어 :"));
            korField = new JTextField(5);
            inputPanel.add(korField);

            inputPanel.add(new JLabel("영어 :"));
            engField = new JTextField(5);
            inputPanel.add(engField);

            inputPanel.add(new JLabel("수학 :"));
            mathField = new JTextField(5);
            inputPanel.add(mathField);

            // 패널을 윈도우에 등록
            add(inputPanel,BorderLayout.NORTH);

            // 윈도우 활성화
            setVisible(true);
        }

        }

    public static void main(String[] args) {
        new ScoreProgram();
    }
}
